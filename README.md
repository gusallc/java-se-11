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

## Diferencias de compilación y ejecución mediante comando

|                             **javac (<=8)**                                                | **java(11>=)**
|---                                                                                         |   ---      |
|javac HelloWorld.java,<br>javac HelloWorld                                                  | java HelloWorld.java
|Produce un archivo .class [Explicación](#javacjava)                                         | todo en memoria
|Para programas con relacion a muchas clases [EJEMPLO](http://www.google.pe)                 | programa con una sola clase [ÉXITO](http://www.google.pe),`de lo contrario:` [ERROR](http://www.google.pe)
|puede importar código de cualquier <br> libreria java disponible :point_down: :point_down:  | Solo se puede importar el <br>código que viene con el jdk :point_down: :point_down:
|`import custom.package.file.name`, <br>`import org.springframework.*`                       | `import java.*`, `import jdk.*`

## Convenciones (CamelCase)

> Clases e Interfaces
>> TipoCliente <br> TipoDocumento  <br> Animal

> Variables y Métodos
>> apellidoPaterno <br> buscarNombre <br> generarReporte 

> :warning: **PARA IMPORTS**,puede haber redundancía en los imports pero eso no es sinónimo **DE QUE NO COMPILA**.
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
