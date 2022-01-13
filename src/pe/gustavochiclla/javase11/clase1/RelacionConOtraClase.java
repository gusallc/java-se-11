package pe.gustavochiclla.javase11.clase1;

import pe.gustavochiclla.javase11.clase1.otherpackage.OtraClase;

// Ejecutable Java con clase Main con Objeto de otro package
public class RelacionConOtraClase {

    public static void main(String[] args) {
        OtraClase obj = new OtraClase();
        obj.setNombre("Gustavo");
        obj.setAltura(1.65);

        System.out.println("obj.getNombre() = " + obj.getNombre());
        System.out.println("obj.getAltura() = " + obj.getAltura());
    }

}
