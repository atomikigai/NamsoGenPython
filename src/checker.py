#!/usr/bin/env python3
"""Terminal replay of the recoverable Namso 11.23 checker flow.

`replay` is offline and intended for synthetic examples. `run` uses the
recovered status and BIN clients and never saves shared statuses unless the
caller explicitly passes --allow-write.
"""
from __future__ import annotations

import argparse
from datetime import date
import json
from pathlib import Path
import random
import re
import sys
import time

import firebase_config
import namso
from remote import RemoteClient, RemoteError


LINE = re.compile(r"^(\d{13,16})\|(\d{2})\|(\d{4})\|(\d{3,4})$")


class CheckerError(ValueError):
    """Safe terminal error."""


class _FixedDraw:
    def __init__(self, value: int):
        self.value = value

    def randrange(self, stop: int) -> int:
        if stop != 100:
            raise ValueError("draw fixture expects range 0..99")
        return self.value


def normalize(line: str) -> str:
    """Mirror the visible UI cleanup: trim, spaces to pipes, drop non-ASCII."""
    line = namso.kotlin_trim(line).replace(" ", "|")
    return "".join(char for char in line if ord(char) < 128)


def parse_card(line: str) -> tuple[str, int, int]:
    normalized = normalize(line)
    match = LINE.fullmatch(normalized)
    if not match:
        raise CheckerError("formato inválido; se esperaba PAN|MM|AAAA|CVV")
    month, year = int(match.group(2)), int(match.group(3))
    if not 1 <= month <= 12:
        raise CheckerError("mes fuera del rango observado 01..12")
    if not 2000 <= year <= 2100:
        raise CheckerError("año fuera del rango observado 2000..2100")
    return normalized, month, year


def _expired(month_text: str, year_text: str, today: tuple[int, int]) -> bool:
    """Use h3.e1.o0 semantics: unparseable month/year counts as expired."""
    return namso.is_expired(month_text, year_text, today)


def classify(line: str, *, bin_ok: bool, premium: bool, gate: str | None,
             today: tuple[int, int], draw: int | None = None) -> str:
    """Call the ported h0 classifier with deterministic draw injection."""
    if draw is not None and not 0 <= draw <= 99:
        raise CheckerError("draw debe estar entre 0 y 99")
    rng = _FixedDraw(draw) if draw is not None else random
    gate_config = namso.gate_config(gate) if premium and gate and namso.kotlin_trim(gate) else None
    pct = gate_config["livePct"] if gate_config else None
    return namso.classify_card(line, bin_ok, premium, pct, today, rng)


def _load_json(path: Path, description: str) -> dict:
    try:
        value = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, UnicodeError, json.JSONDecodeError):
        raise CheckerError(f"No se pudo leer {description} como JSON.") from None
    if not isinstance(value, dict):
        raise CheckerError(f"{description} debe ser un objeto JSON.")
    return value


def _today(value: str | None) -> tuple[int, int]:
    if value is None:
        current = date.today()
        return current.year, current.month
    if not re.fullmatch(r"\d{4}-\d{2}", value):
        raise CheckerError("today debe tener formato YYYY-MM")
    try:
        current = date.fromisoformat(value + "-01")
    except ValueError:
        raise CheckerError("today no es una fecha válida") from None
    return current.year, current.month


def _server_entry(response: dict) -> tuple[str | None, int | None]:
    raw_status = response.get("status")
    status = None if raw_status is None else _json_string(raw_status)
    timestamp = None
    raw_timestamp = response.get("t")
    if raw_timestamp is not None:
        timestamp = _opt_long(raw_timestamp)
    return status, timestamp


def _json_string(value: object) -> str:
    """JSONObject.optString coercion for non-null JSON values."""
    if isinstance(value, bool):
        return "true" if value else "false"
    if isinstance(value, (dict, list)):
        return json.dumps(value, ensure_ascii=False, separators=(",", ":"))
    return str(value)


def _opt_long(value: object) -> int:
    """JSONObject.optLong conversion (decimal strings parse as Double)."""
    limit_low, limit_high = -(1 << 63), (1 << 63) - 1
    if isinstance(value, bool):
        return 0
    try:
        number = float(value) if isinstance(value, str) else value
        if isinstance(number, int):
            return min(limit_high, max(limit_low, number))
        if isinstance(number, float):
            if number != number:
                return 0
            if number >= limit_high:
                return limit_high
            if number <= limit_low:
                return limit_low
            return int(number)
    except (TypeError, ValueError, OverflowError):
        pass
    return 0


