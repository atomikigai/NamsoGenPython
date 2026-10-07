# Autenticación de una cuenta propia

`src/auth.py` implementa Firebase Identity Toolkit por HTTPS: correo y contraseña,
verificación de un ID token mediante `accounts:lookup` y renovación mediante Secure
Token. El flujo visible recuperado del APK utiliza Google Sign-In. El comando
`login` por correo y contraseña es una alternativa oficial de Firebase condicionada
a que ese proveedor esté habilitado; no reproduce el flujo de acceso Android.
Lee `google_api_key` y `project_id` de los recursos decompilados; permite
sobrescribir la clave de configuración con `NAMSO_FIREBASE_API_KEY`. La clave de
configuración del cliente no sustituye la autenticación ni las reglas del servidor.

Desde la raíz de este proyecto:

```bash
python3 src/auth.py login --email tu-correo
python3 src/auth.py status
python3 src/auth.py refresh
python3 src/auth.py logout
```

La contraseña se introduce mediante un prompt oculto. Nunca se guarda. Ejecutar
`login` envía la contraseña a Firebase para autenticar la cuenta indicada. El
proveedor debe tener habilitado el acceso por correo y contraseña para esa cuenta.

Para una cuenta con Google, utiliza un **Firebase ID token** de tu propia sesión
autorizada (no un access token de Google):

```bash
python3 src/auth.py import-token
# Alternativa: archivo local propio que contenga solo el ID token.
python3 src/auth.py import-token --file /ruta/privada/id-token
```

No se implementa OAuth de Google, extracción de credenciales de otras aplicaciones,
ni mecanismos Android de integridad. Un ID token importado se verifica con Firebase;
sin refresh token deberá importarse uno nuevo al caducar. El port no obtiene un
refresh token de un ID token ni elude restricciones del proveedor.

La sesión se guarda en `.local/auth.json` con permisos 600 y el directorio con 700;
la escritura usa sustitución atómica. Este archivo contiene credenciales y debe
permanecer fuera de Git. Protege también cualquier archivo usado con `--file`.
`logout` elimina la caché, pero no revoca la sesión en Firebase. `status` solo muestra
correo, proveedor y expiración Unix de la caché, sin verificar la sesión por red.

Los consumidores Python importan `get_id_token()` y capturan `AuthError`. El método
renueva automáticamente la sesión de correo cuando faltan menos de 60 segundos.
También admite `NAMSO_ID_TOKEN` provisto por el usuario: se devuelve directamente,
sin guardarlo, verificarlo ni renovarlo. No pases tokens como argumentos de comandos.
Las solicitudes tienen TLS verificado, timeout de 15 segundos, límite de respuesta
de 1 MiB y no siguen redirecciones. Los errores muestran el estado HTTP y, cuando
coincide exactamente con una lista permitida, un código Firebase conocido, como
`OPERATION_NOT_ALLOWED` o `INVALID_LOGIN_CREDENTIALS`. No incluyen cuerpos del
servidor, credenciales ni URLs con claves. Las reglas y permisos efectivos siguen dependiendo
del servidor; autenticar una cuenta no concede privilegios adicionales.

Validación local: ayuda y estado sin sesión, sin ejecutar autenticación remota.
La validación real requiere que el propietario ejecute el flujo correspondiente.

Referencia del adaptador REST: [Firebase Auth REST API](https://firebase.google.com/docs/reference/rest/auth). Se contrastaron las rutas de acceso y renovación con esta documentación oficial; no constituyen código del backend recuperado.
