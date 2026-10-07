#!/usr/bin/env python3
"""Local data helpers recovered from the Namso Gen Android client."""

from __future__ import annotations

import argparse
import json
import re
import secrets
import sys
import uuid
from pathlib import Path
from typing import Any, Sequence


MAIL_DOMAINS = (
    "catchmail.io",
    "mailistry.com",
    "zeppost.com",
    "ctmip.net",
)
MAIL_USERNAME_RE = re.compile(r"^[a-zA-Z0-9._-]{3,30}$")
WORLD_FIELDS = (
    "pais",
    "estado",
    "ciudad",
    "direccion",
    "codigo_postal",
    "telefono",
)


def compose_email(username: str | None = None, domain: str | None = None) -> str:
    """Compose an address, following x2's fixed or generated username paths."""
    if username is None:
        local = "user" + uuid.uuid4().hex[:8]
        chosen_domain = domain if domain is not None else secrets.choice(MAIL_DOMAINS)
    else:
        local = username.strip()
        if not MAIL_USERNAME_RE.fullmatch(local):
            raise ValueError("usuario inválido: usa 3–30 caracteres alfanuméricos, '.', '_' o '-'.")
        chosen_domain = domain if domain is not None else MAIL_DOMAINS[2]

    if chosen_domain not in MAIL_DOMAINS:
        raise ValueError("dominio inválido; consulta mail-domains para ver las opciones.")
    return f"{local}@{chosen_domain}"


def select_world_records(
    dataset_path: str | Path, country: str, count: int = 1
) -> list[dict[str, str]]:
    """Select count records and cycle within country, like h3.z.d0 per call."""
    if count <= 0:
        raise ValueError("N debe ser un entero mayor que cero.")
    try:
        with Path(dataset_path).open("r", encoding="utf-8") as source:
            dataset: Any = json.load(source)
    except OSError as exc:
        raise ValueError(f"no se pudo leer el dataset: {exc}") from exc
    except json.JSONDecodeError as exc:
        raise ValueError(f"JSON inválido en el dataset: {exc}") from exc

    if not isinstance(dataset, dict):
        raise ValueError("el dataset debe ser un objeto JSON con claves de país.")
    if country not in dataset:
        raise ValueError(f"país no encontrado en el dataset: {country}")
    rows = dataset[country]
    if not isinstance(rows, list) or not rows:
        raise ValueError(f"el país no contiene registros: {country}")

    result: list[dict[str, str]] = []
    for index in range(count):
        row = rows[index % len(rows)]
        if not isinstance(row, dict):
            raise ValueError(f"el registro {index % len(rows)} de {country} no es un objeto JSON.")
        result.append({
            field: _display_value(row.get(field))
            for field in WORLD_FIELDS
        })
    return result


def _display_value(value: Any) -> str:
    if value is None:
        return "N/A"
    if isinstance(value, str):
        return value
    if isinstance(value, (int, float, bool)):
        return json.dumps(value, ensure_ascii=False)
    return json.dumps(value, ensure_ascii=False, separators=(",", ":"))


def _parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(
        description="Herramientas locales de correo y selección de datos de país."
    )
    subparsers = parser.add_subparsers(dest="command", required=True)

    subparsers.add_parser("mail-domains", help="muestra los dominios del APK")

    mail = subparsers.add_parser("mail-compose", help="compone una dirección; sin usuario genera uno aleatorio")
    mail.add_argument("--username", help="usuario (3–30 caracteres permitidos por la app)")
    mail.add_argument("--domain", choices=MAIL_DOMAINS, help="dominio; usuario aleatorio elige uno si se omite")

    world = subparsers.add_parser("world-select", help="selecciona registros existentes del dataset local")
    world.add_argument("--file", required=True, help="ruta al dataset JSON obtenido aparte")
    world.add_argument("--country", required=True, help="clave exacta del país en el JSON")
    world.add_argument("-n", type=int, default=1, help="cantidad de registros (por defecto: 1)")
    return parser


def main(argv: Sequence[str] | None = None) -> int:
    args = _parser().parse_args(sys.argv[1:] if argv is None else list(argv))
    try:
        if args.command == "mail-domains":
            print("\n".join(MAIL_DOMAINS))
        elif args.command == "mail-compose":
            print(compose_email(args.username, args.domain))
        elif args.command == "world-select":
            records = select_world_records(args.file, args.country, args.n)
            for record in records:
                print(json.dumps(record, ensure_ascii=False))
    except ValueError as exc:
        print(f"error: {exc}", file=sys.stderr)
        return 2
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