def _make_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(description=__doc__)
    commands = parser.add_subparsers(dest="command", required=True)

    replay = commands.add_parser("replay", help="Reproduce una rama con fixtures locales; no usa red")
    replay.add_argument("--card", required=True, help="registro sintético PAN|MM|AAAA|CVV")
    replay.add_argument("--gate", help="nombre hipotético o cargado de gate")
    replay.add_argument("--premium", action="store_true")
    replay.add_argument("--today", help="mes local YYYY-MM")
    replay.add_argument("--now-ms", type=int, help="reloj sintético Unix ms")
    response = replay.add_mutually_exclusive_group()
    response.add_argument("--response-file", type=Path, help="fixture get_status {status,t}")
    response.add_argument("--server-unavailable", action="store_true", help="simula fallo get_status")
    bin_response = replay.add_mutually_exclusive_group()
    bin_response.add_argument("--bin-response-file", type=Path, help="objeto JSON fixture del lookup BIN")
    bin_response.add_argument("--bin-unavailable", action="store_true", help="simula fallo/JSON inválido del BIN")
    replay.add_argument("--draw", type=int, choices=range(100), help="resultado sintético de tirada 0..99")

    commands.add_parser("catalog", help="lista gates Premium de la caché Firebase local")

    run = commands.add_parser("run", help="Procesa un archivo secuencialmente con endpoints recuperados")
    run.add_argument("--file", type=Path, required=True, help="un registro por línea")
    run.add_argument("--gate", help="gate Premium elegido desde Firebase Remote Config")
    run.add_argument("--premium", action="store_true")
    run.add_argument("--allow-write", action="store_true", help="autoriza checker-save compartido")
    run.add_argument("--no-delay", action="store_true", help="omite pausas de 5–7,5 s de la UI")
    return parser


def _replay(args: argparse.Namespace) -> int:
    card, month, year = parse_card(args.card)
    today = _today(args.today)
    now_ms = int(time.time() * 1000) if args.now_ms is None else args.now_ms
    if _expired(str(month), str(year), today):
        print(json.dumps({"status": "ERROR", "branch": "expired-before-cache",
                          "write_intent": False, "network": False}, ensure_ascii=False))
        return 0

    status, timestamp = None, None
    server_failed = args.server_unavailable
    if args.response_file:
        status, timestamp = _server_entry(_load_json(args.response_file, "response-file"))
    if server_failed:
        result = classify(card, bin_ok=True, premium=args.premium, gate=args.gate,
                          today=today, draw=args.draw)
        branch = "server-unavailable-local-fallback-bin-assumed-valid"
        write_intent = False
    elif status is not None and status != "LIVE":
        result = status
        branch = "cached-non-live-status"
        write_intent = False
    elif status == "LIVE" and timestamp is not None:
        config = (namso.gate_config(args.gate)
                  if args.premium and args.gate and namso.kotlin_trim(args.gate) and
                  args.gate != "GRATIS" else None)
        if not args.premium:
            config = None
        stored = {"status": status, "t": timestamp}
        if namso.live_still_alive(card, timestamp, now_ms, config):
            result = "LIVE"
            branch = "cached-live-within-age-window"
            write_intent = False
        else:
            result = "DIED"
            branch = "cached-live-aged-out"
            write_intent = stored["status"] != result
    else:
        bin_ok = bool(args.bin_response_file and not args.bin_unavailable)
        if args.bin_response_file:
            # h3.e1.s0 succeeds for a JSONObject whose optString fields are non-null.
            _load_json(args.bin_response_file, "bin-response-file")
        result = classify(card, bin_ok=bin_ok, premium=args.premium, gate=args.gate,
                          today=today, draw=args.draw)
        branch = "bin-lookup-and-local-classifier"
        write_intent = result != status
    print(json.dumps({"status": result, "branch": branch, "write_intent": write_intent,
                      "network": False, "card": "[omitted]"}, ensure_ascii=False))
    return 0


def _cached_gates() -> list[str]:
    try:
        result = firebase_config.cached_gates()
    except firebase_config.ConfigError:
        raise CheckerError("No hay catálogo local. Ejecuta `python src/firebase_config.py fetch`.") from None
    if result["gate_config"] != "present":
        raise CheckerError("premium_gates3 no está disponible en la caché local.")
    return result["gates"]


def _require_premium(gate: str | None) -> None:
    if not gate:
        raise CheckerError("Premium requiere --gate con un gate del catálogo Firebase.")
    if gate not in _cached_gates():
        raise CheckerError("El gate no aparece en premium_gates3 local.")
    try:
        from auth import get_id_token, AuthError
        get_id_token()
    except ImportError:
        raise CheckerError("No está disponible el módulo de sesión Firebase.") from None
    except AuthError:
        raise CheckerError("Premium requiere una sesión Firebase local válida.") from None


