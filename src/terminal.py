"""CLI de terminal: herramientas locales (namso.py), persistencia (storage.py) y catálogo remoto (remote.py)."""

from __future__ import annotations

import argparse
import json
import os
import re
import sys
import time
from typing import Any

import namso
import storage

SENSITIVE = re.compile(
    r"token|secret|passw|authorization|cookie|api[_-]?key|credential|session|jwt|bearer", re.I
)

# (nombre, ayuda, [(prompt, clave, tipo, defecto)]); tipo: pos | opt:--flag | flag:--flag
LOCAL_TOOLS = [
    ("gen-card", "genera PAN|MM|AAAA|CVV con Luhn", [
        ("BIN (x = dígito aleatorio)", "bin", "pos", ""),
        ("Cantidad", "-n", "opt:-n", "5"),
        ("Mes MM (vacío = aleatorio)", "month", "opt:--month", ""),
        ("Año AAAA (vacío = aleatorio)", "year", "opt:--year", ""),
        ("CVV fijo (vacío = aleatorio)", "cvv", "opt:--cvv", ""),
    ]),
    ("check", "clasificación offline LIVE/DIED/ERROR", [
        ("Tarjetas PAN|MM|AAAA|CVV separadas por espacio", "card", "pos+", ""),
        ("¿Premium? (s/N)", "premium", "flag:--premium", ""),
        ("Gate (vacío = ninguno)", "gate", "opt:--gate", ""),
        ("AAAA-MM de referencia (vacío = hoy)", "today", "opt:--today", ""),
    ]),
    ("gate", "configuración de gate sembrada", [("Nombre del gate", "name", "pos", "")]),
    ("iban", "IBAN sintético ES/DE/IT/FR", [
        ("País (ES/DE/IT/FR)", "country", "pos", "ES"),
        ("Cantidad", "-n", "opt:-n", "1"),
    ]),
    ("cpf", "CPF sintético", [("Cantidad", "-n", "opt:-n", "1")]),
    ("password", "contraseña aleatoria", [("Longitud", "length", "pos", "12")]),
    ("mail-dots", "variantes de correo con puntos", [
        ("Parte local", "local", "pos", ""),
        ("Dominio", "domain", "opt:--domain", "gmail.com"),
        ("Cantidad", "-n", "opt:-n", "5"),
    ]),
]

# (grupo, acción) -> (método de Storage, claves requeridas)
STORAGE_OPS = {
    ("notas", "list"): ("list_notes", ()),
    ("notas", "add"): ("add_note", ("content",)),
    ("notas", "update"): ("update_note", ("note_id", "content")),
    ("notas", "delete"): ("delete_note", ("note_id",)),
    ("notificaciones", "list"): ("list_notifications", ()),
    ("notificaciones", "save"): (
        "save_notification", ("notification_id", "title", "body", "received_at")),
    ("notificaciones", "delete"): ("delete_notifications_before", ("received_at",)),
    ("batches", "list"): ("list_checker_batches", ()),
    ("batches", "add"): ("add_checker_batch", ("gate", "content", "total")),
    ("mail", "list"): ("list_temp_mail", ()),
    ("mail", "save"): ("save_temp_mail", ("email",)),
    ("mail", "delete"): ("delete_temp_mail", ("emails",)),
}
STORAGE_DEFAULT_DB = "namsogen.db"
NOW_KEY = {
    ("notas", "add"): "created_at", ("notas", "update"): "created_at",
    ("notificaciones", "save"): "received_at", ("batches", "add"): "created_at",
    ("mail", "save"): "created_at",
}


def redact(value: Any) -> Any:
    """Sustituye valores de llaves sensibles, recursivamente."""
    if isinstance(value, dict):
        return {k: "***" if SENSITIVE.search(str(k)) else redact(v) for k, v in value.items()}
    if isinstance(value, list):
        return [redact(v) for v in value]
    return value


def show(value: Any, scrub: tuple[str, ...] = (), clean: bool = True) -> None:
    text = json.dumps(redact(value) if clean else value, indent=2, ensure_ascii=False, default=str)
    for secret in scrub:
        text = text.replace(secret, "***")
    print(text)


def fail(message: str) -> int:
    print("error: " + message, file=sys.stderr)
    return 1


def parse_json_object(text: str | None, label: str) -> dict:
    if not text:
        return {}
    try:
        data = json.loads(text)
    except json.JSONDecodeError as exc:
        raise ValueError("%s no es JSON válido: %s" % (label, exc))
    if not isinstance(data, dict):
        raise ValueError("%s debe ser un objeto JSON" % label)
    return data


# ---- local ----

def run_local(argv: list[str]) -> int:
    return namso.main(argv or ["--help"]) or 0


def ask(prompt: str, default: str = "") -> str:
    suffix = " [%s]" % default if default else ""
    return input("%s%s: " % (prompt, suffix)).strip() or default


