package pe.gustavochiclla.javase11.clase1;

/**
 * No se puede usar 2 clases con el mismo nombre pertenecientes a diferentes paqueterias.
 * NOTA: El import que especifique la clase tendrá la mayor relevancia por encima de ".*"
 *  Los "fully-qualified class name" contiene el paquete desde donde se originó la clase (Caso 4)
 */

/* Caso 1- No Compila
import java.util.Date;
//No compila ya que la clase "Date" del paquete util, está declarado arriba(java se ejecuta de arriba hacia abajo),
//y esto origina single-type-import en la linea siguiente;
import java.sql.Date;
 */

/* Caso 2 - Compila
Al no especificar la clase en java.sql.*, por regla la que sí especifica será  tomada como predeterminada.
import java.util.Date;
import java.sql.*;
 */

/* Caso 3 - No Compila ya que los 2 tienen una clase con el mismo nombre "Date" por enede no toma ninguno de los 2.
import java.util.*;
import java.sql.*;
 */

public class ConflictosDeNombres {


    public static void main(String[] args) {
        // Caso 1 extensión
        // Date date; //-> genera error "reference to Date is ambiguous"

        // Caso 2
        // Date date; // -> Toma la referencia de java.util.Date

        // Caso 3 extensión -
        // Date date; // -> genera error "reference to Date is ambiguous".

        //Caso 4
          java.util.Date date; //-> "fully-qualified class name"
          java.sql.Date date2; //-> "fully-qualified class name"
    }
}
