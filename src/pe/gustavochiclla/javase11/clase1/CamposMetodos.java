package pe.gustavochiclla.javase11.clase1;

public class CamposMetodos {

    // Instance Variables (Non-Static Fields)
    // Variables de instancia, o también llamado  "campos"
    String nombre;
    String apellidos;
    String dni;

    // Class Variables (Static Fields)
    private static String altura = "Alto"; //Variable de la Clase
    public static final String animo = "Feliz"; //Variable de la Clase, constante stática

    // Métodos con retorno y sin retorno(Integer,String, Void, etc)

    public String NombreYApellidos(String nombre, String apellidos /* Parametros - Parameters */) {
        //Variable local - Local Variables
        String concatenado = nombre + " " + apellidos;
        return concatenado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
