# Cobertura de la reconstrucción

El proyecto conserva todos los resultados de decompilación del APK base; la
traducción Python cubre la lógica local que se pudo interpretar. No es una
conversión completa de Android a Python ni una recuperación del repositorio original.

| Área | Evidencia fuente | Resultado |
| --- | --- | --- |
| Generador principal | `h3/v.java`, `com/google/android/material/datepicker/n.java:128+`, `jd/l.java:189+`, `n3/a.java` | `src/namso.py`: normalización BIN, marcas, placeholders, Luhn, fechas y CVV. Tabla PAN/CVV corroborada con radare2; el PRNG de generación cambia a Python. |
| Checker local | `h3/e1.java:334-600`, `h3/j0.java` | Clasificación local probabilística y envejecimiento sintético. Marca del checker parcialmente reconstruida; regex de entrada de la UI no portada. No demuestra validez bancaria. |
| IBAN, CPF, contraseñas, variantes de correo | `h3/c0.java`, `x.java`, `k.java`, `i1.java` | Funciones locales y CLI. Quirks y diferencias en [python-port.md](python-port.md). |
| Notas, notificaciones, historial checker, historial correo | `i3/k.java`, `c.java`, `d.java`, `n.java`, `r.java`, `h3/o.java` | `src/storage.py`: esquema SQLite, operaciones locales y listados por fecha. API separada de los generadores; sin Room ni migraciones. |
| Guardado de BIN y consultas remotas | `h3/v.c0`, `h3/e1`, `k3/*`, literales en `evidence/url-literals.json` | `src/remote.py`: clientes HTTP y CLI. BIN real devuelve HTTP 403; escrituras demostradas sólo en loopback. Servidor no recuperado. |
| Datos por país, correo temporal, IP, acortador | Fragmentos y clientes de red decompilados | Clientes HTTP implementados. Dataset real recibido y selección local en `src/data_tools.py`; correo propio pendiente. IP requiere configuración Scamalytics propia. Acortador demostrado sólo en loopback. |
| Coins, proxy y suscripciones | `k3/e.java`, `k3/f.java`, `SettingsActivity.java` | Clientes implementados; países proxy reales recibidos. Consultas privadas pendientes de cuenta. Compras/crédito/gasto sólo loopback. |
| UI y SDKs Android | Activities, fragments, XML, AndroidX, Firebase, Billing, Ads/Consent, FCM, WebView | Conservados como Java/XML decompilados; no portados a una GUI Python. |
| Métodos no decompilados | `evidence/inventory.json` | 80 cuerpos con marcador `Method not decompiled`; algunos flujos restantes presentan advertencias. No se rellenan con comportamiento inventado. |

Los resultados de ejecución directa están en `evidence/python-validation.log`
y `evidence/storage-validation.log`. La revisión de algoritmos consta en
`evidence/codex-review.md`. No se ejecutó el original: queda sin demostrar equivalencia
completa frente al runtime Android. Véase [procedimiento](reverse-engineering.md).

Ampliación de servicios: `evidence/terminal-validation.log`,
`evidence/services-fixture.log` (22 operaciones, respuestas sintéticas) y
`evidence/services-live.json` (tres lecturas públicas). La evidencia distingue
transporte HTTP, respuesta real y equivalencia funcional: son comprobaciones
distintas. El propietario prefiere probar su cuenta después; no se autenticó
ni se ejecutaron compras, envíos FCM o escrituras compartidas reales.

`src/auth.py` ofrece Firebase REST por contraseña, alternativa condicionada a
que el proyecto permita ese proveedor. El APK visible usa Google Sign-In.
No se ha demostrado equivalencia de inicio de sesión frente a Android.
