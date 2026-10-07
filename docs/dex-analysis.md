# Análisis estático de DEX

## Alcance y método

Se inspeccionaron estáticamente `classes.dex`, `classes2.dex` y `classes3.dex` del APK ya extraído. No se ejecutó la aplicación ni se hicieron solicitudes de red. La captura reproducible de Radare2, con versión, SHA-256, metadatos, clases del paquete y cadenas de endpoint está en [`../evidence/radare2.log`](../evidence/radare2.log).

Herramienta: Radare2 6.2.2 (`r2 -q -c 'iI; q'`, `ic~java class`, `ic~java class.*Lapp/namso_gen/spacehowen/` y `iz~https://api.spacehowen.com`). Los DEX se reconocen como Dalvik 037; el paquete de aplicación aparece en `classes.dex` y no en las otras dos según el filtro de clases. Radare2 imprime `ERROR: Invalid checksum length` al abrir los tres archivos, pero aun así identifica arquitectura, tamaño, checksum almacenado, clases y cadenas. Trátese como advertencia de parser/checksum, no como verificación de integridad.

## Componentes observados

El paquete es `app.namso_gen.spacehowen`. Entre las clases propias identificadas están `MainActivity`, `SettingsActivity`, `CheckerHistoryActivity`, `NotificationHistoryActivity`, `ProfileViewerActivity`, `FcmApi`, `FcmService` y `data.NotesDatabase`/`NotesDatabase_Impl`. El APK también incluye numerosas dependencias Android, Firebase, Google Play y publicidad; Radare2 encuentra referencias de bibliotecas junto con las clases de la app.

La UI principal usa navegación con pestañas y ViewPager; el código conecta Firebase Authentication, compras de Google Play, anuncios, historial local y preferencias. `NotesDatabase` es una base Room. Los nombres de tabla visibles incluyen `notes`, `notifications`, `checker_batches` y `temp_mail_history`.

El paquete `h3` contiene gran parte de la lógica auxiliar ofuscada. `h3.v` enlaza el formulario de generación con guardado/búsqueda de BIN y una API propia. `h3.e1` contiene la actividad de comprobación y apunta a `/cards-checker`. `h3.d1` gestiona la obtención/procesamiento de listas de proxies públicos (fuentes Geonode y ProxyScrape visibles en JADX). Los nombres cortos y campos sintéticos dificultan asignar cada helper con confianza; confirmar una función leyendo el flujo JADX asociado, no por el nombre `h3.*` aislado.

## Servicios externos identificados en cadenas DEX

Radare2 encontró referencias a `api.spacehowen.com` para `bins-extras/save_bin.php`, `bins-extras/search_bin.php`, `cards-checker`, `fcm/tokens.php`, `fcm/track.php`, `users-coins/coins.php`, `users-proxys/buy.php`, `users-proxys/countries.php`, `users-proxys/get_proxy.php` y `verify/verify.php`. También hay referencias a `link.spacehowen.com/api/shorten`, un JSON de países en GitHub y Telegram. Son cadenas estáticas: su presencia no demuestra que se contacten en ejecución, ni revela estado actual o disponibilidad.

## Interpretación y límites

El APK implementa funciones Android, almacenamiento local, autenticación/compras y llamadas a servicios web; no existe una conversión semántica directa de DEX a Python. JADX reconstruye Java aproximado y Radare2 aporta estructura/cadenas, ambos sujetos a ofuscación, bibliotecas mezcladas y errores de decompilación. Este informe identifica componentes y límites; no valida servidores ni describe el algoritmo del comprobador o generación de números de tarjeta. Para estudiar comportamiento de forma segura, céntrate en UI, almacenamiento, ciclo de vida y contratos de datos ficticios/offline.
