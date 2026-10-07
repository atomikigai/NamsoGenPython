# Recuperación del enum `n3.a`

La salida JADX normal para `n3.a` quedó dañada por `JadxRuntimeException` durante la conversión del enum. Se recuperaron los valores desde el bytecode Dalvik directamente con Radare2; la captura íntegra del inicializador está en [`../evidence/radare2-enum.log`](../evidence/radare2-enum.log). La salida de respaldo [`../evidence/n3-a-fallback.java`](../evidence/n3-a-fallback.java) confirma los nombres y el orden.

El constructor `<init>(IILjava/lang/String;I)` recibe ordinal, valor para `f7236a`, nombre y valor para `f7237b`. En su bytecode (`0x0059415a` y `0x0059415e`) almacena el segundo argumento en `a` y el cuarto en `b`. El inicializador estático pasa literales para ambos argumentos en las llamadas del enum. Por lo tanto, `f7236a` es la longitud configurada de número y `f7237b` la longitud configurada de CVV.

| Tipo | Campo enum | `f7236a` | `f7237b` |
|---|---:|---:|---:|
| AMEX | `f7228c` | 15 | 4 |
| VISA | `f7229d` | 16 | 3 |
| MASTERCARD | `e` | 16 | 3 |
| DISCOVER | `f7230f` | 16 | 3 |
| JCB | `f7231r` | 16 | 3 |
| DINERS | `f7232s` | 14 | 3 |
| UNIONPAY | `f7233t` | 16 | 3 |
| UNKNOWN | `f7234u` | 16 | 3 |

Evidencia capturada con Radare2 6.2.2 sobre `artifacts/apk/classes.dex` (SHA-256: `4ab3eb892fb05ca83715c5b008ef09cbc3a0ed5d6ae3a11a3c16ae8e5f22319d`): `pd 60 @ 0x00594078` cubre `<clinit>` y sus invocaciones al constructor; `pd 4 @ 0x00594154` muestra las dos asignaciones de campo y el retorno. Son constantes del enum halladas en el APK; esto no prueba qué valores admite un servicio remoto.
