#!/usr/bin/env bash
# Usage: tools/decompile.sh /path/to/original.xapk [path/to/jadx]
set -euo pipefail
root_dir=$(cd -- "$(dirname -- "$0")/.." && pwd)
xapk=${1:?Provide an XAPK path}
jadx_bin=${2:-jadx}
mkdir -p "$root_dir/artifacts/xapk" "$root_dir/artifacts/apk" "$root_dir/evidence"
cp -- "$xapk" "$root_dir/artifacts/original.xapk"
unzip -qo "$root_dir/artifacts/original.xapk" -d "$root_dir/artifacts/xapk"
unzip -qo "$root_dir/artifacts/xapk/app.namso_gen.spacehowen.apk" -d "$root_dir/artifacts/apk"
# JADX can exit nonzero while successfully recovering most classes.
set +e
"$jadx_bin" -j 4 -d "$root_dir/decompiled/jadx" "$root_dir/artifacts/xapk/app.namso_gen.spacehowen.apk" > "$root_dir/evidence/jadx.log" 2>&1
jadx_status=$?
set -e
printf 'JADX exit code: %s\n' "$jadx_status"
python3 "$root_dir/tools/inventory.py"
exit "$jadx_status"
