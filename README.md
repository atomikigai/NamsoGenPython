# Namso Gen 11.23 — lectura y reconstrucción en Python

Proyecto educativo de ingeniería inversa de `app.namso_gen.spacehowen`, versión
11.23 (125), a partir del XAPK proporcionado. Incluye la decompilación Java,
recursos Android, evidencia de Ghidra/radare2/JADX y una reconstrucción de la
lógica local en Python. El código decompilado conserva nombres ofuscados por R8.
No equivale al repositorio original ni recupera código de los servidores.

## Lectura

- [Arquitectura y navegación](docs/architecture.md).
- [Cobertura y límites](docs/coverage.md).
- [Reconstrucción Python y correspondencia con Java](docs/python-port.md).
- [Análisis DEX con radare2](docs/dex-analysis.md).
- [Tabla recuperada desde Dalvik](docs/enum-recovery.md).
- [Persistencia SQLite](docs/storage.md).
- [Contratos remotos observados](docs/services.md).
- [Clientes HTTP recuperados](docs/remote-clients.md).
- [Terminal unificada](docs/terminal.md).
- [Autenticación de tu cuenta](docs/auth.md).
- [Correo local y selección por país](docs/data-tools.md).
- [Proceso reproducible y evidencia](docs/reverse-engineering.md).
- [Manifiesto Android recuperado](decompiled/jadx/resources/AndroidManifest.xml).
- [Fuentes Java](decompiled/jadx/sources/): incluye dependencias Android/Firebase,
  no solo código de la aplicación.

## Ejecutar

Python 3.10+ y biblioteca estándar; las herramientas locales no necesitan red:

```sh
python3 src/namso.py --help
python3 src/namso.py demo
python3 src/storage.py demo
python3 src/namso.py terminal
python3 src/namso.py remote list
python3 tools/demo_services.py
```

Para usar tu cuenta, ejecuta `python3 src/namso.py auth login --email TU_CORREO`.
La contraseña se pide oculta y nunca se guarda. El APK visible utiliza Google
Sign-In: el acceso REST por contraseña es una alternativa que depende de que
Firebase la permita. La sesión queda en `.local/auth.json`, excluida de Git.
Consulta `docs/auth.md` si el proveedor rechaza ese método.

Hay 22 operaciones HTTP implementadas. La demostración `demo_services.py` usa
respuestas sintéticas en loopback: comprueba transporte y serialización, no los
servidores. Las lecturas públicas reales están registradas en
`evidence/services-live.json`: dataset y países proxy respondieron; BIN devolvió
HTTP 403. Las lecturas privadas requieren iniciar sesión. Compras, crédito y
gasto sólo se ejecutan en loopback, sin sandbox identificado del proveedor.

Consulta los subcomandos y ejemplos en `docs/python-port.md`. Los generadores
producen cadenas sintéticas para estudiar algoritmos; sus checksums no demuestran
que exista una cuenta, identidad o tarjeta. El checker offline reproduce una
simulación local identificada en el APK, no consulta entidades bancarias.

## Material local

`artifacts/original.xapk` conserva la muestra recibida; `artifacts/xapk/` conserva
el APK base y 18 splits. `artifacts/apk/` contiene el APK base extraído.
`evidence/` conserva hashes, comandos, resultados, limitaciones y el proyecto
Ghidra local. Se excluyen de Git los binarios originales, la instalación de JADX,
la base de Ghidra y los cachés. No se ha publicado ni subido este proyecto.
