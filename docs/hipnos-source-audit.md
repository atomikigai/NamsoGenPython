# Auditoría estática del flujo de gates del checker

Esta revisión compara la ruta de checker de la fuente JADX con la aproximación local en `src/namso.py`. Se hizo leyendo el APK decompilado: no se enviaron datos de tarjetas ni solicitudes al checker remoto. El APK no se ejecutó en un dispositivo durante esta revisión, así que describe lo que se puede sostener de la fuente, no una equivalencia observada en runtime.

## Gates disponibles

El fragmento declara dos chips visibles, `GRATIS` y `PREMIUM` (`h3/e1.java:681-684`). El chip Premium abre un selector si hay usuario Firebase autenticado (`h3/e1.java:767-797`); `h3/c1.java:33-60` guarda el texto elegido en `A0` e inicia el lote en modo premium. La lista del selector procede de Firebase Remote Config, parámetro `premium_gates3`: el valor por defecto es `[]`; el callback parsea un array de strings, recorta cada elemento, elimina vacíos y sustituye la lista por `[]` si falla la descarga (`h3/e1.java:2394-2420`, `e5/c.java:344-373`).

No hay ningún literal `Hipnos`/`hipnos` en las fuentes Java, recursos ni evidencia estática buscada. Eso no demuestra que nunca aparezca: el nombre puede llegar en tiempo de ejecución dentro de `premium_gates3`. Sin leer el valor activo de Remote Config desde la app o una configuración autorizada no es posible confirmar que Hipnos sea un gate disponible, qué elegibilidad aplica o qué backend le corresponde. La fuente muestra autenticación Firebase como condición para abrir/ejecutar Premium, no reglas de acceso del servidor.

## Recorrido por tarjeta según la fuente

1. La UI normaliza cada línea: reemplaza espacios ASCII por `|`, quita caracteres no ASCII y valida el formato `13–16 dígitos|MM de 2 dígitos|AAAA de 4 dígitos|CVV de 3–4 dígitos`. El código también comprueba mes 1–12 y año 2000–2100 (`h3/e1.java:833-871`). Este bloque JADX contiene una ruta de control sospechosa: tras la comprobación interna aparece un `Toast` de formato inválido y un `return` dentro del bloque de línea no vacía. Por ello no doy por probada la aceptación normal de líneas válidas solo a partir del pseudocódigo reconstruido; hace falta confirmar el bytecode o ejecutar la UI.
2. El lote Gratis usa el gate literal `GRATIS`; Premium usa `A0` y cae a `PREMIUM` si no hay nombre seleccionado (`h3/e1.java:2493-2501`). Un reinicio de lote limpia el mapa de caché en memoria (`h3/e1.java:2521-2540`).
3. Antes del remoto, una fecha vencida reconocida como 4 campos produce `ERROR`, espera 5–7,5 s y sigue (`h3/e1.java:2469-2491`). La función `o0` usa calendario local; si mes o año no se pueden parsear, devuelve `true` (vencida). Con año distinto al actual considera vigente solo años mayores al actual; con el mismo año, mes igual al actual sigue vigente (`h3/e1.java:612-632`).
4. Si no hay entrada en el mapa local, envía `POST /get_status.php` con `{gate, card}`. La respuesta lee `status` y `t`, guarda ambos en el mapa y los pasa al siguiente paso (`e5/a.java:45-62`, `h3/e1.java:2502-2511`). No hay persistencia local de ese mapa entre lotes.
5. Si la respuesta HTTP falla, cae a clasificación local con BIN considerado válido, no conserva status anterior y usa el porcentaje de gate solo en Premium; el caso Gratis usa 5% (`h3/j0.java:64-69`, `h3/e1.java:334-600`). Si llega status cacheado distinto de `LIVE`, lo muestra tal cual y no revalida. `LIVE` sin timestamp vuelve a consultar BIN (`h3/j0.java:71-88`).
6. Para `LIVE` con timestamp, envejece el estado con un límite determinista derivado de `hash(card)*31+timestamp`: `GRATIS` usa 30 min–24 h; Premium usa los rangos deterministas del nombre del gate. Si `now - t > límite`, pasa a `DIED` y llama al guardado remoto; si no, mantiene `LIVE` (`h3/j0.java:90-110`).
7. En la ruta BIN, pide los primeros seis caracteres del PAN a `https://bins.antipublic.cc/bins/…`. El objeto JSON se transforma en datos de BIN; fallo o JSON inválido equivale a `bin_ok=false` (`h3/j0.java:85-88`, `h3/r0.java:16-30`, `h3/e1.java:634-652`). El callback clasifica localmente, llama `m0` para persistir el estado si difiere del estado previo y avanza (`h3/q0.java:38-54`).
8. La clasificación `h0` devuelve `ERROR` si no hay cuatro campos o si no reconoce marca; `DIED` si hay menos de 13 dígitos, Luhn inválido o vencimiento; `ERROR` si BIN no se resolvió; si pasa esas condiciones, el resultado es una tirada aleatoria, no una autorización bancaria: Gratis 5%, Premium `livePct` del gate (o 10 cuando no hay configuración) (`h3/e1.java:334-600`). CVV no participa en esta función.

