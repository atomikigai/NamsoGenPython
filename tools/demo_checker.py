#!/usr/bin/env python3
"""Replay synthetic checker scenarios from h3/e1, j0 and q0; no network.

Expected outcomes come from the recovered branches. This is not an Android
runtime comparison. See checker-dex-audit.md and the independent JVM oracle.
"""
from contextlib import redirect_stdout, redirect_stderr
import io
import json
from pathlib import Path
import sys
import tempfile

sys.path.insert(0, str(Path(__file__).resolve().parents[1] / "src"))
import checker
import namso


def main():
    card = "4111111111111111|12|2030|123"
    timestamp = 1760000000000
    config = namso.gate_config("Hipnos")
    duration = namso.KotlinXorWow(namso.s64(namso.java_hashcode(card) * 31 + timestamp)).next_long(
        config["vidaMinMs"], config["vidaMaxMs"])
    with tempfile.TemporaryDirectory(prefix="namso-checker-demo-") as directory:
        root = Path(directory)
        for name, value in {"bin": {}, "empty": {"status": None, "t": None},
                            "live": {"status": "LIVE", "t": timestamp},
                            "live-no-time": {"status": "LIVE", "t": None},
                            "died": {"status": "DIED", "t": timestamp}}.items():
            (root / (name + ".json")).write_text(json.dumps(value))
        response = lambda name: ["--response-file", str(root / (name + ".json"))]
        bin_ok = ["--bin-response-file", str(root / "bin.json")]
        base = ["replay", "--card", card, "--gate", "Hipnos", "--premium", "--today", "2026-10"]
        cases = [
            ("Hipnos-draw6", base + response("empty") + bin_ok + ["--draw", "6"], 0, "LIVE"),
            ("Hipnos-draw7", base + response("empty") + bin_ok + ["--draw", "7"], 0, "DIED"),
            ("BIN-unavailable", base + response("empty") + ["--bin-unavailable"], 0, "ERROR"),
            ("server-fail-assumes-BIN", base + ["--server-unavailable", "--bin-unavailable", "--draw", "6"], 0, "LIVE"),
            ("cached-DIED", base + response("died") + ["--bin-unavailable"], 0, "DIED"),
            ("LIVE-without-t-needs-BIN", base + response("live-no-time") + ["--bin-unavailable"], 0, "ERROR"),
            ("TTL-equality", base + response("live") + ["--now-ms", str(timestamp + duration)], 0, "LIVE"),
            ("TTL-plus1", base + response("live") + ["--now-ms", str(timestamp + duration + 1)], 0, "DIED"),
            ("expired-before-cache", ["replay", "--card", "4111111111111111|01|2020|123", "--today", "2026-10"] + response("live"), 0, "ERROR"),
            ("invalid-UI-month", ["replay", "--card", "4111111111111111|00|2030|123"], 1, None),
            ("invalid-UI-year", ["replay", "--card", "4111111111111111|12|2101|123"], 1, None),
            ("spaces-and-nonASCII", ["replay", "--card", " 4111111111111111 12 2030 123é ", "--today", "2026-10", "--server-unavailable", "--draw", "0"], 0, "LIVE"),
        ]
        failures = 0
        for name, args, expected_exit, expected_status in cases:
            output, errors = io.StringIO(), io.StringIO()
            with redirect_stdout(output), redirect_stderr(errors):
                exit_code = checker.main(args)
            result = json.loads(output.getvalue()) if output.getvalue().strip() else {}
            matches = exit_code == expected_exit and result.get("status") == expected_status
            failures += not matches
            print(json.dumps({"scenario": name, "mode": "offline-synthetic-replay",
                              "matches_recovered_branch": matches, "exit_code": exit_code,
                              "result": result, "error": errors.getvalue().strip()}))
        print(json.dumps({"scenarios": len(cases), "failures": failures,
                          "android_runtime_compared": False, "network": False}))
    return bool(failures)


if __name__ == "__main__":
    raise SystemExit(main())