def _prepare_batch(path: Path) -> list[str]:
    try:
        lines = path.read_text(encoding="utf-8").split("\n")
    except (OSError, UnicodeError):
        raise CheckerError("No se pudo leer el archivo de entrada UTF-8.") from None
    cards = []
    for number, original in enumerate(lines, 1):
        cleaned = normalize(original)
        if not cleaned:
            continue
        try:
            card, _, _ = parse_card(cleaned)
        except CheckerError as exc:
            raise CheckerError(f"línea {number}: {exc}") from None
        cards.append(card)
    if not cards:
        raise CheckerError("El archivo no contiene registros.")
    return cards


def _remote_run(args: argparse.Namespace) -> int:
    cards = _prepare_batch(args.file)
    premium = args.premium or args.gate is not None
    if premium:
        _require_premium(args.gate)
        gate = args.gate
    else:
        gate = "GRATIS"
    client = RemoteClient(allow_write=args.allow_write)
    today_value = date.today()
    today = (today_value.year, today_value.month)
    cache: dict[str, tuple[str | None, int | None]] = {}
    for index, card in enumerate(cards):
        _, month, year = parse_card(card)
        if _expired(str(month), str(year), today):
            if not args.no_delay:
                time.sleep(random.randrange(5000, 7500) / 1000)
            status = "ERROR"
            branch = "expired-before-cache"
        else:
            server_failed = False
            if card in cache:
                old_status, old_timestamp = cache[card]
            else:
                try:
                    response = client.execute("checker-get", {"gate": gate, "card": card})
                    if client.last_response_is_object is False:
                        raise RemoteError("Respuesta checker no es un objeto JSON.")
                    old_status, old_timestamp = _server_entry(response)
                    cache[card] = (old_status, old_timestamp)
                except RemoteError:
                    old_status, old_timestamp = None, None
                    server_failed = True
            if not args.no_delay:
                time.sleep(random.randrange(5000, 7500) / 1000)
            if server_failed:
                status = classify(card, bin_ok=True, premium=premium, gate=gate, today=today)
                branch = "server-unavailable-local-fallback-bin-assumed-valid"
                print(f"{index + 1}: {status} [{branch}; write_intent=false]")
                continue

            config = (namso.gate_config(gate)
                      if premium and gate and namso.kotlin_trim(gate) and gate != "GRATIS" else None)
            if old_status is not None and old_status != "LIVE":
                status = old_status
                branch = "cached-non-live-status"
            elif old_status == "LIVE" and old_timestamp is not None:
                if namso.live_still_alive(card, old_timestamp, int(time.time() * 1000), config):
                    status = "LIVE"
                    branch = "cached-live-within-age-window"
                else:
                    status = "DIED"
                    branch = "cached-live-aged-out"
            else:
                try:
                    bin_value = "".join(char for char in card.split("|", 1)[0] if char.isdigit())[:6]
                    client.execute("bin-lookup", {"bin": bin_value})
                    bin_ok = client.last_response_is_object is True
                except RemoteError:
                    bin_ok = False
                status = classify(card, bin_ok=bin_ok, premium=premium, gate=gate, today=today)
                branch = "bin-lookup-and-local-classifier"

            if status != old_status:
                cache[card] = (status, int(time.time() * 1000))
                if args.allow_write:
                    try:
                        client.execute("checker-save", {"gate": gate, "card": card, "status": status})
                        write_result = "saved"
                    except RemoteError:
                        write_result = "failed"
                else:
                    write_result = "write_intent"
            else:
                write_result = "none"
        suffix = "" if branch == "expired-before-cache" else f" [{branch}; {write_result}]"
        print(f"{index + 1}: {status}{suffix}")
    return 0


def main(argv: list[str] | None = None) -> int:
    parser = _make_parser()
    args = parser.parse_args(argv)
    try:
        if args.command == "catalog":
            print(json.dumps({"gates": _cached_gates()}, ensure_ascii=False, indent=2))
            return 0
        if args.command == "replay":
            return _replay(args)
        return _remote_run(args)
    except CheckerError as exc:
        print("error: " + str(exc), file=sys.stderr)
        return 1
    except RemoteError as exc:
        print("error: " + str(exc), file=sys.stderr)
        return 1


if __name__ == "__main__":
    raise SystemExit(main())