El porcentaje y envejecimiento Premium no se descargan como parámetros numéricos: `i0(nombre)` los deriva del hash Java del nombre, con XorWow sembrado; `livePct` queda entre 1–10, el mínimo entre 30 min–6 h y el máximo se forma sumando un intervalo de 6–48 h (`h3/e1.java:602-610`; modelo `h3/v0.java`). El nombre exacto del gate, por tanto, afecta esos valores.

## Diferencias comprobables con Python

`src/namso.py:299-320` porta el orden general de la clasificación local, los porcentajes y la ausencia de validación bancaria. `gate_config` implementa la derivación determinista (`:323-332`) y `live_still_alive` el envejecimiento (`:335-345`). Sin embargo, no es equivalente al flujo del APK:

- No obtiene `premium_gates3`, no presenta lista de gates ni valida autenticación/eligibilidad. El usuario puede pasar cualquier texto a `gate_config`; la app acepta solo nombres cargados de Remote Config.
- `classify_card` acepta booleanos `bin_ok` y `premium` suministrados por quien llama. No implementa consulta, status/timestamp remoto, bifurcación de caché ni transición remota de fallo a clasificación local.
- `live_still_alive` replica el cálculo de edad, pero el timestamp sigue siendo entrada manual; no reproduce la caché del servidor ni el mapa efímero del lote.
- Python parte de una línea ya separada y hace `strip().split('|')`; no reproduce la normalización completa de UI. Su `is_expired` hace que mes/año sin parsear expiren, pero no reproduce la validación UI de mes y año ni la ruta sospechosa del bloque JADX citado arriba.
- `checker_brand` está marcada como parcial (`:255-284`). La propia `h0` tiene ramas duplicadas/condicionales incoherentes de JADX alrededor de marcas (`h3/e1.java:367-562`), así que la lista/rangos de marcas no se deben presentar como fidelidad de bytecode confirmada.
- `random.Random` produce resultados distintos de `kotlin.random` de la app en ruta no sembrada (`src/namso.py:18-20,299-320`). El porcentaje es el mismo, la secuencia aleatoria no.
- El fallback Python y el cliente original reciben la validez BIN de formas distintas. En el APK, caída del lookup conduce explícitamente a `bin_ok=false` en callback y por tanto `ERROR`; en la rama HTTP de cache caída en `j0` llama a `h0(..., true, ...)`, que trata BIN como aprobado. La semántica exacta de fallo por rama se debe conservar si se integra.
- El texto de salida/guardado Python no implementa el avance retardado de la UI, agrupación por estado ni guardado condicionado Premium (`h3/e1.java:2123-2229`).

Así que los gates locales funcionan como una simulación didáctica de la fórmula recuperada, pero **no se ha comprobado que Hipnos ni los demás gates funcionen como en el APK**. No se debe afirmar “100% fiel” ni usar esa salida para inferir validez real de una cuenta o medio de pago.

## Qué falta para comprobar fidelidad

- Capturar, con la cuenta autorizada del propietario, los nombres que entrega `premium_gates3` y cómo la UI habilita Premium. La fuente no contiene los valores de configuración.
- Ejecutar el APK original y el port sobre un conjunto sintético controlado que cubra formato, expiración, ausencia/fallo BIN, respuestas cacheadas `LIVE`/`DIED`/`ERROR`, timestamp nulo y vencimiento del TTL. Comparar salidas, llamadas y marcas de tiempo, sin PAN reales.
- Revisar bytecode DEX de los bloques dañados de `h0`/validación, o descompilar con otro backend, antes de corregir supuestos de marca y aceptación de formato.
- Si se pretende validar solo el flujo UI, inspeccionar layout/callbacks de gate y la política de Remote Config con el usuario conectado. No se inspeccionó un dispositivo en esta revisión; inventario anterior registra solo artefactos estáticos.

Hasta completar esos puntos, las operaciones `checker-get`/`checker-save` documentadas en `docs/services.md` son contratos de caché observados, no un servicio de clasificación que pueda reemplazar el comportamiento completo de la app.
