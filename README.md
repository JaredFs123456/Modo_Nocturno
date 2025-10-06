Práctica 2.- “Diseño de una Aventura Interactiva” por Fonseca Sánchez Jorge Jared

Kotlin(Android Nativo)

 Requisitos Técnicos

•	La aplicación debe contener un mínimo de tres Activities conectadas de forma jerárquica.
•	Cada Activity debe tener Fragments y un Layout con un diseño único.
•	Deben implementar la funcionalidad de puntos de interés en al menos tres niveles.
•	Las transiciones entre Activities y Fragments deben ser creativas y bien ejecutadas.
•	El código debe estar limpio y correctamente comentado.
.   Debe tener un interruptor para cambiar a modo oscuro

Cómo ejecutar

-	Clonar este repo.
-	Abrir en Android Studio y sincronizar Gradle.
-	Ejecutar en un emulador (API 27+) o dispositivo físico.

Instalación y ejecutar en el teléfono

-	Instalar la app
-	Abrrir la aplicación


Funcionalidades

Se encuentra un menú en donde se encuentran 2 platillos, “Tacos al pastor” y “Chiles en nogada”, al seleccionar alguno de estos platillos manda a otro activity en donde se encuentran las preparaciones del platillo principal.
Se encuentra un fragment mostrando la historia del platillo, en el símbolo O se puede mostrar algunos datos curiosos del platillo elegido, y se encuentran más fragments en donde se muestran las preparaciones previas del platillo principal y en el símbolo O se muestran los tips sobre las preparaciones y al seleccionar el fragment de la preparación nos manda al apartado de los ingredientes con los que se prepara el platillo.
En la parte superior de la pantalla principal, se encuentra un switch con el emogi de un sol que al presionarlo cambiara a modo oscuro y el emogi cambia a una luna


Dificultades y Soluciones

-	Uno de los problemas que llegue a tener con la preparación de la práctica sobre jerarquía es la forma en como podía acomodar los textos y las imágenes, ya que se tenían que colocar fragments y activtis, se asigno un activity para cada fase de la jerarquía, También la forma en como se colocaría los datos curiosos o los tips.

-	Problemas a la hora de compilar el programa

-   Otro de los problemas que enfrente fue con el modo oscuro, ya que se debia cambiar en todos los activities de la aplicación


Explicación de diseño

Se divide de esta forma por etapas, ya que los platillos preparados en cualquier comida, siempre se divide entre varios elementos y composiciones, entonces se muestran las composiciones y los ingredientes que se utilizan para las composiciones. 
