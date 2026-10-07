# Procedimiento y evidencia

## Alcance

Análisis estático del archivo XAPK proporcionado. No se ejecutó el APK, no se
instaló en Android, no se contactaron endpoints extraídos y no se verificaron
compras, tarjetas ni cuentas. Las llamadas a CLIs de IA se usaron para implementar
y revisar el port. La fuente de comportamiento es el artefacto local.

## Inventario

Ejecutar `python3 tools/inventory.py` desde cualquier directorio regenera:

- `evidence/inventory.json`: SHA-256, tamaños, manifiesto, cantidad de Java y
  métodos con `Method not decompiled`.
- `evidence/url-literals.json`: literales URL con archivo y línea; no certifica
  que sean endpoints activos. Incluye dependencias y referencias de documentación.
- `evidence/schema.sql`: cuatro tablas de aplicación recuperadas de `i3/k.java`.

Se recuperaron 11 727 archivos Java, 80 cuerpos con `Method not decompiled`,
212 literales URL y ninguna biblioteca `.so` en el APK base. El log JADX registra
48 errores: esta cifra cuenta errores de la herramienta, no los 80 cuerpos
irrecuperados detectados por búsqueda de marcadores. El XAPK contiene APK base,
18 splits de idioma/densidad, icono y manifiesto JSON.

## JADX 1.5.6

Se reutilizó la instalación local disponible en otro proyecto, copiada a
`tools/jadx-1.5.6/`, sin modificar aquel proyecto.

```sh
tools/decompile.sh /ruta/app.namso_gen.spacehowen_11.23.xapk tools/jadx-1.5.6/bin/jadx
```

El comando conserva `evidence/jadx.log` y devuelve el estado de JADX. Un estado
no cero puede dejar fuentes útiles; consulta sus marcadores y las verificaciones
cruzadas antes de traducir. Los bucles imposibles, variables inconsistentes y
condiciones invertidas visibles en Java son artefactos de decompilación.

## Ghidra

Ghidra se usó en modo headless sobre DEX directamente: no hay código nativo que
requiera decompilación ELF. `evidence/ghidra.log` acredita importación/análisis de
`classes3.dex`; `evidence/ghidra-classes.log` acredita análisis de `classes.dex`
y ejecución de `tools/DumpNamso.java`. El primer intento falló por ausencia del
directorio destino; se creó y se repitió correctamente, sin alterar la muestra.

```sh
mkdir -p evidence/ghidra
analyzeHeadless evidence/ghidra NamsoGen -import artifacts/apk/classes.dex \
  -analysisTimeoutPerFile 120 -max-cpu 2 -scriptPath tools \
  -postScript DumpNamso.java evidence/ghidra-classes.txt
```

Si `analyzeHeadless` no está en PATH, usar su ubicación en la instalación Ghidra.
La exportación contiene 53 958 funciones (incluye dependencias y métodos externos)
y 42 selecciones para intentar decompilar. El pseudo-C de Ghidra ayuda a contrastar
flujo y constantes DEX; no es C original ni Java compilable. La base local está en
`evidence/ghidra/NamsoGen.gpr` y puede abrirse con Ghidra.

## radare2

Consultar `docs/dex-analysis.md` y `evidence/radare2.log`: se leyeron metadatos,
clases y cadenas de los tres DEX con radare2 6.2.2. Conservamos sus advertencias
de checksum; no se interpretan por sí solas como corrupción o protección.

## Verificación

No se crearon pruebas automatizadas. La ejecución directa del port se registra en
`evidence/python-validation.log`, junto con la revisión independiente. El análisis
estático no demuestra equivalencia completa de una app Android sin ejecutarla;
los servicios remotos y SDKs permanecen documentados como fronteras externas.

## Ampliación HTTP y terminal

La integración posterior y la resolución de revisiones están en [services-integration.md](../evidence/services-integration.md). Hay clientes HTTP reales y autenticación REST condicional; se separan las ejecuciones locales, las respuestas sintéticas loopback y las consultas reales de lectura. La cuenta del propietario queda para comprobación posterior por su decisión.
