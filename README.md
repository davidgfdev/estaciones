# Microservicio de Estaciones

REST de una lista de estaciones.

Gestión de dependencias con Maven.




## Deployment

Para desplegar este proyecto:

    1. Crear una nueva Base de Datos de nombre "railes".

    2. Ejecutar el script sql "data.sql" en main/resources.

    3. Cambiar el user y el password en application.properties.

    4. Instalar dependencias de Maven.

```bash
  mvn clean install
```

    5. Asegurarse de que el puerto 8080 está libre.

    6. Ejecutar el Main del proyecto.

## Casos de Uso

### Obtener todas las estaciones.

METHOD: GET, RUTA: **estaciones**

### Obtener una estación por su nombre.

METHOD: PUT, RUTA: **estacion/{nombreEstacion}**

### Obtener todas las estaciones en una ubicación.

METHOD: GET, RUTA: **estaciones/{ubicacion}**

### Crear una estación nueva.

METHD: POST, RUTA: **estacion/{idEstacion}/{nombreEstacion}/{ubicacion}**
