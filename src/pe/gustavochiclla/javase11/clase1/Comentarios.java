package pe.gustavochiclla.javase11.clase1;

public class Comentarios {
    // comentario en una sola linea

    /* Muliples
     * Lineas
     */

    /**
     * Javadoc, comentarios en multiples lineas
     * @Autor Gustavo Chiclla
     */
}

/**
 * Javadoc
 * @Autor
 */
class OtroComentario { //comentario al final de una linea.
    String /*comentario en medio*/ name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}