
# Jack Food 🍽️ | Backend 

¡Bienvenid@! 👋 Este proyecto es el backend con Spring Boot del repositorio https://github.com/jacksonos/JackFood-React-Frontend, y está estructurado para facilitar su ejecución mediante una configuración sencilla.

## Requisitos previos ❗

Antes de comenzar, asegúrate de tener instalados los siguientes requisitos en tu sistema:

- Java 19
- MySQL
- IDE preferido

## Correr localmente 💡

Clona el repositorio:

```bash
  git clone https://github.com/jacksonos/JackFood-React-Backend.git
```



## Variables de entorno ❎

Para ejecutar este proyecto, tendrás que modificar el archivo `application.properties` y sus siguiente variables:

### Base de datos 🛢
Para la configuración de MySQL:

`DB_PORT`

`DB_NAME`

`DB_USERNAME`

`DB_PASSWORD`

### Gatway de pago por Stripe 💵

Cambia por tu secret key de Stripe ➡️ `stripe.api.key`

### Envio por Gmail 📫
Tutorial para generar tu Gmail App Pasword ➡️ https://www.youtube.com/watch?v=N_J3HCATA1c

`spring.mail.username`

`spring.mail.password`


