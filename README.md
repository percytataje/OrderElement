TATAJE GUZMAN VICTOR PERCY

# OrderElement -Prueba GRUPO EL COMERCIO

EJERCICIO Nº 1 - ORDENAMIENTO



Ejercicio Nº 1 - Esquema Base

Crear una actividad llamada Activity1, la cual contendrá una lista con 3 elementos (usar RecyclerView). Los elementos deben ser rectángulos de colores rojo, azul y verde respectivamente; de aquí en adelante Elementos. 

Al darle click a cada elemento, se debe lanzar una segunda actividad llamada Activity2, la cual contendrá el color tocado como background.

Activity 1                              Activity 2
ROJO
VERDE                                   ROJO
AZUL


Ejercicio Nº 1 - Problema

Se debe armar una lógica para ordenar los Elementos según el número de touchs hechos en cada uno, estos elementos no se ordenarán en tiempo real, sino cuando el usuario vuelva a entrar a la aplicación.

Ejercicio Nº 1 - Indicaciones

El ordenamiento de los elementos solamente se debe aplicar cuando se vuelva a ingresar a la aplicación, luego de haberla destruido completamente.
El ordenamiento se debe dar sí y sólo sí el número de touch’s en uno de los Elementos es mayor o igual a 3. De tal forma que si se tocó un elemento 3 o más veces, este debe pasar a primera posición y los otros ordenarse en consecuencia según su última posición.
Si un solo elemento tuvo 3 touch’s o más y los otros restantes tienen la misma cantidad de touchs (2 o 1), estos se ordenarán según el último uso. Ejm: Si el rojo tiene 3 touch’s va primero, pero azul y verde tienen 2 touchs ¿Cuál iría primero? el último elemento en llegar a 2 (o 1 según el caso).
Si dos elementos tienen la misma cantidad de touch’s mayores o iguales a 3, al abrir la aplicación se posicionará primero el último elemento en llegar a los 3 touchs o más, luego, se posicionará en segundo lugar el que tuvo la misma cantidad de touch’s. El elemento restante se posicionará en tercer lugar.
Si tres elementos tienen la misma cantidad de touch’s mayores o iguales a 3, al abrir la aplicación se ordenarán según el orden en que cada uno llegó a tener los 3 touch’s. Primero el último que consiguió los tres o más touch’s, el segundo y así el tercero.
Si ninguno de los tres elementos llego a tres touchs. Al volver abrirse la aplicación, sus contadores deben mantenerse y el ordenamiento NO se debe efectuar.
Si alguno de los tres elementos tiene más de tres touchs, se ordenará de mayor a menor.
Si un elemento tiene más de tres touchs y los otros dos tienen una cantidad igual de touchs, se ordenarán en base al último usado.
El ordenamiento sólo debe darse al cerrar y volver a abrir la aplicación, no al volver al activity.
El reseteo de contadores solo se debe dar después de haber aplicado un ordenamiento, es decir,  al cerrar y luego volver a abrir la aplicación, sí y solo sí se cumplieron las condiciones necesarias para efectuarlo.


Ejercicio Nº 1 - Consideraciones

No se permite usar ninguna librería, salvo las de soporte:
compile "com.android.support:design:*"
compile "com.android.support:appcompat-v7:*"
Usar persistencia de datos de ser necesario.
Usar Android Studio 2.3.3
Datos de compilación:
compileSdkVersion 26
buildToolsVersion "26.0.2"
minSdkVersion 15
targetSdkVersion 26