def interactive_local() -> int:
    for i, (name, helptext, _) in enumerate(LOCAL_TOOLS, 1):
        print("  %d) %-10s %s" % (i, name, helptext))
    choice = ask("Herramienta (número)")
    if not choice.isdigit() or not 1 <= int(choice) <= len(LOCAL_TOOLS):
        return fail("opción inválida")
    name, _, fields = LOCAL_TOOLS[int(choice) - 1]
    argv, positional = [name], []
    for prompt, _, kind, default in fields:
        answer = ask(prompt, default)
        if kind.startswith("flag:"):
            if answer.lower() in ("s", "si", "sí", "y", "yes"):
                argv.append(kind[5:])
        elif not answer:
            continue
        elif kind.startswith("opt:"):
            argv += [kind[4:], answer]
        elif kind == "pos+":
            positional += answer.split()
        else:
            positional.append(answer)
    return run_local(argv[:1] + positional + argv[1:])


# ---- storage ----

def run_storage(group: str, action: str, database: str, args: dict) -> int:
    if (group, action) not in STORAGE_OPS:
        valid = sorted(a for g, a in STORAGE_OPS if g == group)
        return fail("acción '%s' inválida para %s (válidas: %s)" % (action, group, ", ".join(valid)))
    method, required = STORAGE_OPS[(group, action)]
    args = dict(args)
    if (group, action) in NOW_KEY:  # createdAt/receivedAt: ahora (ms) si no se indica
        args.setdefault(NOW_KEY[(group, action)], int(time.time() * 1000))
    missing = [k for k in required if k not in args]
    if missing:
        return fail("faltan argumentos JSON: " + ", ".join(missing))
    if (group, action) == ("notificaciones", "save"):
        args.setdefault("url", None)
    store = storage.Storage(database)
    try:
        result = getattr(store, method)(**args)
    except (TypeError, ValueError) as exc:
        return fail("argumentos inválidos: %s" % exc)
    finally:
        store.close()
    show({"database": database, "operation": "%s %s" % (group, action), "result": result})
    return 0


def interactive_storage() -> int:
    groups = sorted({g for g, _ in STORAGE_OPS})
    group = ask("Grupo (%s)" % "/".join(groups))
    actions = sorted(a for g, a in STORAGE_OPS if g == group)
    if not actions:
        return fail("grupo inválido")
    action = ask("Acción (%s)" % "/".join(actions))
    print("Argumentos como objeto JSON, p. ej. {\"content\": \"hola\"}; vacío = ninguno.")
    try:
        args = parse_json_object(ask("Argumentos"), "argumentos")
    except ValueError as exc:
        return fail(str(exc))
    return run_storage(group, action, ask("Archivo de base de datos", STORAGE_DEFAULT_DB), args)


# ---- remote ----

def load_remote():
    try:
        import remote
    except ImportError as exc:
        raise RuntimeError("módulo remote no disponible: %s" % exc)
    return remote


def env_names(op: dict) -> list[str]:
    env = op.get("credential_env") or []
    return [env] if isinstance(env, str) else list(env)


def remote_list(client) -> int:
    show(client.operations(), clean=False)  # catálogo: credential_env es un nombre, no un valor
    return 0


def remote_call(client, name: str, params: dict) -> int:
    ops = {op["name"]: op for op in client.operations()}
    scrub = tuple(v for op in ops.values() for env in env_names(op)
                  for v in [os.environ.get(env, "")] if len(v) >= 6)
    remote = load_remote()
    try:
        result = client.execute(name, params)
    except remote.RemoteError as exc:
        return fail("remote: %s" % exc)
    show(result, scrub)
    return 0


def interactive_remote() -> int:
    try:
        remote = load_remote()
        client = remote.RemoteClient()
        ops = client.operations()
    except Exception as exc:
        return fail(str(exc))
    for i, op in enumerate(ops, 1):
        print("  %d) %-28s %-6s %s%s" % (i, op["name"], op["method"], op.get("description", ""),
                                         "  [ESCRIBE]" if op.get("write") else ""))
    choice = ask("Operación (número)")
    if not choice.isdigit() or not 1 <= int(choice) <= len(ops):
        return fail("opción inválida")
    op = ops[int(choice) - 1]
    if env_names(op):
        print("Credencial: se lee de las variables de entorno %s (no se piden aquí)." % ", ".join(env_names(op)))
    params: dict = {}
    for key in op.get("required", []):
        if SENSITIVE.search(key):
            print("  '%s' es sensible: no se pide por consola; usa remote call --params." % key)
            return 1
        params[key] = ask("Parámetro %s" % key)
    allow_write = False
    if op.get("write"):
        print("Esta operación ESCRIBE o puede implicar una compra/acción real. El menú no la autoriza.")
        if ask("Escribe el nombre exacto de la operación para confirmar") != op["name"]:
            return fail("operación cancelada")
        allow_write = True
    base_url = ask("URL base (vacío = predeterminada)") or None
    client = remote.RemoteClient(base_url=base_url, allow_write=allow_write)
    return remote_call(client, op["name"], params)


# ---- demo / list / menú ----

def run_demo() -> int:
    print("### namso (sin red) ###")
    namso._demo()
    print("\n### storage (SQLite en memoria) ###")
    storage.demo()
    return 0


