"""Firebase authentication for the account owner; tokens never enter CLI output."""

from __future__ import annotations

import argparse
import getpass
import json
import os
from pathlib import Path
import tempfile
import time
import urllib.error
import urllib.parse
import urllib.request
import xml.etree.ElementTree as ET

ROOT = Path(__file__).resolve().parents[1]
CACHE = ROOT / ".local" / "auth.json"
MAX_BODY = 1024 * 1024
SAFE_FIREBASE_ERRORS = frozenset({
    "OPERATION_NOT_ALLOWED", "INVALID_LOGIN_CREDENTIALS", "INVALID_PASSWORD",
    "EMAIL_NOT_FOUND", "USER_DISABLED", "TOO_MANY_ATTEMPTS_TRY_LATER",
    "INVALID_API_KEY", "API_KEY_INVALID",
})


class AuthError(Exception):
    """An authentication error safe to display without credentials."""


class _NoRedirect(urllib.request.HTTPRedirectHandler):
    def redirect_request(self, req, fp, code, msg, headers, newurl):
        return None


def firebase_config() -> dict[str, str]:
    values = {}
    resource = ROOT / "decompiled/jadx/resources/res/values/strings.xml"
    if resource.is_file():
        try:
            values = {node.get("name"): node.text or "" for node in ET.parse(resource).getroot()}
        except (ET.ParseError, OSError):
            raise AuthError("No se pudo leer la configuración Firebase local.") from None
    return {
        "api_key": os.environ.get("NAMSO_FIREBASE_API_KEY") or values.get("google_api_key", ""),
        "project_id": values.get("project_id", ""),
    }


def _request(action: str, payload: dict, *, refresh: bool = False) -> dict:
    key = firebase_config()["api_key"]
    if not key:
        raise AuthError("Falta NAMSO_FIREBASE_API_KEY o la configuración del APK.")
    host = "securetoken.googleapis.com" if refresh else "identitytoolkit.googleapis.com"
    path = "token" if refresh else "accounts:" + action
    url = f"https://{host}/v1/{path}?key={urllib.parse.quote(key, safe='')}"
    body = urllib.parse.urlencode(payload).encode() if refresh else json.dumps(payload).encode()
    content_type = "application/x-www-form-urlencoded" if refresh else "application/json"
    request = urllib.request.Request(url, body, {"Content-Type": content_type}, method="POST")
    try:
        with urllib.request.build_opener(_NoRedirect()).open(request, timeout=15) as response:
            raw = response.read(MAX_BODY + 1)
        if len(raw) > MAX_BODY:
            raise AuthError("Respuesta Firebase demasiado grande.")
        result = json.loads(raw)
        if not isinstance(result, dict):
            raise AuthError("Respuesta Firebase inesperada.")
        return result
    except urllib.error.HTTPError as exc:
        safe_code = ""
        try:
            raw_error = exc.read(MAX_BODY + 1)
            if len(raw_error) <= MAX_BODY:
                error_data = json.loads(raw_error)
                candidate = error_data.get("error", {}).get("message", "")
                if isinstance(candidate, str) and candidate in SAFE_FIREBASE_ERRORS:
                    safe_code = f" {candidate}"
        except (OSError, ValueError, AttributeError, TypeError):
            pass
        finally:
            exc.close()
        raise AuthError(f"Firebase rechazó la solicitud (HTTP {exc.code}).{safe_code}") from None
    except (urllib.error.URLError, TimeoutError, OSError, ValueError):
        raise AuthError("No se pudo completar la solicitud Firebase.") from None


def _load() -> dict:
    if not CACHE.exists():
        raise AuthError("No hay sesión local. Ejecuta login o import-token.")
    try:
        with CACHE.open(encoding="utf-8") as stream:
            raw = stream.read(MAX_BODY + 1)
        data = json.loads(raw) if len(raw) <= MAX_BODY else None
        if not isinstance(data, dict):
            raise ValueError
        return data
    except (OSError, ValueError):
        raise AuthError("La sesión local no se pudo leer.") from None


def _save(data: dict) -> None:
    CACHE.parent.mkdir(mode=0o700, parents=True, exist_ok=True)
    CACHE.parent.chmod(0o700)
    temporary = None
    try:
        descriptor, temporary = tempfile.mkstemp(prefix=".auth-", dir=CACHE.parent)
        with os.fdopen(descriptor, "w", encoding="utf-8") as stream:
            json.dump(data, stream)
        os.chmod(temporary, 0o600)
        os.replace(temporary, CACHE)
    finally:
        if temporary and os.path.exists(temporary):
            os.unlink(temporary)


