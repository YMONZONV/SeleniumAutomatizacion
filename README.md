<h1>Sauce Demo - Pruebas Web con Selenium</h1>

<h2>Descripción del Proyecto</h2>
Este script permitira simular la acción humana a travéz de lineas de comandos enviados por metodos públicos dentro del framework para interactuar con los componentes web de un aplicativo.

## <h4>Requisitos Previos</h4>
Para poder interactuar con el framework es necesario primero entender los flujos o escenarios que se van a automatizar (Pantallas, procesos, arquitectura, etc).
- Java Development Kit (JDK) 17.0.15 
- Maven instalado y configurado.
- IDE como IntelliJ IDEA 

## <h4>Estructura del Proyecto</h4>
```
​- src/test/java/bdd/API_Serverest: Aquí están los archivos .feature' que contienen todas las pruebas de la API (GET, GET_Id, POST, PUT, DELETE).
​- src/test/java/bdd/RunnerTest.java: Es el archivo principal para ejecutar las pruebas.
​- pom.xml: Define las dependencias y la configuración del proyecto.
```
## <h4>¿Cómo accedo a los metodos del framework?</h4>
Para acceder a los metodos del framework, la clase Page debe extender de la clase: WebDriverDOM 

## <h4>Cómo Ejecutar las Pruebas</h4>
```
​- Desde IntelliJ IDEA, abre el proyecto.
​- Navegar al archivo RunnerTest.java.
​- Haz clic derecho en la clase RunnerTest y selecciona "Run 'RunnerTest'".
​- Alternativamente, puedes usar el icono de "Play" que aparece en la parte superior.
​- Desde la línea de comandos (con Maven)
  - 1. ​Abre una terminal en la raíz del proyecto.
  - 2. Ejecuta el siguiente comando para ejecutar todas las pruebas cambiando el tags del escenario a probar: mvn clean test "-Dkarate.options=--tags @Tag01"

```
## <h4>Reportes de Resultados</h4>
​- Los reportes de los resultados de las pruebas se generan automáticamente en el directorio target/site/serenity
​
## <h4>Contribuciones</h4>
​- Si deseas contribuir a este proyecto, por favor, contacta a [Yury Monzon/isyurymonzonv@gmail.com]
