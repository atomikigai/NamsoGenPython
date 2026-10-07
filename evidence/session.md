# Sesión de análisis — 2026-10-07

Objetivo: XAPK local Namso Gen 11.23 (125). Copia original conservada en
`artifacts/original.xapk`, SHA-256:
`59ab6cb7c11ff75eb699058eb0c4d118f427266fa2f474da75bc34db3516850e`.

Herramientas: Python 3, JADX 1.5.6, radare2 6.2.2, Ghidra 12.1.2_DEV,
OpenJDK 27, unzip. Las rutas de comandos reproducibles están en
`docs/reverse-engineering.md`, `tools/decompile.sh`, `evidence/radare2.log`
y `evidence/radare2-enum.log`.

| Operación | Resultado |
| --- | --- |
| Extraer XAPK y APK base con unzip | Código 0 |
| JADX normal | Código 3; fuentes y recursos recuperados, 48 errores |
| JADX fallback del enum n3.a | Código 0 |
| Ghidra intento inicial | Directorio destino inexistente; repetido tras crearlo |
| Ghidra classes3.dex | Código 0, importación/análisis guardados |
| Ghidra classes.dex + DumpNamso.java | Código 0, importación/análisis/exportación guardados |
| radare2 | DEX reconocidos; advertencia checksum conservada en logs |
| tools/inventory.py | Código 0; 11 727 Java, 80 cuerpos no decompilados, 212 URL literales, 0 .so |
| src/namso.py demo | Código 0; salida en python-validation.log |
| src/storage.py demo | Código 0; salida en storage-validation.log |
| py_compile Python y bash -n decompile.sh | Código 0 |
| Parser numérico: Unicode, overflow y límites signed-32 | Código 0; numeric-validation.log |
| Revisión independiente Codex | Dos divergencias corregidas; codex-review.md |

Orquestación Codex, análisis DEX y documentación con subagentes nativos,
implementación de algoritmos con Claude Sonnet y revisión independiente con otro agente Codex.
Se inició una revisión con Grok 4.7; se detuvo sin entrega tras una espera
prolongada. No se le atribuye ninguna validación ni aprobación.
No se ejecutó el APK, no se hicieron peticiones a endpoints descubiertos y no
se añadieron pruebas automatizadas. Sin commit, remoto, push ni publicación.

Tras detener Grok se comprobó que no quedaban procesos en su grupo local.