def login(email: str, password: str) -> None:
    data = _request("signInWithPassword", {"email": email, "password": password, "returnSecureToken": True})
    try:
        session = {"id_token": data["idToken"], "refresh_token": data["refreshToken"],
                   "email": data.get("email", email), "provider": "password",
                   "expires_at": time.time() + int(data["expiresIn"])}
    except (KeyError, TypeError, ValueError):
        raise AuthError("Firebase no devolvió una sesión válida.") from None
    _save(session)


def import_token(token: str) -> None:
    result = _request("lookup", {"idToken": token})
    try:
        user = result["users"][0]
        # Expiration is checked against Firebase on import; this JWT field only schedules refresh.
        import base64
        part = token.split(".")[1]
        claims = json.loads(base64.urlsafe_b64decode(part + "=" * (-len(part) % 4)))
        expiry = float(claims["exp"])
        providers = user.get("providerUserInfo", [])
        provider = ",".join(item.get("providerId", "unknown") for item in providers) or "unknown"
    except (KeyError, IndexError, TypeError, ValueError):
        raise AuthError("Firebase no devolvió una identidad válida.") from None
    _save({"id_token": token, "email": user.get("email", ""), "provider": provider, "expires_at": expiry})


def refresh_session() -> dict:
    session = _load()
    if not session.get("refresh_token"):
        raise AuthError("La sesión importada requiere un nuevo ID token de tu sesión propia.")
    data = _request("", {"grant_type": "refresh_token", "refresh_token": session["refresh_token"]}, refresh=True)
    try:
        session.update(id_token=data["id_token"], refresh_token=data["refresh_token"],
                       expires_at=time.time() + int(data["expires_in"]))
    except (KeyError, TypeError, ValueError):
        raise AuthError("Firebase no devolvió una renovación válida.") from None
    _save(session)
    return session


def get_id_token() -> str:
    """Return an owner-provided token or the cached token, refreshing when needed."""
    token = os.environ.get("NAMSO_ID_TOKEN", "").strip()
    if token:
        return token
    session = _load()
    try:
        if float(session["expires_at"]) <= time.time() + 60:
            session = refresh_session()
        token = session["id_token"]
        if not isinstance(token, str) or not token:
            raise ValueError
        return token
    except (KeyError, TypeError, ValueError):
        raise AuthError("La sesión local no contiene un token válido.") from None


def main(argv: list[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    commands = parser.add_subparsers(dest="command", required=True)
    commands.add_parser("login", help="Correo/contraseña Firebase; contraseña oculta").add_argument("--email", required=True)
    commands.add_parser("import-token", help="Verifica un ID token de una sesión propia").add_argument("--file", type=Path)
    for command in ("status", "refresh", "logout"):
        commands.add_parser(command)
    args = parser.parse_args(argv)
    try:
        if args.command == "login":
            login(args.email, getpass.getpass("Contraseña: "))
            print("Sesión guardada.")
        elif args.command == "import-token":
            if args.file:
                with args.file.open(encoding="utf-8") as stream:
                    token = stream.read(MAX_BODY + 1).strip()
            else:
                token = getpass.getpass("Firebase ID token de tu sesión: ").strip()
            if not token or len(token) > MAX_BODY:
                raise AuthError("Token vacío o demasiado grande.")
            import_token(token)
            print("Sesión propia verificada y guardada.")
        elif args.command == "refresh":
            refresh_session()
            print("Sesión renovada.")
        elif args.command == "logout":
            CACHE.unlink(missing_ok=True)
            print("Sesión local eliminada; no revoca sesiones del servidor.")
        else:
            if not CACHE.exists():
                print("Sin sesión local.")
            else:
                data = _load()
                print(json.dumps({key: data.get(key) for key in ("email", "provider", "expires_at")}, ensure_ascii=False))
        return 0
    except (AuthError, OSError):
        import sys
        # OSError may contain a user-supplied filename; keep filesystem errors generic.
        error = sys.exc_info()[1]
        print(str(error) if isinstance(error, AuthError) else "No se pudo leer o guardar la sesión.", file=sys.stderr)
        return 1


if __name__ == "__main__":
    raise SystemExit(main())
