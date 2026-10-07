# Clientes HTTP recuperados

`src/remote.py` usa exclusivamente la biblioteca estándar. `RemoteClient().operations()` entrega nombres, parámetros exactos, método, URL de fuente, credenciales necesarias y si requiere habilitación de escritura. `execute(nombre, parámetros)` devuelve el JSON original (arreglos bajo `data`) y conserva `ok=false` del servidor. Las ramas FCM sólo observan HTTP y devuelven `http_status`, igual que el cliente Android.

## Operaciones

| Nombre | Parámetros públicos | Fuente JADX |
|---|---|---|
| `ip-fraud` | `ip` | `e5/d.java:328–330` |
| `proxy-free-geonode` | `country` (ISO dos letras) | `h3/d1.java:186–199` |
| `proxy-free-proxyscrape` | `country` (ISO dos letras) | `h3/d1.java:391–412` |
| `url-shorten` | `url` | `h3/u2.java:119` |
| `mail-messages` | `address` | `h3/c3.java:203` |
| `mail-read` | `message_id`, `address` | `h3/c.java:83` |
| `bin-lookup` | `bin` (6 dígitos) | `h3/j0.java:87` |
| `bin-search` | `bin` (6 dígitos) | `com/google/android/material/datepicker/n.java:494` |
| `bin-save` | `bin_base`, `month`, `year` | `h3/v.java:120–151` |
| `world-data` | ninguno | `h3/z.java:38` |
| `coins-balance` | ninguno | `k3/e.java:107–125` |
| `coins-credit` | `sku`, `quantity` | `k3/e.java:61–83` |
| `coins-spend` | `amount` | `k3/e.java:148–169` |
| `subscription-verify` | `sku` | `k3/e.java:195–244` |
| `proxy-countries` | ninguno | `k3/g.java:115` |
| `proxy-get` | `country` | `k3/f.java:244–295` |
| `proxy-quota` | ninguno | `h3/r2.java:73–101` |
| `proxy-buy` | ninguno (`sku=proxy_100_mb`) | `k3/f.java:178–215` |
| `fcm-register` | `action` | `k3/f.java:115–145` |
| `fcm-track` | `mid` | `k3/f.java:146–177` |
| `checker-get` | `gate`, `card` | `h3/e1.java:2493–2511` |
| `checker-save` | `gate`, `card`, `status` | `h3/e1.java:2376–2392` |

Los campos secretos provienen de `NAMSO_ID_TOKEN`, `NAMSO_PURCHASE_TOKEN`, `NAMSO_FCM_TOKEN`, `NAMSO_DEVICE_ID` y `NAMSO_CLIENT_KEY`. `id_token` admite también la sesión de `auth.get_id_token()`. Coins y verificación usan la misma cabecera `X-Client-Key` que la rama POST genérica `k3/f.java:327–345`; proxy usa esa cabecera de forma explícita. `NAMSO_CLIENT_KEY` tiene prioridad; si no está definido, se lee exclusivamente el literal `X-Client-Key` de `decompiled/jadx/sources/k3/f.java` de este APK. No se imprime ni se hardcodea el valor en Python. Si los literales faltan o difieren, se rechaza la operación con un error claro. Es una clave compartida empaquetada del cliente: no recupera ni reemplaza la autorización de la cuenta. El catálogo la identifica como credencial opcional. El catálogo identifica cuáles variables necesita cada operación. Los errores omiten URL, payload y valores secretos; los valores de credenciales presentes se redactan si el servidor los devuelve.

## Límites de fidelidad

No existen endpoints recuperados para crear/eliminar buzón ni consultar dominios: `h3/x2.java` construye una dirección local con `catchmail_domain_array`; borrar una dirección del historial es almacenamiento local. Sólo se recuperaron las dos lecturas Catchmail indicadas.

El servicio IP de `e5/d.java:328` forma `https://api11.scamalytics.com/{user_id_ip_fraud}/?key={api_key_ip_fraud}&ip=...` con valores Firebase Remote Config. No hay valores disponibles ni contrato de autenticación recuperado para obtenerlos. `ip-fraud` admite valores propios explícitos mediante `NAMSO_SCAMALYTICS_USER_ID` y `NAMSO_SCAMALYTICS_API_KEY`; no se inventa una clave ni se consulta Firebase para extraerla. La IP se valida y la clave viaja en query como en el APK, pero nunca se muestra la URL efectiva en errores. No se implementa un SDK Firebase completo.

`world-data` descarga el dataset original; selección de país/persona es lógica local. `checker-get/save` consultan y guardan un estado de caché, sin demostrar validación bancaria. `proxy-get` puede crear/asignar una cuenta proxy y por eso requiere habilitar escritura. Los comandos de compra, crédito y gasto sólo admiten fixtures locales: no se ha identificado sandbox del proveedor.

## Transporte y comprobación

HTTPS utiliza validación TLS del sistema, sin reintentos ni redirecciones, con timeout configurable (15 segundos por defecto) y respuesta máxima de 16 MiB. No usa proxies de entorno. Errores HTTP, transporte y JSON producen `RemoteError`; no se transforman en éxito. Respuestas no JSON FCM son aceptadas porque Android sólo consulta el estado HTTP.

`base_url` sólo acepta una IP loopback con esquema HTTP, sin credenciales, ruta adicional, query o fragmento. Conserva los paths y queries recuperados y permite ejecutar fixtures sin tocar proveedores. El usuario debe pasar `allow_write=True` para las operaciones marcadas como escritura. La comprobación de sintaxis se ejecutó con `python3 -m py_compile src/remote.py`; las ejecuciones HTTP y la integración terminal se registran por el integrador.

## Revisión de contratos

Aunque el nombre resulta inusual, `proxy-quota` sí llama `users-proxys/get_proxy.php` con JSON `id_token` y `action=get_balance`: está literal en `h3/r2.java:73–78`. No se sustituyó por un endpoint supuesto. Coins y suscripción construyen `new f(JSONObject, URL, ...)` en `k3/e.java`; ese constructor selecciona rama 4 (`k3/f.java:384–386`), que añade `X-Client-Key` (`k3/f.java:335–336`). `proxy-countries` no lleva esa cabecera (`k3/g.java:114–117`).

Las dos consultas de proxies gratuitos conservan el User-Agent Android literal y convierten país a mayúsculas. Geonode devuelve el JSON original. ProxyScrape devuelve texto; se extraen líneas host:puerto con puerto 1–65535 y sin duplicados, según `h3/d1.java:399–412`; el resultado es un objeto JSON con `proxies`. El cliente no abre conexiones a los proxies encontrados.
