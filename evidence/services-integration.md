# Integración y validación de servicios — 2026-10-07

Vía combinada: Codex implementó clientes HTTP, autenticación y auxiliares de datos;
Claude Sonnet implementó terminal y revisó auth/remote. El integrador revisó la
terminal, cotejó hallazgos con Java e integró rutas en namso.py. Sin commits/push.

## Resultado ejecutado

- Compilación de src/*.py y tools/demo_services.py correcta.
- Demo de algoritmos y SQLite: evidence/terminal-validation.log.
- Las 12 acciones CRUD de la terminal ejecutadas sobre SQLite en memoria:
  evidence/terminal-storage-validation.log; todos los códigos de salida 0.
- 22 operaciones HTTP con transporte loopback: evidence/services-fixture.log.
  Se registran método, path, nombres de campos JSON/query y presencia de cabecera.
  Respuestas sintéticas; no demuestran reglas, permisos ni efectos del backend.
  ProxyScrape ejercita respuesta textual, duplicados y línea inválida.
- Lecturas públicas reales: evidence/services-live.json. world-data y
  proxy-countries recibieron JSON; bin-lookup devolvió HTTP 403. Sin reintentos.
- BIN inválido y gasto fuera de loopback rechazados directamente por CLI.
- auth status: Sin sesión local. .local/auth.json está ignorado por Git.
- mail-domains y mail-compose ejecutados: evidence/data-validation.log.

## Resolución de la revisión independiente

Los informes services-review.md y claude-services-review.md son observaciones
sobre versiones intermedias, no dictámenes del estado final.

1. .local/ quedó excluida de Git; sesión con permisos 0600 y directorio 0700.
2. X-Client-Key en coins/verify sí está en la fuente: k3/e construye f(JSONObject,
   URL, continuation); k3/f.java:384-386 asigna rama 4, cuyo default añade cabecera
   en 335-336. No es un contrato inventado. Fallback lee únicamente ese literal
   del recurso Java local y exige un valor único; entorno tiene prioridad.
3. IP Scamalytics sí está en e5/d.java:328, en otra rama del mismo archivo que
   también contiene código SQLite. Sus valores llegan de Firebase RemoteConfig;
   el port exige configuración propia y no inventa ni extrae credenciales remotas.
4. Firebase password REST es un adaptador oficial alternativo; el APK observado
   usa Google Sign-In. No se afirma que el proyecto permita email/password.
   Errores Firebase sólo muestran códigos exactos permitidos, sin cuerpos secretos.
5. No redirects y validación de parámetros son diferencias documentadas del
   transporte Android. No hay equivalencia del runtime demostrada.
6. Datos por país conservan cadenas vacías y N/A para ausencia/null. Composición
   local de correo no reproduce la restricción de suscripción de la pantalla.

## Pendientes explícitos

El propietario prefirió probar la cuenta después. No se autenticó ni comprobó
saldo, cuota, suscripción o correo propio real. No hubo compras, gasto de monedas,
registro FCM, asignación proxy ni escrituras compartidas en producción. No existe
sandbox identificado para compra/crédito/gasto; esos clientes sólo admiten loopback.

La decompilación aún contiene 80 cuerpos no recuperados. Android UI, Billing,
Ads, SDK/RemoteConfig y Google OAuth no están portados íntegramente. No se ejecutó
el APK original; no se recuperó implementación de los servidores. Este resultado
es una ampliación funcional del port educativo, no una decompilación/port completos.
