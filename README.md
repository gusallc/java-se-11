# Taller de certificación Java SE 11 - 1Z0-819

<a name="javacjava"></a>
> 💡 Nota: Desde Java 11 en adelante se puede ejecutar solo **clases simples, que no llaman a otras clases**, en línea de comando; sin tener que compilar con `javac`(verion 8 y anteriores)
> ```shell
>  java {NameClassMain}.java
> ```
> Sin embargo no se podrá ejecutar si ya existe una compilación previa con `javac`, y está haya generado un `{NameClassMain}.class`,
> por otro lado, el comando previo no generá un archivo `.class`, ya que todo lo ejecuta en memoria.

__Beneficios Java__

- Orientado a Objetos.
- Encapsulación
- Independiente Plataforma.
- Robusto.
- Simple
- Seguro
- MultiHilo
- Compatibilidad hacia atrás `(versiones anteriores)`.

```Java
//✔️ Un archivo java(Animal.java), solo puede tener una clase pública 
// y esta deberá tener exactamente el mismo nombre del archivo ya que java es case sensitive.
public class Animal {
    String name; // ✔️ -> variable de instancia | campo: Java
    // ❌ -> atributo de clase: UML 
}

/*❌ clase no pública*/
class Perro {

}

/*❌ clase no pública*/
class Gato {

} 
```
## Orden  de elementos en una clase (PIC)
| Elements   |  Example  | Required? | Where does it go?
 ---         |---        | :---:       | ---
|1. ***P***ackage Declaration | package abc;     | NO | First line in the file
|2. ***I***mport statements | import java.util.* | NO| Immediately after the package(if present)
|3. ***C***lass Declaration | public class C     |**YES**| Immediately after the import(if any)
|4. Field declaration | int value;         | NO | Any top-level element in a class (**can go in either order**)
|5 .Method declaration | void method()     | NO | Any top-level element in a class (**can go in either order**)


## Diferencias de compilación y ejecución mediante comando

|                             **javac (<=8)**                                                | **java(11>=)**
|---                                                                                         |   ---      |
|javac HelloWorld.java,<br>javac HelloWorld Ó                                                | java HelloWorld.java
|javac package\HelloWorld.java <br> javac package\subpackage\\*.java                          | java package.HelloWorld.java
|Produce un archivo .class [Explicación](#javacjava)                                         | todo en memoria
|Para programas con relacion a muchas clases [EJEMPLO](https://github.com/gusallc/java-se-11/blob/main/imagenes/clase1/compilacion_ejecucion_javac_con_import_otro_package.png) | programa con una sola clase [ÉXITO](https://github.com/gusallc/java-se-11/blob/main/imagenes/clase1/javac_compilado_ejecutable_con_main_simple_exito.png ),`de lo contrario:` [ERROR](https://github.com/gusallc/java-se-11/blob/main/imagenes/clase1/java_ejecutable_con_otro_package_error.png)
|puede importar código de cualquier <br> libreria java disponible :point_down: :point_down:  | Solo se puede importar el <br>código que viene con el jdk :point_down: :point_down:
|`import custom.package.file.name`, <br>`import org.springframework.*`                       | `import java.*`, `import jdk.*`

## Compilar y ejecutar desde directorio alternativo

> Compilar en un Directorio alternativo:
> javac coloca las clases compiladas en el mismo directorio del código fuente.
> Pero existe -d para ubicar el .class(clase compilada) en otro directorio. <br>
> `javac -d directory package/ClassA.java packageB/ClassB.java` [Ejemplo](https://github.com/gusallc/java-se-11/blob/main/imagenes/clase1/compilando_en_otro_directorio_con_-d.png)

> Ejecutando desde un directorio alternativo
> Para ejecutar el programa se especifica el classpath para que java sepa
> donde encontrar las clases generadas con javac. Hay 3 opciones: <br>
> `java -cp directory packageb.ClassB` [Ejemplo](https://github.com/gusallc/java-se-11/blob/main/imagenes/clase1/ejecucion_en_otro_directorio_con_-cp.png) <br>
> `java -classpath directory packageb.ClassB` <br>
> `java --class-path directory packageb.ClassB`

## Compilando Archivos JAR

- `jar --create --verbose --file myNewFile.jar `
- jar -cvf {nameFile}.jar [-C rootDirectoryContainingFilesUsedToCreateJar] {files}]
- jar -cvf myJar.jar -C .\clase1\ . 
- jar -cvf myJar.jar -C .\clase1\ ZooMain.java MultiClass.java
- jar -cvf myNewFile.jar .
- Crear un archivo denominado classes.jar con dos archivos de clase: <br> jar --create --file classes.jar Foo.class Bar.class

## Ejecutar Archivos JAR
- Se puede especificar la ubicación de otros archivos usando un classpath.
- Esto es útil cuando las clases están localizadas en archivos JAR.
- Un archivo JAR es como un zip de clases java.
- En WINDOWS:  <br>
java -cp ".;C:\temp\algunaOtraCarpeta;c:\temp\myJar.jar" mypackage.MyClass <br>
java -cp ".;C:\temp\directoryWithJars\\*" mypackage.MyClass -> `no incluye JARs que estén en una subdirectorio de directoryWithJars.`
- En LINUX:  <br>
java -cp ".:/temp/someOtherocation** :/temp\myJar.jar" mypackage.MyClass
> El (.) indica que deseas incluir el directorio actual en el classpath. El resto del comando
> indica buscar clases (o paquetes) en otra ubicación y dentro de myJar.jar
> Windows usa (`;`) para separar partes del classpath, en otros S.O. se usa (`:`)

## Convenciones (CamelCase)

> Clases e Interfaces
>> TipoCliente <br> TipoDocumento  <br> Animal

> Variables y Métodos
>> apellidoPaterno <br> buscarNombre <br> generarReporte

## Imports
> :warning: **PARA LOS IMPORTS** ,puede haber redundancía pero eso no es sinónimo **DE QUE NO COMPILA**.
> 
> El "`.*`" :
> 1. **No quiere decir que todas las clases se están cargando en memoria**: como si lo es en el "lenguage C" 
> 2. solo es válido para clases **más no métodos.**
> 3. No hace busqueda recursiva, por lo tanto `no hará sub-busquedas` "package/sub-package/".
>    1. java.*; -> java.util.Date: encuentra el package util, pero no la clase Date. 
>    2. java.nio.*; -> java.nio.file.Files, encuentra package file, pero no la clase Files.
>    3. java.nio.*; -> java.nio.file.Paths, encuentra package file, pero no la clase Paths.

---

## 1Z0-815

<details>
        <summary>Clase 1</summary>

- Fundamentos Java
    - Campos y métodos.
    - Comentarios.
    - Getters and Setters.
- Crear un simple programa Java
    - Ejecutable Java con clase Main
    - Compilar y ejecutar un programa java desde línea de comandos.
    - Crear e Importar packages.
    - Imports conflicto de nombres y Redundancia de Imports
    - Compilar archivos JAR
- Describir, usar objetos y clases
    - Definir la estructura de una clase main(ZooMain.java)

</details>

---

## 1Z0-816

<details>
        <summary>Clase 1</summary>

- Fundamentos Java
    - Crear y usar clases final
    - Crear y usar inner, nested y anonymous clases
    - Crear y usar enumerations
- Interfaces Java
    - Crear y usar interfaces con métodos default
    - Crear y usar interfaces con métodos private
- Interfaces funcionales y expresiones Lambda
    - Definir y escribir interfaces funcionales
    - Crear y usar expresiones lambda incluyendo sentencias labdas, variables locales para parámetros lambda

</details>
