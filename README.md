# Librería DLS de Componentes

Esta librería permite la construcción de los compontentes del sistema de diseño basados en Kotlin 

# Proyecto de ejemplo de DLS

Este proyecto muestra la integración de la librería que contiene el DLS dentro del proyecto y su utilización.

****Recomendaciones:

-Asociar repositorio de código fuente antes de la descarga de la app desde la opción VCS: -> Enable Version Control Integration

-En caso de no contar con un dispositivo físico puede configurar un dispositivo virtual que soporte al menos un API 30 o superior.

-Considerar tener la última actualización de Android Studio

****Instalación

1.- Descargar el proyecto de repostitorio
2.- Realizar la sincronización a través de Gradle (puede tardar varios minutos)
3.- Agregar la dependecia de la librería en el archivo Gradle (app):
              implementation files('../libs/library.aar')
4.- Una vez realizada esta acción es necesario volver a realizar la sincronización del proyecto
5.- Ejecutar el proyecto ya sea con un dispositivo físico o virtual

NOTA: Cada vez que se actualice la librería se requiere actualizar el archivo en la ruta indicada para obtener los nuevos cambios.
