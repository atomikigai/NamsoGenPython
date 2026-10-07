"""App-client Firebase Installations and Remote Config; outputs only gate names."""

from __future__ import annotations

import argparse
import base64
import gzip
import json
import os
from pathlib import Path
import re
import tempfile
import time
import urllib.error
import urllib.parse
import urllib.request
import uuid
import xml.etree.ElementTree as ET
from namso import kotlin_trim

ROOT = Path(__file__).resolve().parents[1]
INSTALLATION = ROOT / ".local/firebase-installation.json"
CONFIG_CACHE = ROOT / ".local/remote-config.json"
MAX_BODY = 1024 * 1024


class ConfigError(Exception):
    """Safe error that never includes response payloads or credentials."""

    def __init__(self, message, http_status=None):
        super().__init__(message)
        self.http_status = http_status


class _NoRedirect(urllib.request.HTTPRedirectHandler):
    def redirect_request(self, req, fp, code, msg, headers, newurl):
        return None


def _read(path: Path) -> dict:
    try:
        with path.open(encoding="utf-8") as stream:
            raw = stream.read(MAX_BODY + 1)
        result = json.loads(raw) if len(raw) <= MAX_BODY else None
        if not isinstance(result, dict):
            raise ValueError
        return result
    except (OSError, ValueError):
        raise ConfigError("No se pudo leer la caché local Firebase.") from None


def _save(path: Path, data: dict) -> None:
    path.parent.mkdir(parents=True, mode=0o700, exist_ok=True)
    path.parent.chmod(0o700)
    temporary = None
    try:
        descriptor, temporary = tempfile.mkstemp(prefix=".firebase-", dir=path.parent)
        with os.fdopen(descriptor, "w", encoding="utf-8") as stream:
            json.dump(data, stream)
        os.chmod(temporary, 0o600)
        os.replace(temporary, path)
    finally:
        if temporary and os.path.exists(temporary):
            os.unlink(temporary)


def _config() -> dict:
    resources = ROOT / "decompiled/jadx/resources"
    try:
        values = {node.get("name"): node.text or "" for node in
                  ET.parse(resources / "res/values/strings.xml").getroot()}
        manifest = ET.parse(resources / "AndroidManifest.xml").getroot()
        android = "{http://schemas.android.com/apk/res/android}"
        cert = os.environ.get("NAMSO_ANDROID_CERT_SHA1", "")
        if not cert:
            cert = (ROOT / "evidence/apk-cert-sha1.txt").read_text(encoding="ascii").strip()
        cert = cert.replace(":", "").strip().upper()
        if not re.fullmatch(r"[A-F0-9]{40}", cert):
            raise ValueError
        app_id = values["google_app_id"]
        match = re.fullmatch(r"[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)", app_id)
        if not match:
            raise ValueError
        return {"app_id": app_id, "project_id": values["project_id"],
                "project_number": match.group(1), "sender_id": values["gcm_defaultSenderId"],
                "api_key": os.environ.get("NAMSO_FIREBASE_API_KEY") or values["google_api_key"],
                "package": manifest.attrib["package"], "cert": cert,
                "app_version": manifest.attrib[android + "versionName"],
                "app_build": manifest.attrib[android + "versionCode"]}
    except (OSError, ValueError, KeyError, ET.ParseError):
        raise ConfigError("Falta configuración del APK o SHA1 válido en evidence/apk-cert-sha1.txt / NAMSO_ANDROID_CERT_SHA1.") from None


def _request(url: str, body: dict, headers: dict, *, compressed: bool = False) -> tuple[dict, str | None]:
    data = json.dumps(body).encode("utf-8")
    headers = {"Content-Type": "application/json", "Accept": "application/json", **headers}
    if compressed:
        data = gzip.compress(data)
        headers["Content-Encoding"] = "gzip"
        headers["Cache-Control"] = "no-cache"
    request = urllib.request.Request(url, data, headers, method="POST")
    try:
        with urllib.request.build_opener(_NoRedirect()).open(request, timeout=15) as response:
            raw = response.read(MAX_BODY + 1)
            etag = response.headers.get("ETag")
        if len(raw) > MAX_BODY:
            raise ConfigError("Respuesta Firebase demasiado grande.")
        result = json.loads(raw)
        if not isinstance(result, dict):
            raise ConfigError("Respuesta Firebase inesperada.")
        return result, etag
    except urllib.error.HTTPError as exc:
        code = exc.code
        exc.close()
        raise ConfigError(f"Firebase rechazó la solicitud (HTTP {code}).", http_status=code) from None
    except (urllib.error.URLError, OSError, ValueError):
        raise ConfigError("No se pudo completar la solicitud Firebase.") from None


def _headers(config: dict) -> dict:
    return {"X-Goog-Api-Key": config["api_key"], "X-Android-Package": config["package"],
            "X-Android-Cert": config["cert"]}


def _fid() -> str:
    # za/h copies the original first byte into byte 17 before base64 truncation.
    raw = bytearray(uuid.uuid4().bytes)
    raw.append(raw[0])
    raw[0] = (raw[0] & 0x0F) | 0x70
    return base64.urlsafe_b64encode(raw).decode("ascii").rstrip("=")[:22]


def _token_fields(data: dict) -> dict:
    try:
        token = data["token"]
        expiry = data["expiresIn"]
        if not isinstance(token, str) or not token or not re.fullmatch(r"[0-9]+s", expiry):
            raise ValueError
        return {"auth_token": token, "expires_at": int(time.time()) + int(expiry[:-1])}
    except (KeyError, TypeError, ValueError):
        raise ConfigError("Firebase no devolvió un token de instalación válido.") from None


