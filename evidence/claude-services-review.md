# Revisión independiente Claude Sonnet: src/auth.py y src/remote.py

Alcance: cliente normal, solo lectura, sin red ni pruebas. Versión revisada: auth.py 201 líneas, remote.py 228 líneas (remote.py sigue recibiendo ampliaciones).

## Contratos cotejados contra el APK
- OK k3/e.java:62,108,149,207: cuerpos coins (`action`, `id_token`, `purchaseToken`, `sku`, `quantity`, `amount`) y verify (`token`, `sku`, `type=sub`) coinciden con remote.py:29-32.
- OK k3/f.java:119,150,185,256 y h3/r2.java:77: fcm (`action`,`token`,`app=namso` / `action=received`,`mid`,`dev`), proxy-get (`id_token`,`country` en minúsculas), buy (`sku=proxy_100_mb`) y get_balance coinciden.
- h3/d1.java solo contiene geonode/proxyscrape (líneas 186, 391); e5/d.java:163-201 es la base SQLite de datatransport de Google, no es contrato del servidor (el listener `e5.d(...,5)` en h3/e1.java:2391 solo gestiona la respuesta de save_status).

## Hallazgos
1. ALTO, contrato inventado: remote.py:42 pone coins-*, subscription-verify en `_KEYED` y exige `X-Client-Key`. En el APK ese header solo aparece en proxy get_proxy/buy (k3/f.java:185,256; h3/r2.java:78). Las llamadas de k3/e.java (coins, verify) no lo muestran. Verificar si k3.f lo añade para esas rutas; si no, quitarlas de `_KEYED`.
2. MEDIO, contrato inventado: auth.py usa Firebase REST (`signInWithPassword`, `securetoken`). El APK solo muestra FirebaseUI/SDK (WelcomeBackPasswordPrompt, zzadd). REST es equivalente documentado de Firebase, no un contrato recuperado; el docstring de remote.py:1 ("recuperados del APK") no debe aplicarse a auth.
3. MEDIO, claves: auth.py:33-40 lee `google_api_key` de strings.xml en el árbol decompiled; es una clave pública de Firebase, pero nada confirma que el servidor spacehowen acepte tokens emitidos fuera de la app (restricciones por paquete/SHA de la clave pueden rechazar REST: se vería como HTTP 403).
4. MEDIO, tokens: `NAMSO_ID_TOKEN` por entorno (auth.py:142) se devuelve sin validar; el redactor de remote.py:212-221 solo cubre JSON con `secrets` exactos. Respuestas no JSON/proxyscrape no se redactan (no se devuelven, riesgo bajo). El token viaja en el cuerpo JSON (así lo hace el APK), no en cabecera.
5. BAJO, auth.py:84-96: guarda refresh_token en .local/auth.json con 0600 y dir 0700, ignorado por git (.gitignore:7). Correcto. `logout` (183) no sobrescribe el archivo, solo borra; aceptable.
6. BAJO, auth.py:36: `ET.parse` sobre archivo local sin defensa XML, riesgo solo si el decompilado es hostil; aceptable.
7. BAJO, redirecciones: ambos módulos bloquean redirects (auth.py:26 devuelve None, lo que produce HTTPError 3xx con mensaje "rechazó"; remote.py:46 lanza RemoteError). El APK (OkHttp) sigue redirects por defecto; divergencia intencional y segura. remote.py:70 desactiva proxies del entorno: coherente.
8. BAJO, UX: auth.py:56 el mensaje de HTTP 400 no distingue contraseña inválida de API key rechazada; `status` imprime `expires_at` epoch crudo; `refresh` falla sin guía si la sesión viene de import-token (129, mensaje correcto). remote.py:134 `from auth import` depende de que src/ esté en sys.path; con ImportError se cae en "Falta credencial NAMSO_ID_TOKEN", engañoso.
9. BAJO, remote.py:117: país en mayúsculas para proxies gratuitos y minúsculas para get_proxy coincide con el APK (h3/d1 usa string de país; k3/f.java:~248 usa lowercase).

## Pendiente de volver a mirar
- remote.py completo tras las ampliaciones (especialmente `_SPECS`, `_KEYED`, `_PAYMENT`).
- Hallazgo 1: confirmar en k3/f.java si coins/verify añaden cabecera.
- bin-lookup/bin-save/checker (h3/v.java:142, h3/e1.java:2391,2511): cuerpos no cotejados en detalle.
- Respuestas del servidor no recuperadas: fixtures no equivalen al comportamiento Android.
