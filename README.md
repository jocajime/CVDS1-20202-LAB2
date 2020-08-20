# La herramienta Maven
citando la pagina de [Maven](http://maven.apache.org/)
>Apache Maven es una herramienta de gestión y comprensión de proyectos de software. Basado en el concepto de un modelo de objetos de proyecto (POM), Maven puede administrar la construcción, informes y documentación de un proyecto a partir de una pieza central de información
## Ciclo de vida y fases
los ciclos de vida de maven son los siguientes:
* **El ciclo de vida default** se utiliza para gestionar la construcción y el despliegue del proyecto. 
* **El ciclo de vida clean** se utiliza para gestionar la limpieza del directorio del proyecto. 
* **El ciclo de vida site** se utiliza para gestionar la creación de documentos del proyecto.

cada ciclo de vida de maven se componen de diferentes fases, En [Lifecycles](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference) se pueden encontrar todas las fases en cada ciclo de vida y una descripción de cada una de ellas.

### Plugins o Complementos.
citando la pagina de [Maven-plugins](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Plugins)
> Los complementos son artefactos que proporcionan objetivos a Maven. Además, un complemento puede tener uno o más objetivos en los que cada objetivo representa una capacidad de ese complemento.
## Repositorios
El repositorio de Maven es una estructura de directorio que contiene complementos y sus dependencias organizadas por groupId y artifactId. El repositorio principal de Maven se encuentra en http://central.maven.org/maven2/, que contiene las bibliotecas comunes.

## Ejercicio de las Figuras
### Crear un proyecto con Maven

![](https://github.com/jocajime/CVDS1-20202-LAB2/blob/master/imagenes/segunda.PNG)

### Compilar y Ejecutar
* 'Hello World!':
![](https://github.com/jocajime/CVDS1-20202-LAB2/blob/master/imagenes/tercera.PNG)
* 'Hello Pepito!':
![](https://github.com/jocajime/CVDS1-20202-LAB2/blob/master/imagenes/cuarta.PNG)
* Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?: solo imprime el nombre, el apellido no lo imprime.
* al realizar la respectiva correccion:
![](https://github.com/jocajime/CVDS1-20202-LAB2/blob/master/imagenes/hello-completo.PNG)
### Hacer el esqueleto de la aplicacion
* Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
	+ ** Sin parámetros: ** esto genera un error que controlamos ya que el proyecto necesita de estos argumentos para funcionar.
	![](https://github.com/jocajime/CVDS1-20202-LAB2/blob/master/imagenes/sinparametros.PNG)
	+ ** Parámetro qwerty: ** este no es un parametro valido para el proyecto.
	![](https://github.com/jocajime/CVDS1-20202-LAB2/blob/master/imagenes/qwerty.PNG)
	+ ** Parámetro pentagon: ** esto funciona correctamente ya que es un parametro valido para el proyecto.
	![](https://github.com/jocajime/CVDS1-20202-LAB2/blob/master/imagenes/pentagon.PNG)
	+ ** Parámetro Hexagon: ** esto funciona correctamente ya que es un parametro valido para el proyecto.
	![](https://github.com/jocajime/CVDS1-20202-LAB2/blob/master/imagenes/hexagon.PNG)

## Enlaces - webgrafia
 * http://maven.apache.org/
 * https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Plugins
 * https://snmb-desarrollo.readthedocs.io/en/develop/howtos/maven-deploy.html#:~:text=Un%20repositorio%20Maven%20es%20una,las%20librer%C3%ADas%20de%20uso%20general.
 
### Integrantes
+ Joel Carvajal
+ Johan Rueda