def run_list() -> int:
    catalog = {
        "local": [{"name": n, "description": h} for n, h, _ in LOCAL_TOOLS],
        "storage": [{"group": g, "action": a, "required": list(r[1])} for (g, a), r in STORAGE_OPS.items()],
        "remote": "usa 'remote list' (catálogo sin peticiones de red)",
        "firebase": "firebase fetch (red) / firebase gates (caché local)",
        "checker": "checker --help: flujo recuperado y replay de ramas",
        "auth": "auth --help: sesión propia Firebase",
        "data": "data --help: composición de correo y datos por país",
        "demo": "namso + storage en memoria, sin red",
    }
    show(catalog, clean=False)
    return 0


def interactive() -> int:
    menu = {"1": ("Herramientas locales", interactive_local),
            "2": ("Operaciones remotas", interactive_remote),
            "3": ("Persistencia (storage)", interactive_storage),
            "4": ("Demo", run_demo)}
    try:
        while True:
            print("\n== NamsoGen terminal ==")
            for key, (label, _) in menu.items():
                print("  %s) %s" % (key, label))
            choice = ask("Opción (0 = salir)")
            if choice in ("0", "q", ""):
                return 0
            if choice not in menu:
                print("opción inválida")
                continue
            try:
                menu[choice][1]()
            except SystemExit:
                pass
    except (EOFError, KeyboardInterrupt):
        print()
        return 0


def build_parser() -> argparse.ArgumentParser:
    ap = argparse.ArgumentParser(
        description="Terminal de NamsoGen: herramientas locales, persistencia y catálogo remoto. "
                    "Datos sintéticos; el catálogo remoto es una reconstrucción parcial.")
    sub = ap.add_subparsers(dest="cmd")
    sub.add_parser("list", help="muestra herramientas locales, storage y demo")
    sub.add_parser("demo", help="demo de namso y storage en memoria (sin red)")
    sub.add_parser("interactive", aliases=["menu"], help="menú interactivo")
    for name, helptext in (("auth", "sesión propia Firebase"),
                           ("firebase", "Remote Config: fetch o gates"),
                           ("checker", "flujo de gates: run, replay, catalog"),
                           ("data", "correo y selección de datos por país")):
        sub.add_parser(name, help=helptext).add_argument("args", nargs=argparse.REMAINDER)

    p = sub.add_parser("local", help="ejecuta namso.py: local <subcomando> [args] (ver 'local --help')")
    p.add_argument("args", nargs=argparse.REMAINDER)

    p = sub.add_parser("remote", help="catálogo y ejecución remota")
    p.set_defaults(timeout=15.0, base_url=None)
    net = argparse.ArgumentParser(add_help=False)  # opciones válidas antes o después de list/call
    net.add_argument("--timeout", type=float, default=argparse.SUPPRESS)
    net.add_argument("--base-url", default=argparse.SUPPRESS)
    p.add_argument("--timeout", type=float, default=argparse.SUPPRESS)
    p.add_argument("--base-url", default=argparse.SUPPRESS)
    rsub = p.add_subparsers(dest="rcmd", required=True)
    rsub.add_parser("list", help="catálogo de operaciones (sin red)", parents=[net])
    c = rsub.add_parser("call", help="ejecuta una operación", parents=[net])
    c.add_argument("operation")
    c.add_argument("--params", help="objeto JSON de parámetros")
    c.add_argument("--allow-write", action="store_true", help="autoriza operaciones de escritura")

    p = sub.add_parser("storage", help="persistencia SQLite")
    p.add_argument("group", choices=sorted({g for g, _ in STORAGE_OPS}))
    p.add_argument("action", help="list | add | save | update | delete según el grupo")
    p.add_argument("--args", help="objeto JSON con los argumentos del método")
    p.add_argument("--database", default=STORAGE_DEFAULT_DB, help="archivo SQLite (def. %(default)s)")
    return ap


def main(argv: list[str] | None = None) -> int:
    argv = sys.argv[1:] if argv is None else argv
    if argv and argv[0] in {"auth", "firebase", "checker", "data"}:
        import importlib
        modules = {"auth": "auth", "firebase": "firebase_config",
                   "checker": "checker", "data": "data_tools"}
        return importlib.import_module(modules[argv[0]]).main(argv[1:])
    if argv[:1] == ["local"]:  # argparse REMAINDER no admite --seed inicial
        return run_local(argv[1:])
    a = build_parser().parse_args(argv)
    try:
        if a.cmd in (None, "interactive", "menu"):
            return interactive()
        if a.cmd == "list":
            return run_list()
        if a.cmd == "demo":
            return run_demo()
        if a.cmd == "storage":
            return run_storage(a.group, a.action, a.database, parse_json_object(a.args, "--args"))
        params = parse_json_object(getattr(a, "params", None), "--params")
        client = load_remote().RemoteClient(
            timeout=a.timeout, base_url=a.base_url, allow_write=getattr(a, "allow_write", False))
        return remote_list(client) if a.rcmd == "list" else remote_call(client, a.operation, params)
    except (ValueError, RuntimeError) as exc:
        return fail(str(exc))


if __name__ == "__main__":
    sys.exit(main())
