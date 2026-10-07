# Revisión adversarial de `src/checker.py` (Claude Sonnet 5.5)

Alcance: lectura estática de `src/checker.py`, `src/namso.py` (funciones usadas) y `src/remote.py` (`execute`, `last_response_is_object`), contrastada con `h3/e1.java` (`t0`, `h0`, `i0`, `o0`, `s0`, `m0`, `f0`), `h3/j0`, `h3/q0`, `h3/r0`, `h3/y0`, `e5/a` y `evidence/checker-input.disasm.txt`. No se ejecutó red ni se modificó código. Solo se hizo una prueba local de funciones puras.

## Veredicto

No hay fallos funcionales en el orden de ramas. Quedan un hallazgo de entrada (medio-bajo) y varios límites que impiden afirmar 100 %.

## Equivalencias verificadas (sin hallazgo)

- **Caducidad antes de caché** (`e1.t0`): la rama solo se activa con 4 campos y `o0`, tras una pausa de 5000–7500 ms. Python lo hace en `checker.py:278-282`. No hay lectura de caché ni escritura.
- **Fallo de `get_status`** (`j0`, `!z10`): `h0(card, true, …)`, sin `m0` y sin caché. Python lo hace en `:299-303`. `last_response_is_object is False` (array, escalar o `null`) se trata como fallo, igual que `JsonObjectRequest`.
- **Estado cacheado distinto de `LIVE`** (incluido `""`): se devuelve sin BIN y sin escritura (`:307-309`). `status` nulo o ausente va a BIN.
- **`LIVE` con `t`**:
  - La ventana por defecto es 1.8 M–86.4 M ms (`e1.java:119-120`). Python usa `config=None` para `GRATIS`.
  - Con gate se usa `i0(gate)`, igual que `gate_config`.
  - La semilla es `hash*31+t`, `hi<=lo → lo+1`, `now-t > nextLong`.
  - `m0` solo escribe si el estado cambia, y en ese caso guarda `(estado, now)` en caché (`m0`/`:327-328`).
- **`LIVE` con `t=None`**: BIN y clasificación (`:317-325`). `s0` (`optString` nunca devuelve null) hace que cualquier objeto JSON sea `bin_ok=True`. Error, JSON inválido y no objeto dan `bin_ok=False → ERROR`.
- **Escritura condicional**: `status != old_status`, con `allow_write` o solo intención. `m0` actualiza la caché también cuando el guardado falla o no se hace. La clave de caché solo por tarjeta es válida porque hay un único gate por lote.
- **Temporización**: la pausa va tras la respuesta de `get_status`, el fallo o el acierto de caché, y antes de BIN. `now` se toma después de dormir (como el `Runnable` de `j0`).
- **Normalización de la UI y rangos**: confirmados en el DEX. El mes fuera de 1–12 (`0x54b7f4/7fc → 0x54b864`) y el año fuera de 2000–2100 (`0x54b818/820 → 0x54b850`) caen en `0x54b876` y rechazan con toast. `parse_card` coincide. El CVV de 3–4, el `split("\n")` y el trim → ` `→`|` → quitar no-ASCII también coinciden.
- **`_opt_long` / `_server_entry`**: coinciden con `JSON.toLong` de Android (saturación, NaN→0, booleano→0, `isNull`).

## Hallazgos

### M1 (medio-bajo) — Doble normalización en el lote acepta líneas que la UI rechaza
`checker.py:251-255`: `_prepare_batch` aplica `normalize` y luego `parse_card(cleaned)`, que vuelve a recortar. Quitar los no-ASCII puede dejar espacio en blanco al final, y la UI no hace un segundo trim.

Entrada: `4111111111111111|12|2030|123<TAB>é`. Java: el trim no quita nada, se borra `é`, queda `…123<TAB>` y la regex no coincide, así que **rechaza**. Python: `normalize` da `…123\t`, `parse_card` recorta y **acepta**. Reproducido con funciones puras.

