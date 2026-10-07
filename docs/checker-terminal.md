# Checker por terminal: flujo recuperado del APK 11.23

`src/checker.py` ofrece dos modos. `replay` recorre localmente una rama con JSON sintético; no hace solicitudes. `run` reproduce el lote contra los endpoints observados por la app y conserva una caché en memoria solo durante ese lote. Los resultados `LIVE`/`DIED` siguen la fórmula probabilística local del APK y no significan autorización bancaria.

## Reproducir ramas sin red

La forma general es:

```text
python src/checker.py replay --card '<registro sintético PAN|MM|AAAA|CVV>' [opciones]
```

Se puede fijar el mes (`--today YYYY-MM`), el reloj (`--now-ms`), el resultado de la tirada (`--draw 0..99`) y una respuesta sintética del backend (`--response-file`) o simular su caída (`--server-unavailable`). La respuesta del lookup BIN va en `--bin-response-file`; `--bin-unavailable` simula que no se obtiene un objeto JSON. `--premium --gate NOMBRE` calcula el porcentaje/TTL derivado de ese nombre, aunque el modo offline no consulta el catálogo ni demuestra acceso a un gate.

Ejemplo con fixtures locales:

```text
python src/checker.py replay --card '<dato sintético con formato aceptado>' --server-unavailable --draw 99
```

`replay` imprime el estado, la rama y si la app habría intentado guardar un cambio. El campo `write_intent` es solo una descripción: no existe opción de guardar desde este modo.

## Lote con servicios

```text
python src/checker.py catalog
python src/checker.py run --file <archivo-utf8.txt> [--gate NOMBRE] [--premium] [--no-delay] [--allow-write]
```

El archivo contiene un registro por línea. Antes de cualquier consulta, se aplica el saneamiento visible de UI (recortar, sustituir espacios ASCII por `|`, quitar caracteres no ASCII) y se valida `13–16 dígitos|MM|AAAA|CVV`, mes 1–12, año 2000–2100. Cualquier línea incorrecta cancela el lote completo para evitar procesar solo un prefijo.

`catalog` lista los gates de la caché Firebase local. Al pasar `--gate`, el lote selecciona Premium aunque se omita `--premium`; ese nombre debe aparecer en `premium_gates3` y debe existir una sesión Firebase local. `--premium` sin `--gate` es un error. El programa no imprime token ni PAN en los resultados. Para actualizar el catálogo local:

```text
python src/firebase_config.py fetch
```

Sin `--premium`, el gate usado es `GRATIS`. La sesión no se exige para el modo Gratis.

`run` usa `checker-get` y, según la respuesta, el lookup BIN. Mantiene el orden secuencial de la UI y hace la pausa aleatoria de 5–7,5 segundos después de obtener status/caché y antes de resolver la tarjeta; las fechas expiradas también esperan antes de mostrarse. Por defecto no hace la escritura compartida `checker-save`; solo muestra `write_intent`. `--allow-write` la habilita para los cambios de estado que el APK habría guardado. Úsese solo con datos sintéticos y una cuenta/entorno autorizados. `--no-delay` omite esas pausas. Ninguna ejecución de red forma parte de `replay`.

## Fidelidad y límites

El orden implementado sigue `h3/e1.t0`, `h3/j0`, `h3/q0`: la fecha expirada termina como `ERROR` antes de consultar caché; una respuesta cacheada distinta de `LIVE` se devuelve sin BIN; un `LIVE` sin `t` pasa a BIN y clasificación local; un `LIVE` con `t` aplica el envejecimiento determinista y puede pasar a `DIED`; un fallo de `get_status` clasifica localmente con BIN asumido válido y no escribe. Los estados calculados con BIN se guardan en la caché de lote; solo cambios distintos del estado remoto generan intención de guardar.

La lectura de respuesta replica las conversiones relevantes de `JSONObject`: `status` ausente o JSON `null` queda nulo; otros valores se convierten a texto JSON; `t` ausente/nulo queda nulo, y un valor no numérico usa cero, mientras cadenas decimales se convierten por `Double` y se truncan a entero largo.

La lógica numérica de `h0` y el cálculo del gate reutilizan `namso.py`. El azar por defecto de Python no reproduce la secuencia no sembrada de Kotlin, aunque sí usa el mismo porcentaje; `--draw` permite repetir ramas. Los nombres Premium son dinámicos: `firebase_config.py` procesa `premium_gates3`; la lista confirmada al momento de la consulta queda en `evidence/firebase-gates-live.json`. La validación completa de UI/formato se reconstruyó de DEX además de JADX; ver la evidencia de esa inspección junto a los límites en `docs/hipnos-source-audit.md`.

Esto reproduce las ramas recuperadas, no la aplicación Android completa ni los servicios de clasificación de terceros. Las reglas de BIN y el servidor cambian fuera del APK; no existe una prueba de equivalencia absoluta sin comparar el APK original en runtime con fixtures sintéticos.

Verificación local de esta implementación: `py_compile` y ejecuciones directas de `replay` cubrieron expiración previa a caché, fallo de status, status cacheado no `LIVE`, `LIVE` vigente/vencido y lookup BIN correcto/fallido. Estas ejecuciones usaron fixture sintética y no tuvieron red.
