# CLI de terminal

`src/terminal.py` reúne en un solo punto de entrada las herramientas locales de
`namso.py`, la persistencia de `storage.py` y el catálogo remoto de `remote.py`.
No duplica algoritmos ni usa dependencias externas (solo biblioteca estándar).

## Uso paso a paso

```sh
cd apps/NamsoGenPython
python3 src/terminal.py --help
python3 src/terminal.py list            # herramientas locales, storage y demo
python3 src/terminal.py demo            # namso + storage en memoria, sin red
python3 src/terminal.py interactive     # menú (también sin argumentos)
```

### Local (delegado a `namso.main`)

```sh
python3 src/terminal.py local --seed 1 gen-card 4111xxxxxxxxxxxx -n 2
python3 src/terminal.py local check "4111111111111111|12|2030|123" --premium
python3 src/terminal.py local gate PREMIUM
python3 src/terminal.py local iban ES -n 2
python3 src/terminal.py local cpf
python3 src/terminal.py local password 16
python3 src/terminal.py local mail-dots abcd --domain gmail.com -n 5
```

Todo lo que sigue a `local` se pasa tal cual a `namso.py`.

### Storage

Grupos y acciones: `notas` (list, add, update, delete), `notificaciones`
(list, save, delete), `batches` (list, add), `mail` (list, save, delete).
Los argumentos van como objeto JSON con los nombres de los parámetros de
`Storage`; `--database` elige el archivo SQLite (por defecto `namsogen.db`,
que se crea al ejecutar un comando `storage`).

```sh
python3 src/terminal.py storage notas add --args '{"content": "hola"}' --database datos.db
python3 src/terminal.py storage notas update --args '{"note_id": 1, "content": "nuevo"}' --database datos.db
python3 src/terminal.py storage notificaciones save --args '{"notification_id": "n1", "title": "t", "body": "b"}'
python3 src/terminal.py storage batches add --args '{"gate": "GRATIS", "content": "x", "total": 1}'
python3 src/terminal.py storage mail delete --args '{"emails": ["a@example.invalid"]}'
```

Si faltan `created_at`/`received_at` se usa la hora actual en milisegundos.
`batches list` admite `{"premium": true|false}`; `notificaciones delete`
requiere `{"received_at": <ms>}`.

### Remoto

```sh
python3 src/terminal.py remote list
python3 src/terminal.py remote --base-url http://127.0.0.1:8080 --timeout 15 \
    call <operacion> --params '{"clave": "valor"}'
python3 src/terminal.py remote call <operacion_de_escritura> --params '{...}' --allow-write
```

- `--base-url` y `--timeout` se aceptan antes o después de `list`/`call`.
- `remote list` solo muestra el catálogo; no hace peticiones.
- Las operaciones de escritura (compras, cambios) exigen `--allow-write`.
- Las credenciales nunca se piden ni se aceptan por consola: se leen de la
  variable de entorno indicada por `credential_env` de cada operación, por
  ejemplo `export NOMBRE_VARIABLE=...` en tu shell (el valor no se documenta ni
  se registra aquí).
- La salida redacta llaves sensibles (token, secret, password, authorization,
  cookie, api_key, credential, session, jwt, bearer) y los valores de las
  variables `credential_env`.

### Menú interactivo

Elige herramienta local, operación remota, storage o demo y pide los
parámetros no sensibles. No crea archivos hasta que ejecutas una operación de
storage. Para operaciones de escritura remotas pide escribir el nombre exacto de
la operación; el menú no sustituye la autorización de compras. Los parámetros
sensibles no se piden: usa `remote call --params` y variables de entorno.

## Límites

- La lógica local es un port parcial; LIVE/DIED es una simulación, no validación
  bancaria.
- El catálogo remoto refleja solo los contratos recuperables de la APK; no se
  inventaron endpoints ni lógica y no se garantiza fidelidad del 100 % con la
  aplicación original.
- `demo` y `list` no hacen peticiones de red; las llamadas remotas solo ocurren
  con `remote call` y dependen de que exista `src/remote.py`.

## Integración final

También puedes usar `python3 src/namso.py terminal ...`, `python3 src/namso.py remote ...` y `python3 src/namso.py storage ...`. La autenticación se invoca con `python3 src/namso.py auth --help`; las herramientas locales de correo/dataset, con `python3 src/namso.py data --help`. Las operaciones privadas aceptan automáticamente la sesión local además de las variables de entorno.

`python3 tools/demo_services.py` ejecuta las 22 operaciones HTTP contra fixtures sintéticos en loopback y muestra método, ruta y nombres de campos enviados sin sus valores sensibles. Esto demuestra el transporte y la serialización, no la conducta de los servicios originales. `evidence/services-live.json` registra separadamente las tres consultas públicas reales. El propietario ha decidido probar su cuenta después.
