"""Regenerate static inventory from the locally decompiled APK; never execute it."""
import hashlib
import json
import re
from pathlib import Path
from xml.etree import ElementTree

ROOT = Path(__file__).resolve().parents[1]


def sha256(path):
    digest = hashlib.sha256()
    with path.open('rb') as stream:
        for block in iter(lambda: stream.read(1024 * 1024), b''):
            digest.update(block)
    return digest.hexdigest()


def main():
    sources = ROOT / 'decompiled/jadx/sources'
    resources = ROOT / 'decompiled/jadx/resources'
    manifest = ElementTree.parse(resources / 'AndroidManifest.xml').getroot()
    android = '{http://schemas.android.com/apk/res/android}'
    inputs = [ROOT / 'artifacts/original.xapk']
    inputs += sorted((ROOT / 'artifacts/xapk').glob('*.apk'))
    inputs += sorted((ROOT / 'artifacts/apk').glob('*.dex'))
    urls, errors, schemas = [], [], []
    for path in sorted(sources.rglob('*.java')):
        relative = path.relative_to(ROOT).as_posix()
        for number, line in enumerate(path.read_text().splitlines(), 1):
            for url in re.findall(r'https?://[^"\s<>]+', line):
                urls.append({'source': relative, 'line': number, 'url_literal': url})
            if 'Method not decompiled:' in line:
                errors.append({'source': relative, 'line': number, 'message': line.strip()})
        if path.parent.name == 'i3' and path.name == 'k.java':
            schemas = re.findall(r'"(CREATE TABLE IF NOT EXISTS `[^"\n]+)"', path.read_text())
    result = {
        'package': manifest.get('package'),
        'version': manifest.get(android + 'versionName'),
        'version_code': manifest.get(android + 'versionCode'),
        'inputs': [{'path': p.relative_to(ROOT).as_posix(), 'bytes': p.stat().st_size,
                    'sha256': sha256(p)} for p in inputs],
        'java_files': len(list(sources.rglob('*.java'))),
        'native_libraries': [p.relative_to(ROOT).as_posix() for p in (ROOT / 'artifacts/apk').rglob('*.so')],
        'permissions': [p.get(android + 'name') for p in manifest.findall('uses-permission')],
        'application': manifest.find('application').attrib,
        'jadx_unrecovered_methods': errors,
    }
    evidence = ROOT / 'evidence'
    evidence.mkdir(exist_ok=True)
    (evidence / 'inventory.json').write_text(json.dumps(result, indent=2, ensure_ascii=False) + '\n')
    (evidence / 'url-literals.json').write_text(json.dumps(urls, indent=2, ensure_ascii=False) + '\n')
    (evidence / 'schema.sql').write_text(';\n'.join(schemas) + ';\n')
    print(json.dumps({'java_files': result['java_files'], 'unrecovered_methods': len(errors),
                      'url_literals': len(urls), 'native_libraries': len(result['native_libraries'])}))


if __name__ == '__main__':
    main()
