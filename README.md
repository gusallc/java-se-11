# Taller de certificación Java SE 11 - 1Z0-819
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
//✅ Un archivo java(Animal.java), solo puede tener una clase pública 
// y esta deberá tener exactamente el mismo nombre del archivo ya que java es case sensitive.
public class Animal{ 
   String name; // ✅ -> variable de instancia | campo: Java
               // ❌ -> atributo de clase: UML 
}
/*❌ clase no pública*/class Perro{}
/*❌ clase no pública*/class Gato{}
```
## Convenciones (CamelCase) 
| **Clases e Interfaces:** | **Variables y Métodos:** |
| ------------------------ | ------------------------ |
| TipoCliente              | apellidoPaterno          |
| TipoDocumento            | buscarNombre             |
| Animal                   | generarReporte           |

## 1Z0-815
### Clase 1
**Objetivos**
- Fundamentos Java
    - Campos y métodos.
    - Comentarios.
    - Getters and Setters.
- Crear un simple programa Java
    - Ejecutable Java con clase Main
    - Compilar y ejecutar un programa java desde línea de comandos.
    - Crear e Importar packages.
- Describir, usar objetos y clases
    - Definir la estructura de una clase
        - Clases vs Files

## 1Z0-816
### Clase 1

**Objetivos**
-  Fundamentos Java
    - Crear y usar clases final
    - Crear y usar inner, nested y anonymous clases
    - Crear y usar enumerations
- Interfaces Java
    - Crear y usar interfaces con métodos default
    - Crear y usar interfaces con métodos private
- Interfaces funcionales y expresiones Lambda
    - Definir y escribir interfaces funcionales
    - Crear y usar expresiones lambda incluyendo sentencias labdas, variables locales para parámetros lambda
