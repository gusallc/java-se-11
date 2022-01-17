package pe.gustavochiclla.javase11.clase1;
/**
 * Ojo: Puede haber redundancía en los imports pero eso no es sinónimo DE QUE NO COMPILA,
 * NO SE DEBERÁ HACER el "import" explicitamente si la clase se encuentra en el mismo package base que tu "clase actual" (caso 2).
 * De la misma forma  el ".*" no quiere decir que todas las clases se están cargando en memoria: como es el caso del "lenguage C" (caso 1),
 * también añadir que ".*" solo es válido para clases más no métodos (caso 6).
 * de igual importancia tener encuenta el directorio donde se está realizando la busqueda de la clase, YA QUE NO es una busqueda recursiva.(Caso 5)
 * Ejemplo:
 * Las clases "files y paths" están dentro del directorio "file",
 * si importamos "java.nio.*" está solo nos encontrará carpetas y clases como channels, charset, file,Bits,Buffers,etc.
 * mas no ingresará a "file/", mucho menos usar "java.nio.*.*" ya que no es permitido solo se puede usar un *.
 *
 * |-java
 *   |- nio
 *      |- channels
 *      |- charset
 *      |- file
 *          |-files
 *          |-paths
 *
 */


//Caso 1 -> Compila
import java.util.*; // Redundante, import implicita (.*)
import java.util.Random; // import explicito  -> tiene mayor relevancia
//Caso 2 -> Compila
import pe.gustavochiclla.javase11.clase1.RelacionConOtraClase; // Redundante

//Caso 3 -> Compila
import java.nio.file.Files;
import java.nio.file.Paths;
//Caso 4 -> Compila
import java.nio.file.*;

//Caso 5 -> No Compila ya que Files y Paths no serán reconocidos, por lectura de direcctorio.
//import java.nio.*;

//caso 6 -> Compila pero no es válido
import java.nio.file.Files.*; //-> Aquí se está tratando de acceder a todos los métodos de la clase Files.


public class ImportesYRedundanciaDeImportes {

    public static void main(String[] args) {
        //Java sabe que Random se encuentra dentro java.util
        Random random = new Random();

        //"RelacionConOtraClase" está dentro del mismo package base que nuestra clase actual.
        RelacionConOtraClase objRelacionConOtraClase = new RelacionConOtraClase();
    }

    public void read(Files files) {
        Paths.get("name");
    }

}
