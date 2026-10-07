# Port Python de la lógica local de Namso Gen

Fuente: APK `app.namso_gen.spacehowen`, decompilado con jadx 1.5.6 (`decompiled/jadx/sources`, rutas relativas a ahí). Análisis **estático**: no se ejecutó el APK ni se contactó ningún endpoint. Port en `src/namso.py` (solo biblioteca estándar). Los nombres de clase están ofuscados (R8); las líneas son del fichero decompilado.

```
python3 src/namso.py --help
python3 src/namso.py demo                       # determinista, seed 2026, hoy=2026-10
python3 src/namso.py --seed 1 gen-card 4111xxxxxxxxxxxx -n 3 --month 12 --year 2030
python3 src/namso.py check "4111111111111111|12|2030|123" --today 2026-10 --gate PREMIUM
python3 src/namso.py gate PREMIUM
python3 src/namso.py iban ES
python3 src/namso.py cpf
python3 src/namso.py password 16
python3 src/namso.py mail-dots abcd -n 5
```

## La ruta local `e1.h0`: LIVE/DIED simulado

`h3.e1.h0` (e1.java:334-600) solo comprueba formato local (4 campos, marca reconocible, ≥13 dígitos, Luhn, no vencida). Si todo pasa, el resultado es **una tirada de dado**: `Random.nextInt(100) < pct` → `LIVE`, si no `DIED` (e1.java:592-599). `pct` = 5 (gratis), o `livePct` del gate (1-10) en premium, o 10 sin gate. No hay consulta a banco, ni autorización, ni saldo; el CVV (4.º campo) no se usa. El resultado no dice nada sobre la tarjeta real. `ERROR` = formato/marca inválidos, o la consulta BIN (`z4`) falló.

El "envejecimiento" de las tarjetas LIVE en caché (j0.java ~78-98) también es sintético: un temporizador pseudoaleatorio sembrado con `hash(tarjeta)*31 + ts` decide cuándo "muere" (30 min–24 h por defecto).

## Trazabilidad

| Función Python | Origen (clase.método, líneas) |
|---|---|
| `generate_cards`, `luhn_check_digit` | `com/google/android/material/datepicker/n.java` case 5 (128-330; Luhn 226-240) |
| `brand_from_bin` | `jd/l.java:189-267` (`jd.l.i`) |
| `BRANDS` (longitud PAN, CVV) | `n3/a.java` enum; args perdidos en jadx normal, recuperados con `jadx --fallback --single-class n3.a` (AMEX 15/4; DINERS 14/3; resto 16/3) |
| `sanitize_bin` | `h3/v.java:52-62` (`v.b0`); `v.d0` (155+) solo rellena con `x` el campo UI |
| `classify_card`, `luhn_valid` | `h3/e1.java:334-600` (`e1.h0`; Luhn 560-571; dado 592-599) |
| `is_expired` | `e1.java:612-632` (`e1.o0`) |
| `gate_config` | `e1.java:602-610` (`e1.i0`) + PRNG `jd/l.java:50-67`, `kc/d.java:24-96`, `kc/e.java:25-44` |
| `live_still_alive` | `h3/j0.java` (runnable `m0`, ~78-98) |
| Normalización de entrada del checker (no portada, ver límites) | `e1.java:835-870` (regex `^(\d{13,16})\|(\d{2})\|(\d{4})\|(\d{3,4})$`, espacio→`|`) |
| `iban_check_digits` | `h3/c0.java:50-56` (`c0.b0`), mod 97 estándar |
| `iban_es` / `_es_dc` | `c0.java:299-307`, `58-68` (`c0.c0`) |
| `iban_de` | `c0.java:246-264` |
| `iban_it` | `c0.java:157-181` |
| `iban_fr` | `c0.java:189-243` |
| Orden del spinner (ES, DE, IT, FR) | `resources/res/values/arrays.xml:34`, `h3/b0.java` case 0 |
| `generate_cpf`, `cpf_valid` | `h3/x.java:171-182`, `205-240` |
| `generate_password` | `h3/k.java:109-122` (`e0.java:24` pone "12") |
| `dot_variants`, `mail_variants` | `h3/i1.java:35-52`; `n.java` case 8 (394+) |

La tabla de PAN/CVV fue también contrastada directamente con radare2: [recuperación del enum](enum-recovery.md). Esta conclusión describe `e1.h0`; el APK también tiene peticiones remotas, cuyo comportamiento no se ha ejecutado ni recuperado.

## Fidelidad y diferencias explícitas

- **PRNG**: la app usa `kotlin.random` no determinista (`kc.d.f6207b`). El port usa `random.Random` (`--seed`). Solo `KotlinXorWow` (`gate_config`, `live_still_alive`) reproduce el XorWow sembrado de Kotlin; escrito desde el código, **no contrastado contra una ejecución real** (no se ejecutó el original).
- **Marca del checker**: jadx dañó el flujo de `e1.h0` (bloques duplicados, `if` vacíos). `checker_brand` es reconstrucción parcial; solo afecta a ERROR vs. resto. JCB 16 dígitos está inferido. La marca del *generador* (`brand_from_bin`) sí es legible completa.
- **Quirks conservados**: la marca del generador usa solo los dígitos del BIN (descarta `x`); prefijo > longitud-1 se trunca; años aleatorios fijos 2026-2040; mes no se rango-valida en `is_expired`; FR usa clave RIB fija `92` (IBAN cumple mod 97 pero no la clave RIB real); IT/FR/DE usan bancos/oficinas fijos; las contraseñas usan PRNG no criptográfico.
- `iban_mod97_ok` es una utilidad añadida para la demo (no existe en el APK).
- Los helpers numéricos reproducen el límite signed-32 y dígitos decimales BMP de Java. En generación Luhn se conserva la saturación de `char - 48` a 0–9 (`jd.d.g`); en el checker se conserva la resta directa del original. La interfaz Android del checker elimina previamente caracteres no ASCII; la CLI documenta esa normalización como omitida.
- `frecuencia 0-99 < pct`: se usa `randrange(100)`, equivalente a `nextInt(100)`.

## Omisiones (no portado)

- Red: `https://api.spacehowen.com/cards-checker` (`get_status.php`, estado de gates/caché; e1.java:122, 2509-2512), `bins.antipublic.cc/bins/<BIN6>` (consulta BIN → `z4`), `api.spacehowen.com/bins-extras/save_bin.php` (v.java:120+), `raw.githubusercontent.com/spacehowen/world-data-json` (generador de datos por país, z.java), correo temporal, IP, acortador de URL.
- Backend: respuestas del servidor y su caché (`f4685z0`), lista `premium_gates3`, nombres de gates (solo "GRATIS" y "PREMIUM" visibles); el `ts` de `live_still_alive` es entrada del usuario.
- GUI, portapapeles, monedas (`coin_balance`), Google Billing, Firebase Auth y anuncios. La persistencia de notas e historiales está reconstruida separadamente en [storage.py](../src/storage.py); no conecta automáticamente la CLI a una base persistente.
- Normalización/validación de entrada del checker por regex (e1.java:835-870): descrita, no implementada; `check` acepta una línea ya con `|`.
- No se usaron credenciales ni se configuraron servicios remotos. Los recursos decompilados conservan la configuración que venía incluida en el APK.

Datos de las demos: sintéticos (BIN `4111…`, PAN de prueba públicos). La memoria `d935t33t` corresponde a otro APK y no se usó como evidencia.
