# Challenge API-Rest Foro Alura
<p align="center" dir="auto">
<img align="center" src="https://github.com/GioScarp/api-foro-alura/blob/main/src/main/resources/images-readme/GitHub_Api.png" width="50%">
</p>

>El foro de Alura proporciona a los alumnos un espacio dedicado para compartir sus preguntas sobre cursos específicos. En esta ocasión, se plantea una solución a este challenge que permite almacenar de manera correcta la información relacionada con los tópicos, respuestas, usuarios y cursos.

>Utilizando Spring Boot, se diseña una API REST que maneja las operaciones de creación, lectura, actualización y eliminación de los diferentes elementos del foro. Se implementa un sistema de almacenamiento de datos que garantiza la integridad y la relación adecuada entre los tópicos, respuestas y usuarios


## Table of Contents

- [Contexto del Challenge](#contexto-del-challenge)
- [Requerimientos del Challenge](#requerimientos-del-challenge)
- [Funcionalidades](#funcionalidades)
- [Demo](#demo-wip)
- [Instalación](#instalación)
- [Tecnologías usadas](#tecnologías-usadas)
- [Insignia Obtenida](#insignia-obtenida)
- [License](#licencia)
- [Autor](#autor)

# Contexto del Challenge

>El foro de Alura es un espacio colaborativo donde los alumnos comparten preguntas sobre cursos específicos. A nivel técnico, surge la curiosidad sobre cómo funciona en términos de almacenamiento y relación de datos entre tópicos, respuestas y usuarios. 
Nuestro desafío será crear una API REST con Spring para replicar este proceso en el backend.

## Requerimientos del Challenge
Nuestra API va a centrarse específicamente en los tópicos, y debe permitir a los usuarios:

    - Crear un nuevo tópico
    - Mostrar todos los tópicos creados
    - Mostrar un tópico específico
    - Actualizar un tópico
    - Eliminar un tópico

### Funcionalidades
    - API con rutas implementadas siguiendo las mejores prácticas del modelo REST;
    - Validaciones realizadas según reglas de negócio;
    - Migración de una base de datos para la persistencia de la información;
    - Efectuar cambios en la base de datos para almacenar datos de autenticación de los usuarios
    - Desarrollar formas de autenticación con Spring Security
    - Uso del token JWT
    - Documentación con Swagger

# Demo WIP
![]()

# Instalación

1. Clonar el repositorio o descargar el proyecto en formato zip

2. Una vez tengas el proyecto en tu maquina local, puedes buscar el archivo pom.xml y abrirlo con tu `IDE` preferido o puedes abrirlo directamente desde tu `IDE` en archivo -> importar proyecto o una opción similar y seleccionar el archivo zip descargado.

3. Antes de ejecutar la aplicación, asegúrate de tener una base de datos configurada. En este proyecto, se utiliza `Flyway` para gestionar las migraciones de la base de datos. Asegúrate de tener una instancia de la base de datos en ejecución y configure los parámetros de conexión en el archivo `application.properties`.

    * spring.datasource.url
    * spring.datasource.username
    * spring.datasource.password

4. Una vez tengas la base de datos configurada, compile, ejecute el proyecto y pruebe la app.


# Tecnologías usadas

Principalmente se desarrollo dentro del IDE de _Intellij IDEA_, empleando el **lenguaje Java 17** con **Spring Boot 3.0** 
<p align="center" dir="auto">
<img align="center" src="https://skills.thijs.gg/icons?i=java,spring,mysql,idea,maven,postman,git,github,docker&perline=10" />
</p>

#### Extras:

* JWT / Spring Security
* Flyway / JPA
* Swagger

# Insignia Obtenida
<p align="center" dir="auto"><img src="https://github.com/GioScarp/api-foro-alura/blob/main/src/main/resources/images-readme/Insignia_Foro_Alura.png" width="50%"></p>
<p align="center" dir="auto">Insignia obtenida por la finalización del proyecto </p>

# Licencia
Este proyecto está licenciado bajo la Licencia MIT
# Autor
<p align="center" dir="auto"><img src="https://github.com/GioScarp/GioScarp/blob/main/Banner_Dev_2.png" width="100%"></p>
<p align="center" dir="auto">Creado con 💙 por Giovanni Scarpetta</p>
