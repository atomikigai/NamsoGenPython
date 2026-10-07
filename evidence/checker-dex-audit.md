# Auditoría DEX del comprobador de tarjetas

## Alcance y evidencia

Se inspeccionó estáticamente `artifacts/apk/classes.dex` (SHA-256 `4ab3eb892fb05ca83715c5b008ef09cbc3a0ed5d6ae3a11a3c16ae8e5f22319d`) con Radare2 6.2.2 (`r2 -q -c 'af @ 0x00543658; pdf @ 0x00543658; q'` y `r2 -q -c 'af @ 0x0054b4d8; pdf @ 0x0054b4d8; q'`). Las capturas completas, con comandos, versión y hash, están en [`checker-h0.disasm.txt`](checker-h0.disasm.txt) y [`checker-input.disasm.txt`](checker-input.disasm.txt). `h3/s0.onClick` es un listener sintético: el caso 3 (dirección `0x0054b508` en la tabla) contiene el chequeo de entrada. No se ejecutó la aplicación ni se contactaron servicios.

## Clasificación (`h3/e1.h0`)

El método comienza con `trim`, divide por `|` y exige cuatro campos (`0x543658–0x54368a`). Del PAN del primer campo conserva solo caracteres para los que Java `Character.isDigit` resulta cierto (`0x5436cc–0x5436f0`); usa ese PAN normalizado para la detección de marca. Reglas que controlan las ramas del DEX:

- AMEX: longitud 15 y prefijo 34 o 37 (`0x543700–0x54372c`).
- VISA: longitud 13 a 16 y prefijo 4 (`0x543734–0x543780`).
- MASTERCARD: longitud 16 y prefijo de dos dígitos 51–55, o de cuatro 2221–2720 (`0x543788–0x5437fa`; cotas codificadas como 51/56 y 2221/2721).
- DISCOVER: longitud 16; prefijo 6011 o 65, rango de tres dígitos 644–649 o seis dígitos 622126–622925, ambos inclusivos (`0x5437fe–0x54389c`; la cota superior del rango de seis dígitos se compara como exclusiva 622926).
- JCB: longitud 16 y prefijo de cuatro dígitos 3528–3589 (`0x54389e–0x5438e4`; rango de comparación 3528–3590).
- DINERS: longitud 14 y prefijo 36 o 38, o prefijo numérico 300–305 (`0x5438e6–0x543950`).

No hay ramas que asignen UnionPay ni marca Unknown: PAN sin coincidencia termina en `"ERROR"`. La tabla refleja restricciones de detección, no certifica validez de una tarjeta. Los mensajes exactos de marca están en las constantes de cadena referidas por el disassembly.

Después de elegir marca, el método devuelve `"DIED"` si longitud del PAN <13, falla Luhn o `o0(mes,año)` devuelve verdadero. `z4=false` produce `"ERROR"`. En caso contrario calcula `Random.nextInt(100)` y devuelve `"LIVE"` si es menor que el umbral, o `"DIED"` si no (`0x543950–0x543a40`). El umbral es 5 por defecto y puede venir de `Integer`; el flujo de argumentos de cada llamada no se resolvió aquí. La salida LIVE/DIED es por tanto un clasificador local probabilístico, no prueba de autorización bancaria ni una consulta de red.

## Formato validado en la UI (`h3/s0.onClick`, caso 3)

El campo se recorta, separa por líneas y procesa una a una. Cada línea se recorta, los espacios ASCII se sustituyen por `|`, y se borran caracteres fuera del rango ASCII `\x00–\x7F` (`0x54b688–0x54b720`). La expresión se aplica con `Matcher.matches()` y exige exactamente `^(\d{13,16})\|(\d{2})\|(\d{4})\|(\d{3,4})$` (`0x54b734–0x54b772`): PAN de 13–16 dígitos ASCII, mes de 2, año de 4 y CVV de 3 o 4. Líneas vacías saltan a la siguiente; no se admiten separadores de guion directamente.

Luego parsea mes y año como enteros. Si el mes queda fuera de 1–12 o el año fuera de 2000–2100, solo deja un mensaje de log y continúa (`0x54b814–0x54b876`); esos rangos no rechazan la línea en esa etapa. CVV con longitud distinta de 3–4 va al toast de error. Si todas las líneas pasan, el iterador termina en `0x54b89e` y se registra “Tarjetas válidas”. También hay una condición previa de selección de chip gratis/premium.

**Toast:** el bloque `Toast.show()` en `0x54b876–0x54b89a` no es un fallthrough incondicional. Las ramas por regex que no coincide (`0x54b772→0x54b876`), parseo entero nulo (`0x54b7e8`/`0x54b808→0x54b876`) y CVV inválido (`0x54b84e→0x54b876`) llegan allí. Una línea válida con CVV correcto retorna al iterador (`0x54b838→0x54b6b4`); cuando no quedan líneas, continúa por `0x54b89e`. La sospecha a partir de JADX `e1.java:833–871` es un artefacto de reconstrucción/controlflow; el DEX descarta el toast incondicional.

## Recomendaciones de fidelidad para `src/namso.py`

- `checker_brand` en `src/namso.py` ya coincide con las seis ramas confirmadas; solo conviene reemplazar en su docstring “RECONSTRUCCIÓN PARCIAL” y “JCB inferido” por estas reglas verificadas. El DEX exige cuatro campos antes de detectar marca, pero no examina CVV en `h0`.
- La normalización del método Java permite cualquier dígito Unicode para marca/Luhn, mientras que el filtro de UI solo conserva ASCII; una traducción Python fiel debe decidir si replica la etapa del método o la entrada desde UI. No equiparar ambos filtros.
- No modelar LIVE como respuesta de una pasarela: es umbral pseudoaleatorio luego de verificaciones locales. `classify_card` refleja ese método, pero la UI también filtra formato; si se desea emular el flujo entero, añadir esa validación solo por petición explícita.

## Límites

El análisis es estático y se limitó a esos dos métodos del DEX. No determina el significado de todos los booleanos, la procedencia/valores efectivos del umbral para cada llamada, la implementación completa de `o0`, ni el flujo posterior premium/autenticación; no se hizo análisis dinámico ni interacción con endpoints. La marca detectada tampoco valida titularidad ni estado real de una cuenta.
