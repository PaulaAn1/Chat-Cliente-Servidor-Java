# Proyecto Chat Cliente-Servidor en Java

Este proyecto es un chat simple basado en la arquitectura cliente-servidor implementado en Java 11.0.20. El servidor actúa como intermediario para recibir y responder mensajes enviados por el cliente. El proyecto permite la interacción entre ambos a través de una conexión local.

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:


- **src/**: Contiene el código fuente del proyecto.
    - **Cliente.java**: Implementa la lógica del cliente, que envía mensajes al servidor.
    - **Servidor.java**: Implementa la lógica del servidor, que recibe y responde los mensajes del cliente.
    - **Main.java**: Permite seleccionar si se desea iniciar el cliente o el servidor.
- **bin/**: Carpeta donde se ubicarán los archivos `.class` compilados.
- **README.md**: Documentación del proyecto.
- **lib/**: Carpeta opcional para bibliotecas externas (en este caso no es necesaria).

## Requisitos

- Java JDK 11.0.20 o superior.
- Una terminal para ejecutar comandos.

## Instrucciones de Uso

### 1. Clonar el repositorio (si es aplicable)

```bash
git clone <url-del-repositorio>
cd ChatClienteServidor

// Compilar el proyecto
Desde la raíz del proyecto, compila los archivos de la 
carpeta src con el siguiente comando:

javac -d bin src/Servidor.java src/Cliente.java src/Main.java

// Ejecutar el programa
Ejecutar desde el archivo Main.java
Puedes ejecutar el archivo Main.java, que te permite 
elegir entre iniciar el servidor o el cliente:

java -cp bin Main

```

## Ejecutando el programa
### Al ejecutar el comando anterior, verás el siguiente menú en la terminal:

``` bash
Selecciona una opción:
1. Iniciar Servidor
2. Iniciar Cliente
Opción: 
".....aquí va la respuesta....

```
Si eliges 1, se iniciará el servidor en el puerto 12345 y esperará la conexión de un cliente.
Si eliges 2, se iniciará el cliente y se conectará al servidor en la dirección localhost.

## FUNCIONAMIENTO

### Comunicación Cliente-Servidor
- #### Servidor: 
    El servidor espera la conexión de un cliente en el puerto 12345. Una vez que un cliente se conecta, el servidor puede recibir mensajes y enviará respuestas automatizadas. Si el cliente envía el mensaje "adiós", la conexión se cerrará.
- #### Cliente:  
    El cliente envía mensajes al servidor. Si se envía "adiós", el cliente cierra la conexión.
### Ejemplo de uso:
El servidor está esperando la conexión de un cliente.
El cliente se conecta al servidor y puede enviar mensajes.
El servidor responde a los mensajes según la lógica definida.
Ejemplo de interacción:
Cliente: "hola"
Servidor: "Hola, ¿cómo puedo ayudarte?"
Cliente: "adiós"
Servidor: "Adiós, ¡hasta luego!"
Nota:
Para ejecutar en diferentes máquinas, asegúrate de que ambos (servidor y cliente) estén en la misma red y cambia "localhost" en el cliente por la dirección IP del servidor.