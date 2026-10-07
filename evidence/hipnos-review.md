# Revisión adversarial Hipnos (Claude Sonnet 5.5) — estática, sin red ni ejecución de fetch

Alcance: `src/firebase_config.py`, `tools/apk_certificate.py`. `src/checker.py` **no existe aún: pendiente**, no revisado
(gates locales, XorWow, expiry/cache/BIN, aging LIVE/t, escrituras quedan sin verificar).

## Confirmado fiel a la fuente
- RC (`ConfigFetchHttpClient`): URL, POST, headers (Api-Key, Package, Cert, GFE-Can-Retry, Installations-Auth, Content-Type, Accept,
  If-None-Match), cuerpo (appInstanceId/Token, appId, country/language/platform/timeZone, appVersion/Build, packageName,
  sdkVersion 21.4.1, analyticsUserProperties) y sin gzip en RC. `firstOpenTime` se omite igual que con `l2==null`.
- FIS (`bb/d`): create con `fid/appId/authVersion FIS_v2/sdkVersion a:17.1.4`; refresh con `Authorization: FIS_v2 <refresh>` y
  `{"installation":{"sdkVersion"}}`; gzip + `Cache-Control: no-cache`; cert en hex mayúsculas (`n7.c.c`). `_fid()` replica `za/h`.
- Seguridad: errores sin payload, sin redirects, límite 1 MiB, `.local/` en `.gitignore`, 0700/0600 + replace atómico; stdout solo nombres de gates.
  FIS nuevo es anónimo (sin cuenta de usuario). El header `k3/f` rama 4 (coins/verify) no aplica a RC/FIS: sin falso positivo.
- `apk_certificate.py` sobre el APK base y los 18 splits da `0E4BD045…647AFB`, igual a `evidence/apk-cert-sha1.txt`. IDs 0x7109871a/0xf05368c0 correctos.

## Divergencias (severidad real)
1. **Baja** — Umbral de renovación FIS: original `za/j.a` renueva si `creación+expiresIn < ahora+3600 s`; Python usa 60 s
   (`firebase_config.py:148`). Debe ser 3600 para fidelidad de flujo (token más viejo en RC).
2. **Baja** — Refresh 401/404: `za/c.b` marca AUTH_ERROR y la instalación se descarta/recrea; Python aborta con
   "La instalación local es inválida" (`:155-156`) y exige borrar `.local` a mano. Aceptable si se documenta; no es de seguridad.
3. **Baja** — `gate_config` (`:174-187`) vs `e5/c` caso 10: `JSONArray.getString` coerciona números/bool a texto y, ante fallo a mitad,
   conserva los gates ya añadidos; Python rechaza toda la lista (`gates=[]`, `invalid`). Con datos reales (todos strings) no cambia nada.
4. **Info** — Sin `x-firebase-client` (heartbeat), sin `Accept-Encoding: gzip` y User-Agent `Python-urllib`; el original envía los dos primeros
   si hay provider. Es identidad de cliente, no de protocolo funcional; no falsificar heartbeat. `platform=34` y locale `es-PA` son defaults inventados (flag).
5. **Info** — `apk_certificate.py` toma el primer signer (no el último del lineage v3) y busca EOCD con `rfind` sin validar comentario; válido para este APK
   (verificado), solo frágil con rotación de claves. No verifica firma (ya lo declara).
6. **Info** — El ETag se conserva si la respuesta 200 no trae ETag (`:210`); original solo actualiza con ETag nuevo. Equivalente en la práctica.

## Límites
Evidencia live (`firebase-gates-live.json`, `hipnos-cache-live.json`) es consistente con 58 gates y lectura sintética; no demuestra runtime A/B original sin device.
Sin hallazgos críticos/altos en estos dos archivos. Recomendación: corregir #1 (una línea) y #3 si se busca 100% fiel; entregar `checker.py` para segunda pasada.