**Corrección exacta**: en `:255` usar `card, _, _ = parse_card(original)`. `parse_card` ya normaliza una sola vez, y `cleaned` se conserva solo para el `if not cleaned: continue`. Las llamadas a `parse_card(card)` de `:277` y `:170` son idempotentes y no necesitan cambio.

### L1 (bajo) — `_opt_long` usa `float()` de Python, más permisivo que `Double.parseDouble`
`:124`: Python acepta `"1_0"` (→10), `"inf"`, `"nan"` o `"infinity"` en minúsculas. Java solo acepta `Infinity` y `NaN` exactos y falla con `_`. Java acepta `"1d"`, `"1f"` y flotantes hex, que Python rechaza (→0). Solo afecta a `t` enviado como cadena rara. Corrección: validar con una regex del literal Java antes de `float()`, o documentarlo como límite.

### L2 (bajo) — `_json_string` no reproduce `String.valueOf` de `optString`
Para `status` que sea float, objeto o array, Python da `1e+20` (Java `1.0E20`) y no escapa `/` como hace Android. Solo cambia el texto impreso, porque cualquier valor ≠ `"LIVE"` sigue la misma rama. Documentar.

### L3 (bajo) — `today` fijo por lote
`:273-274` lo calcula una vez. Java llama a `Calendar` en cada tarjeta, así que un lote que cruce un cambio de mes puede diferir. Es irrelevante en la práctica.

### D1 (medio, fidelidad/documentación) — Coste en monedas de Premium omitido y sin documentar
`f0 → y0.invokeSuspend` (`h3/y0.java`) descuenta un coin por cada resultado `LIVE`/`DIED` en Premium (`k3.e`, log "Coin descontado (per_card)"). Si el saldo es 0 detiene el lote (`f4675p0=true`). `checker.py` no modela ni cobra, y `docs/checker-terminal.md` no lo menciona. Para el CLI es más seguro no gastar saldo, pero la afirmación "reproduce el flujo" es falsa para Premium. Acción: añadir el límite a `docs/checker-terminal.md`. No hay que implementar el cobro.

### D2 (documentación) — Auditoría DEX desactualizada
`evidence/checker-dex-audit.md:26` dice que mes y año fuera de rango "solo dejan un mensaje de log". El DEX (`0x54b864`, `0x54b850 → 0x54b876`) muestra que acaban en el toast y rechazan. Falta corregir ese párrafo. El texto de `:28` ("ramas… llegan allí") ya cubre las ramas de mes y año, pero conviene nombrarlas.

## Qué impide afirmar 100 %

1. No hay ejecución en runtime (sin dispositivo/adb). Todo es estático más oráculo JVM para `gate_config` y TTL (`gate-oracle.log`, 58 configs) y 12 casos de `replay` (`checker-replay.log`), que son sintéticos y **no** prueban la ruta de red.
2. El azar es `random` de Python, no el `kc.d` sin semilla de Kotlin. Solo coincide el porcentaje, y el sorteo se inyecta explícitamente con `--draw`.
3. Cliente HTTP: `RemoteClient` usa timeout de 15 s, rechaza redirecciones y tiene tope de 16 MiB. Volley usa su política por defecto (timeout 2.5 s y un reintento). Eso puede cambiar qué respuestas se consideran "fallo de servidor". No se ha verificado.
4. El servidor (`get_status`/`save_status`, BIN `antipublic`) es externo y cambia fuera del APK. No se ha probado la ruta `run` contra datos reales.
5. D1 (coins) y el login Premium real (`get_id_token` local frente a la sesión de la app) no están equiparados.
6. Los hallazgos L1 y L2 son diferencias de coerción de tipos del servidor, no probadas con respuestas reales.

Qué sí se puede afirmar: el orden de decisión de ramas, la normalización de entrada y los rangos de la UI coinciden con las fuentes DEX/JADX revisadas. La única divergencia funcional concreta es M1, con la corrección de una línea indicada.
