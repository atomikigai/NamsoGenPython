# Herramientas locales de datos

`src/data_tools.py` implementa tres subcomandos de biblioteca estándar. También se puede integrar invocando `data_tools.main(argv)` desde el CLI principal.

```sh
python src/data_tools.py mail-domains
python src/data_tools.py mail-compose [--username USUARIO] [--domain DOMINIO]
python src/data_tools.py world-select --file dataset.json --country "Perú" -n 3
```

`mail-domains` lista en orden los valores de `catchmail_domain_array` (`decompiled/jadx/resources/res/values/arrays.xml:3-8`). `mail-compose` con usuario valida la expresión `^[a-zA-Z0-9._-]{3,30}$` (`decompiled/jadx/sources/h3/x2.java:140-151`) y usa `zeppost.com`, la opción seleccionada inicialmente por la pantalla (`x2.java:58-70`), salvo que se indique otro dominio permitido. Sin usuario replica el formato `user` + primeros ocho caracteres de un UUID + `@dominio`; el dominio se elige del array.

El origen aleatorio no es idéntico a Android: Python usa `uuid.uuid4()` para el nombre y `secrets.choice()` para el dominio; el APK usa `UUID.randomUUID()` y `kotlin.random.Random.Default`. No hay opción de semilla y cada composición es independiente.

`world-select` espera un JSON local con forma de objeto `{ "país": [ { ... }, ... ] }`. El APK carga ese dataset desde una URL de GitHub en `h3.z.b0` (`decompiled/jadx/sources/h3/z.java:37-80`); este comando no lo descarga. Emite una línea JSON por registro, con las claves `pais`, `estado`, `ciudad`, `direccion`, `codigo_postal`, `telefono`; claves ausentes o `null` se presentan como `N/A`; cadenas vacías se conservan como en `JSONObject.optString`.

La selección empieza en el primer elemento del país y avanza cíclicamente, como el índice por país de `h3.z.d0` (`z.java:132-149`). El índice del APK vive en memoria del fragmento y reinicia con su ciclo de vida; Python reinicia el índice en cada invocación del comando. Si se piden más filas que las disponibles, repite las existentes en el mismo orden. Los datos siempre proceden del archivo indicado, sin fabricar identidades.

Descarga y selecciona mediante `python3 src/namso.py remote call world-data > dataset.json` y `python3 src/namso.py data world-select --file dataset.json --country "México" -n 3`. La composición local no reserva un buzón ni reproduce la comprobación de suscripción de la interfaz Android.
