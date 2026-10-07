# Gates de Firebase Remote Config

Este cliente reproduce las solicitudes cliente recuperadas del APK; no utiliza
credenciales administrativas ni acceso a la cuenta Firebase del propietario.

```bash
python3 src/firebase_config.py fetch --country PA --language es-PA --platform 34 --timezone America/Panama
python3 src/firebase_config.py gates
```

`fetch` crea una instalación Firebase **nueva para esta terminal** o renueva su
token FIS; después consulta el namespace `firebase` de Remote Config. No usa la
sesión de `auth.py`. `gates` lee solo la caché y no hace solicitudes. Ambos muestran
únicamente los nombres de `premium_gates3`, recortando espacios y descartando
cadenas vacías como `e5/c.java`. `gate_config` indica `present`, `missing` o `invalid`;
una lista vacía no demuestra por sí sola un fallo de red.

Fuentes recuperadas:

- `com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient.java`: endpoint,
  headers y payload del SDK Remote Config `21.4.1`.
- `bb/d.java` y `za/c.java`: Firebase Installations `a:17.1.4`, creación,
  `FIS_v2`, renovación y cuerpo JSON comprimido gzip.
- `za/h.java`: FID aleatorio con UUID, prefijo de bits y base64 URL-safe.
- `e5/c.java`, `onComplete` caso 10: parseo de `premium_gates3`.

La configuración se lee de `google_app_id`, `project_id`, `google_api_key` y
`gcm_defaultSenderId` en `strings.xml`, y del manifiesto Android. El número de
proyecto Remote Config se obtiene del app ID, igual que el SDK. Se envían paquete
y certificado SHA1 del APK; el SHA1 procede de `evidence/apk-cert-sha1.txt` o
`NAMSO_ANDROID_CERT_SHA1`. Estos identificadores no sustituyen integridad,
autorización ni reglas del proveedor. Si el servidor rechaza la solicitud, el
cliente informa el HTTP y termina, sin reintentos ni rutas alternativas.

La instalación y sus tokens quedan en `.local/firebase-installation.json`. La
respuesta completa, que puede contener otros valores sensibles, permanece en
`.local/remote-config.json`. Ambos archivos tienen permisos 600 y el directorio
700; se escriben mediante sustitución atómica y deben permanecer fuera de Git.
No publiques la respuesta completa. Las solicitudes verifican TLS, no siguen
redirecciones, esperan hasta 15 segundos y limitan respuestas a 1 MiB. Los errores
no imprimen cuerpos, tokens ni URLs. Se conserva ETag para futuras consultas.

La terminal envía un perfil explícito y `analyticsUserProperties` vacío; no envía
el historial Analytics, experimentos, señales reales Android ni `firstOpenTime`
de un teléfono. Tampoco reproduce heartbeat Android. Por ello puede recibir una
configuración segmentada diferente a la del teléfono, incluso con la misma cuenta.
Los nombres recuperados son configuración del cliente: no prueban disponibilidad
de un servicio ni autorización para usarlo.

La validación local del módulo puede ejecutarse con `--help` sin red. Una consulta
real requiere ejecutar explícitamente `fetch`; el desarrollo de este módulo no
autentica cuentas ni consulta el backend automáticamente.
