package pe.gustavochiclla.javase11.clase1;

public class CamposMetodos {

    // variables de instancia, o también llamado  "campos"
    String nombre;
    String apellidos;
    String dni;

    // Métodos con retorno y sin retorno(Integer,String, Void, etc)

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