def _installation(config: dict, *, create_new=False) -> dict:
    project = urllib.parse.quote(config["project_id"], safe="")
    base = f"https://firebaseinstallations.googleapis.com/v1/projects/{project}/installations"
    headers = _headers(config)
    if INSTALLATION.exists() and not create_new:
        state = _read(INSTALLATION)
        try:
            if state["app_id"] != config["app_id"]:
                raise ValueError
            if float(state["expires_at"]) >= int(time.time()) + 3600:
                if not state["fid"] or not state["auth_token"]:
                    raise ValueError
                return state
            fid = urllib.parse.quote(state["fid"], safe="")
            headers["Authorization"] = "FIS_v2 " + state["refresh_token"]
        except (KeyError, TypeError, ValueError):
            raise ConfigError("La instalación local es inválida; no se creó otra automáticamente.") from None
        try:
            result, _ = _request(base + f"/{fid}/authTokens:generate",
                                 {"installation": {"sdkVersion": "a:17.1.4"}}, headers, compressed=True)
        except ConfigError as exc:
            if exc.http_status in (401, 404):
                # za/c resets AUTH_ERROR; the next registration uses a new FID.
                return _installation(config, create_new=True)
            raise
        state.update(_token_fields(result))
    else:
        result, _ = _request(base, {"fid": _fid(), "appId": config["app_id"],
                                    "authVersion": "FIS_v2", "sdkVersion": "a:17.1.4"},
                             headers, compressed=True)
        try:
            state = {"fid": result["fid"], "refresh_token": result["refreshToken"],
                     "app_id": config["app_id"], **_token_fields(result["authToken"])}
            if not isinstance(state["fid"], str) or not isinstance(state["refresh_token"], str):
                raise ValueError
        except (KeyError, TypeError, ValueError):
            raise ConfigError("Firebase no devolvió una instalación válida.") from None
    _save(INSTALLATION, state)
    return state


def gate_config(response: dict) -> dict:
    """Apply e5/c trimming and empty filtering without printing unrelated entries."""
    entries = response.get("entries", {})
    value = entries.get("premium_gates3", "") if isinstance(entries, dict) else ""
    try:
        values = json.loads(value) if isinstance(value, str) else None
        if not isinstance(values, list):
            raise ValueError
        gates = []
        for item in values:
            # Android JSONArray.getString coerces JSON values, including NULL.
            text = item if isinstance(item, str) else json.dumps(item, ensure_ascii=False, separators=(",", ":"))
            name = kotlin_trim(text)
            if name:
                gates.append(name)
        status = "present"
    except (ValueError, TypeError):
        gates = []
        status = "missing" if value == "" else "invalid"
    return {"gates": gates, "gate_config": status}


def cached_gates() -> dict:
    """Read the fetched catalog without exposing unrelated configuration values."""
    return gate_config(_read(CONFIG_CACHE).get("response", {}))


def fetch_config(*, country: str = "PA", language: str = "es-PA", platform: str = "34",
                 timezone: str = "America/Panama") -> dict:
    config = _config()
    installation = _installation(config)
    headers = _headers(config)
    headers.update({"X-Google-GFE-Can-Retry": "yes",
                    "X-Goog-Firebase-Installations-Auth": installation["auth_token"]})
    previous = _read(CONFIG_CACHE) if CONFIG_CACHE.exists() else {}
    if previous.get("etag"):
        headers["If-None-Match"] = previous["etag"]
    body = {"appInstanceId": installation["fid"], "appInstanceIdToken": installation["auth_token"],
            "appId": config["app_id"], "countryCode": country, "languageCode": language,
            "platformVersion": str(platform), "timeZone": timezone,
            "appVersion": config["app_version"], "appBuild": config["app_build"],
            "packageName": config["package"], "sdkVersion": "21.4.1", "analyticsUserProperties": {}}
    url = ("https://firebaseremoteconfig.googleapis.com/v1/projects/" +
           config["project_number"] + "/namespaces/firebase:fetch")
    response, etag = _request(url, body, headers)
    if response.get("state") == "NO_CHANGE" and previous:
        response = previous.get("response", response)
    _save(CONFIG_CACHE, {"response": response, "etag": etag or previous.get("etag"),
                         "fetched_at": time.time(), "profile": {key: body[key] for key in
                          ("countryCode", "languageCode", "platformVersion", "timeZone")}})
    return gate_config(response)


def main(argv: list[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    commands = parser.add_subparsers(dest="command", required=True)
    fetch = commands.add_parser("fetch", help="Crea/renueva instalación y consulta configuración pública del cliente")
    for name, default in (("country", "PA"), ("language", "es-PA"), ("platform", "34"), ("timezone", "America/Panama")):
        fetch.add_argument("--" + name, default=default)
    commands.add_parser("gates", help="Lee únicamente caché local; sin red")
    args = parser.parse_args(argv)
    try:
        result = fetch_config(country=args.country, language=args.language, platform=args.platform,
                              timezone=args.timezone) if args.command == "fetch" else cached_gates()
        print(json.dumps(result, ensure_ascii=False, indent=2))
        return 0
    except (ConfigError, OSError) as exc:
        import sys
        print(str(exc) if isinstance(exc, ConfigError) else "No se pudo guardar la caché Firebase.", file=sys.stderr)
        return 1


if __name__ == "__main__":
    raise SystemExit(main())
