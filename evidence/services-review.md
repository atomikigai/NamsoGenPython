# Revisión de clientes remotos y autenticación

Revisión estática de `src/auth.py` y `src/remote.py` contra las fuentes JADX del APK 11.23. No se modificó código ni se hicieron llamadas de red; por eso no confirma que los proveedores acepten hoy estos contratos.

## Hallazgos

1. **Alta: la caché Firebase no está excluida de Git.** `auth.py` guarda el ID token y, para correo/contraseña, el refresh token en `.local/auth.json` (`src/auth.py:18,84-94`). El `.gitignore` actual no excluye `.local/`. Si el usuario inicia sesión antes de corregirlo, `git status` puede mostrar el archivo de sesión y un `git add .` lo puede incluir. Añadir `.local/` al ignore y revisar que no haya una caché ya creada antes de guardar cambios.

2. **Alta: el inicio por correo/contraseña no reproduce el login visible del APK.** La app configura Google Sign-In en `SettingsActivity.java:224-251`; en las fuentes de la app no aparece un flujo `signInWithEmailAndPassword`. La llamada Firebase REST `accounts:signInWithPassword` de `auth.py:99-107` es un endpoint real de Identity Toolkit, pero solo funcionará si el proyecto Firebase permite ese proveedor para esta cuenta y la API key acepta este cliente. La respuesta del usuario “correo y contraseña” identifica sus credenciales, pero no demuestra que el proyecto de Namso las acepte como proveedor Firebase password. Presentar este comando como un método compatible debe quedar condicionado a que el servidor lo acepte; no debe afirmarse que es el login original.

3. **Media: falta hacer operativa la cabecera X-Client-Key.** El APK incluye literalmente `spacehowen-verify-2026` en `k3/f.java:185,256,337` y `h3/r2.java:78`. `remote.py` exige `NAMSO_CLIENT_KEY` para las operaciones del grupo `_KEYED` (`src/remote.py:42,145-150`) y no lo obtiene de la configuración decompilada. Sin configurarlo manualmente, saldo, consulta proxy y verificación de suscripción fallan antes de la llamada. La documentación debería indicar que es el valor público recuperado del APK, no un secreto que el usuario tenga que conseguir por otro medio. Coins, verificar suscripción y proxy coinciden con los JSON y rutas visibles en `k3/e.java` y `k3/f.java`; el proxy balance usa `action=get_balance` en `h3/r2.java:73-101`.

## Contratos contrastados

Las rutas y parámetros implementados para los servicios observados coinciden con las fuentes examinadas: monedas y verificación (`k3/e.java`), endpoints premium y FCM (`k3/f.java`), balance de proxy (`h3/r2.java`), países proxy (`k3/g.java`), y cache checker (`h3/e1.java:121-122,2376-2392,2493-2511`). La consulta Catchmail y BIN/dataset están alineados con los literales ya inventariados en `docs/services.md`. Las fuentes también confirman las URLs Geonode y ProxyScrape en `h3/d1.java:186,391`, y Scamalytics lee los dos valores de Remote Config; esos valores no están codificados en el APK.

La API key de Firebase está incluida en `strings.xml`; sirve como configuración de cliente y no autentica por sí sola. TLS se verifica y las solicitudes auth no siguen redirecciones. Los errores del cliente no imprimen cuerpos HTTP ni payloads. La importación de ID token exige que Firebase valide el token mediante `accounts:lookup`; no crea una sesión ni obtiene refresh token por sí misma.

## Límite de la comprobación

Los `checker-get/save` recuperados solo leen y escriben estado de caché; el APK no muestra que sean un servicio remoto de validación bancaria (`h3/e1.java`). Para la demostración terminal conviene usar datos sintéticos en loopback. No enviar números de tarjeta reales a esos endpoints. Las rutas con saldo, asignación proxy o estado compartido deben probarse en vivo solo con la cuenta propia y tras confirmar el efecto correspondiente; las operaciones de compra/crédito/gasto ya se restringen a fixtures localmente.
