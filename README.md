# Challenge API-Rest Foro Alura
<p align="center" dir="auto">
<img align="center" src="[https://photos.google.com/u/2/album/AF1QipP2zXD39Tb667nCi2b2SuzkMaO_Mupul-y7o-La/photo/AF1QipMGO79YqyII5ePSE8ns4OtISW83bzkjKLSCwOt0](https://lh3.googleusercontent.com/pw/AIL4fc_JuguzRK3rHhetVHXl70KY-XP-RQqFsVk8OxomoVx5pVgD6E0Lv1ovXejheflF7lCh9gB6noG4gVxUYQGTgG_UhSDDqUP-OdsKEvu92CUMy90HOit63E7RGElBuXskrfrFz3DQNx7cg5NKc6_Gn-UoM6Q8szkccX07DC1dYK2XB3yLNaJNxQaGN6VrnlAjrXfRTBABRFfQxwEdbsB9edBKC1TXyHgigXdk5exifqryKC5blw7qUfBTP1tPhaHOGXSiZQhsXOlUqQC9Po2SW0QVZryopL8Bl2ZcFKe6NiLw9bD_JXN7lkfgEpbJowoUV9AW6lpe_sax_TonwxpbTTMOEXwoaGxKUbgPg869T5FyQl2MJ1vBl0dxki6ONz1gNR8kpud-W-ZH3R98fJjhhegrWYSpKCyGWW5J9W2RMhg6VRefPbJFkMxdry0opu5x43UKhGgLxT0sB6WfLGGglBv-k9P4IC8FwcRFSvtDtINwja82fMIVdxXHM_T4IkuW5JmQGBcJvc3Rs5luDuE192J_d6-xoSlwTFz-k795gl37VcnKiOTxfYaPh3KbqFV_0Sc4M0DtIVfu1miUxfenwPmld2Z6PdMjpaFN_SitlbtssNcIemCXTTZIzqO_GpUCRXf1GGaFMcva3arhRZparjF59eb40ZxrzfuU2fngiP4Dvxb_Rpd3p7M4aYmbsnDkeduvtraTj389rJ360TW3kn4jgHl0LwGgOx5E7rpJREIBUsD5e3pbcbGalhvDfcnct-oRIvung_j7UqKlYqzhB7CGZ6kLrorkmeR9EmR9bHciyxVz4WcR5owZBRC2dhGFszSjOf46zkFrz8WebpDjCZ5HYTj-BYvBUs1IzG_0wn4cZsOkNq1x9PydBDtQHtmfD1YRQ2raibPycLc2SPLB9XlY6Wpc4rmhqSzdjktCBZN-JJqju9Cnfialvy5RYpybSWPWnu7ilB8PeF_USNp23NnOeTm6NHw=w1262-h931-s-no?authuser=2)" width="80%">
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
<p align="center" dir="auto"><img src="[https://photos.google.com/u/2/album/AF1QipP2zXD39Tb667nCi2b2SuzkMaO_Mupul-y7o-La/photo/AF1QipPvAdbG7Igg0go5W1BEUFf4CtDddxXVA3117ter](https://lh3.googleusercontent.com/pw/AIL4fc9iyGIpLZTjKXpCD8wsE6N1g9f7DC9jsOlbtyY2g2DQ_X8I88hfNAehh0nF6theO9NiAoQwPMwsWBlkZWSV9V-QnJyCGLTj1NRa1DbSoF8rm-yHSbrJCFO9wQePwBSXF0hutY9XYauH-H06E98s9hVcethT5aze2zkcv7nZn2AKseNZr9n6sNwD0UKGQrDN16LOR5x7_zc3Z4e5uUgwiyb4UgF11w6hN5gBhUQFrdlCC7QOu4eKdeA9-ENTrWFLwZcQGZYf7vgZipKNv8BYQRiDBRZdXUnBTHWJO9nOrD89wiaJ-rTRS_7vYOl35_C7uuQAcdbhz4wdTD5araeZ9BIWAHBU1HrwsJkEHATVFx1IWfL6cSCj1fueFmarRrkxAnmerKPUsqk-XyIDnKHdB_gfpvFavHqkQZ0rNyCLtiwDY0_-ad9EutWhqx7oio8Gm6pVQvu93aj81Dp_M_N7bJOQ1U8BDgLeODnqWZVvizVpL10jEXJ9g3leNFyGc9e3TuRPsjgR5gwttBvxtvGEmyRySttVzhp4NRzHaZ7bcB0HLXVwyGmZTAJqb4k1QsX5hMMbBveUld2-gXJnIL2CfyH7R89lVksIGWOTw-1vf-OWMwcUFOYvNw-8HJNJixg8mGOf-R7zD-y9_MCa-G3BZ-W5Kd6dkSl5pIIn1lOsg0pgO2axzFMgqsP2qBREOg3___3SVrlEjno97dwz6Uy2DI9qkV2P39QWaPvarZmcoov_WQfE2-tTq66TnjaJTEGB9NfVAj5oSU_KYopNe9PhXWSxIOpLn8GEX8afw6bngB7OTyIFxgITDazN78E_tjAW8OGGPWf7XdfDmiklGhAHbvyOJKk7BwIZv26Vu0KZmdcMWlvayNL2v8MYoVW6fwCZ1VKva-izMeKwFFbrXwsTOTYDO6xoEu0Lei2LP3Gx-uHN9TudIr3NG_R_e5OcZIWmaFdw--_xxG2uTybr1HPnP2bvP0Bdfq4=w361-h442-s-no?authuser=2)https://lh3.googleusercontent.com/pw/AIL4fc9iyGIpLZTjKXpCD8wsE6N1g9f7DC9jsOlbtyY2g2DQ_X8I88hfNAehh0nF6theO9NiAoQwPMwsWBlkZWSV9V-QnJyCGLTj1NRa1DbSoF8rm-yHSbrJCFO9wQePwBSXF0hutY9XYauH-H06E98s9hVcethT5aze2zkcv7nZn2AKseNZr9n6sNwD0UKGQrDN16LOR5x7_zc3Z4e5uUgwiyb4UgF11w6hN5gBhUQFrdlCC7QOu4eKdeA9-ENTrWFLwZcQGZYf7vgZipKNv8BYQRiDBRZdXUnBTHWJO9nOrD89wiaJ-rTRS_7vYOl35_C7uuQAcdbhz4wdTD5araeZ9BIWAHBU1HrwsJkEHATVFx1IWfL6cSCj1fueFmarRrkxAnmerKPUsqk-XyIDnKHdB_gfpvFavHqkQZ0rNyCLtiwDY0_-ad9EutWhqx7oio8Gm6pVQvu93aj81Dp_M_N7bJOQ1U8BDgLeODnqWZVvizVpL10jEXJ9g3leNFyGc9e3TuRPsjgR5gwttBvxtvGEmyRySttVzhp4NRzHaZ7bcB0HLXVwyGmZTAJqb4k1QsX5hMMbBveUld2-gXJnIL2CfyH7R89lVksIGWOTw-1vf-OWMwcUFOYvNw-8HJNJixg8mGOf-R7zD-y9_MCa-G3BZ-W5Kd6dkSl5pIIn1lOsg0pgO2axzFMgqsP2qBREOg3___3SVrlEjno97dwz6Uy2DI9qkV2P39QWaPvarZmcoov_WQfE2-tTq66TnjaJTEGB9NfVAj5oSU_KYopNe9PhXWSxIOpLn8GEX8afw6bngB7OTyIFxgITDazN78E_tjAW8OGGPWf7XdfDmiklGhAHbvyOJKk7BwIZv26Vu0KZmdcMWlvayNL2v8MYoVW6fwCZ1VKva-izMeKwFFbrXwsTOTYDO6xoEu0Lei2LP3Gx-uHN9TudIr3NG_R_e5OcZIWmaFdw--_xxG2uTybr1HPnP2bvP0Bdfq4=w361-h442-s-no?authuser=2" width="80%"></p>
<p align="center" dir="auto">Insignia obtenida por la finalización del proyecto </p>

# Licencia
Este proyecto está licenciado bajo la Licencia MIT
# Autor
<p align="center" dir="auto"><img src="https://github.com/GioScarp/GioScarp/blob/main/Banner_Dev_2.png" width="100%"></p>
<p align="center" dir="auto">Creado con 💙 por Giovanni Scarpetta</p>
