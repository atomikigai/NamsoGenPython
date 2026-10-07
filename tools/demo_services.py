#!/usr/bin/env python3
"""Exercise recovered HTTP clients against an explicitly synthetic loopback server.

This is a transport demonstration, not a replacement backend or evidence that
private production operations work. No public network requests are made.
"""
from __future__ import annotations

from contextlib import contextmanager
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
import json
import os
from pathlib import Path
import sys
from threading import Thread
from urllib.parse import urlsplit, parse_qs

sys.path.insert(0, str(Path(__file__).resolve().parents[1] / "src"))
from remote import RemoteClient, RemoteError


class FixtureHandler(BaseHTTPRequestHandler):
    def log_message(self, *_):
        pass

    def respond(self):
        length = int(self.headers.get("Content-Length", "0"))
        payload = json.loads(self.rfile.read(length)) if length else {}
        parts = urlsplit(self.path)
        self.server.observed.append({"method": self.command, "path": parts.path,
                                     "query_fields": sorted(parse_qs(parts.query)),
                                     "body_fields": sorted(payload),
                                     "client_key_present": bool(self.headers.get("X-Client-Key"))})
        body = (b"192.0.2.1:8080\n192.0.2.1:8080\ninvalid\n" if parts.path == "/v2/"
                else json.dumps({"fixture": True, "ok": True,
                                 "description": "Synthetic transport response"}).encode())
        self.send_response(200)
        self.send_header("Content-Type", "application/json")
        self.send_header("Content-Length", str(len(body)))
        self.end_headers()
        self.wfile.write(body)

    do_GET = respond
    do_POST = respond


@contextmanager
def fixture_credentials(operations):
    names = {name for op in operations for name in
             op.get("credential_env", []) + op.get("optional_credential_env", [])}
    previous = {name: os.environ.get(name) for name in names}
    try:
        for name in names:
            os.environ[name] = "synthetic-fixture-only"
        yield
    finally:
        for name, value in previous.items():
            if value is None:
                os.environ.pop(name, None)
            else:
                os.environ[name] = value


def main():
    values = {"url": "https://example.com/", "address": "demo@catchmail.io",
              "message_id": "fixture-message", "bin": "411111",
              "bin_base": "411111", "month": "12", "year": "2030",
              "sku": "fixture-sku", "quantity": 1, "amount": 1,
              "country": "us", "action": "register", "mid": "fixture-message",
              "gate": "fixture", "card": "4111111111111111|12|2030|123",
              "status": "DIED", "ip": "192.0.2.1"}
    server = ThreadingHTTPServer(("127.0.0.1", 0), FixtureHandler)
    server.observed = []
    thread = Thread(target=server.serve_forever, daemon=True)
    thread.start()
    failures = 0
    try:
        client = RemoteClient(base_url=f"http://127.0.0.1:{server.server_port}", allow_write=True)
        operations = client.operations()
        with fixture_credentials(operations):
            for op in operations:
                try:
                    result = client.execute(op["name"], {k: values[k] for k in op["required"]})
                    print(json.dumps({"operation": op["name"], "mode": "loopback-fixture",
                                      "transport": "OK", "request": server.observed[-1],
                                      "response": result}))
                except (RemoteError, KeyError) as exc:
                    failures += 1
                    print(json.dumps({"operation": op["name"], "mode": "loopback-fixture",
                                      "transport": "ERROR", "error": str(exc)}))
        print(json.dumps({"mode": "loopback-fixture", "operations": len(operations),
                          "failures": failures, "production_validated": False}))
    finally:
        server.shutdown()
        server.server_close()
        thread.join()
    return bool(failures)


if __name__ == "__main__":
    raise SystemExit(main())
