# Challenge API Foro Alura
![](https://github.com/GioScarp/convertidor_monedas/blob/main/convertidor_moneda/resources/Readme_Recursos/Conversor_Multiple.png)

El foro de Alura proporciona a los alumnos un espacio dedicado para compartir sus preguntas sobre cursos específicos. En esta ocasión, se plantea una solución a este challenge que permite almacenar de manera correcta la información relacionada con los tópicos, respuestas, usuarios y cursos.

Utilizando Spring Boot, se diseña una API REST que maneja las operaciones de creación, lectura, actualización y eliminación de los diferentes elementos del foro. Se implementa un sistema de almacenamiento de datos que garantiza la integridad y la relación adecuada entre los tópicos, respuestas y usuarios


## Table of Contents

- [Contexto del Challenge](#Contexto-del-Challenge)
- [Requerimientos del Challenge](#Requerimientos-del-Challenge)
- [Funcionalidades](#Funcionalidades)
- [Demo](#demo)
- [Características](#características)
- [Pasos de instalación](#pasos-de-instalación)
    - [JAR](#ejecutable-jar)
    - [Intellij](#intellij-idea)
- [Proceso](#proceso)
- [License](#licencia)
- [Autor](#autor)

# Contexto del Challenge

El foro de Alura es un espacio colaborativo donde los alumnos comparten preguntas sobre cursos específicos. A nivel técnico, surge la curiosidad sobre cómo funciona en términos de almacenamiento y relación de datos entre tópicos, respuestas y usuarios. 
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
    - Implementación de una base de datos para la persistencia de la información;
    - Efectuar cambios en la base de datos para almacenar datos de autenticación de los usuarios
    - Insertar maneras de autenticación con Spring Security
    - Uso del token JWT
    - Documentación con Swagger

# Demo
![](https://github.com/GioScarp/convertidor_monedas/blob/main/convertidor_moneda/resources/Readme_Recursos/Convertidor_Multiple.gif)

# Características
* Consumo de Appi's [Exchange Rate Data API](https://apilayer.com/marketplace/exchangerates_data-api)
* Tasa de cambio actual de las diferentes monedas disponibles
* Interfaz gráfica agradable e intuitiva
* Validaciones a los datos ingresados por parte del usuario
* Texto informativos a medida de que el usuario interactua con la app
# Pasos de instalación
### Ejecutable JAR
1. Clonar el repositorio
2. Ejecutar el Jar (convertidor_moneda.jar) que se encuentra en la carpeta raiz del proyecto
3. Disfrute de la aplicación
### Intellij IDEA
1. Clonar el repositorio
2. Abir proyecto en Intellij
3. Run main y disfrutar la aplicación

# Proceso
### Tecnologías usadas
* Java 17
* Spring Boot 3
* Postman/Insomnia
### Estructura del proyecto
* Resources
* src
    * Config
        * Properties
    * Controladores
        * Controlador Moneda
        * Controlador Temperatura
    * Vistas
        * Vista Moneda
        * Vista Temperatura
        * Vista Main
#### Clase Moneda
    public class Moneda {
        private String nombre;
        private String simbolo;
        private ImageIcon icono;

        public Moneda(){
        }
    }
#### Clase Temperatura

    public class Temperatura {
        private double temperatura;
        private String simbolo;
        private String nombre;
        private ImageIcon icon;
    
        public Temperatura(){

        }
    }

### Validaciones
* Solo son válidos números enteros o decimales
* Para el convertidor de moneda no se aceptan valores negativos o valor 0
* Para poder convertir se debe seleccionar las monedas correspondientes o la temperatura principal

# Licencia
Este proyecto está licenciado bajo la Licencia MIT
# Autor
Creado con 💙 por Giovanni Scarpetta