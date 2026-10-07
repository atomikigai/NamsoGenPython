# Persistencia reconstruida

La capa [storage.py](../src/storage.py) reproduce en SQLite estándar las cuatro tablas de Room detectadas en [schema.sql](../evidence/schema.sql), sin acceder a red ni depender de Android. `python3 src/storage.py demo` opera una base en memoria con registros sintéticos.

| Tabla | Evidencia de origen | Operaciones reproducidas |
| --- | --- | --- |
| `notes` | `decompiled/jadx/sources/i3/k.java` (esquema), `i3/c.java` (insert), `i3/d.java` (update/delete), `i3/f.java` (campos) | alta, listado, edición, borrado |
| `notifications` | `i3/k.java`, `i3/c.java`, `i3/d.java`, `i3/n.java`, `i3/o.java` | upsert por `notificationId`, listado, borrado por antigüedad |
| `checker_batches` | `i3/k.java`, `i3/c.java`, `i3/d.java`, `i3/a.java` | alta y listado |
| `temp_mail_history` | `i3/k.java`, `i3/c.java`, `i3/d.java`, `i3/r.java`, `i3/q.java` | upsert por email, listado y borrado de un lote de direcciones |

Los tipos, nulabilidad, claves primarias y columnas siguen el SQL recuperado. `notes` y `checker_batches` usan inserción `OR ABORT` y `NULLIF(id, 0)` como Room; notificaciones e historial de correo reemplazan filas con clave existente. Los campos temporales se reciben como enteros Unix en la unidad elegida por quien invoque la API, igual que los `INTEGER` de Room.

## Alcance y diferencias

Esto es una reimplementación legible para estudiar el comportamiento, no una traducción ejecutable del bytecode ni un reemplazo compatible con la aplicación Android. Python usa `sqlite3` síncrono; no reproduce Room, coroutines, observables, invalidación reactiva, configuración de archivo Android ni migraciones. Se omite `room_master_table`: es metadato interno de Room, no una de las cuatro entidades de la aplicación. Los listados siguen el orden temporal descendente de `h3/o.java`; `list_checker_batches(premium=False/True)` reproduce las pestañas GRATIS y restantes, y sin argumento lista ambas. No se usan credenciales ni datos del APK en la demostración.
