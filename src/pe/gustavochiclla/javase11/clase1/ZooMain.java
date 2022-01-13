package pe.gustavochiclla.javase11.clase1;

public class ZooMain {
    /*

    "main" Permite que la clase se pueda ejecutar

    Formas de que main se ejecute y compile  correctamente

    public static void main(String[] args) {
        System.out.println("Ejecución del método main 1era forma");
    }
    public static void main(String args []) {
        System.out.println("Ejecución del método main 2da forma");
    }
    public static void main(String... args) {
        System.out.println("Ejecución del método main 3era forma");
    }

    */

    /*
    Ejecución de main CON argumentos
    console  -> java ZooMain.java valor0 valor1
    */
    public static void main(String[] args) {
        System.out.println("Lectura args[0]- " + args[0]);
        System.out.println("Lectura args[1]- " + args[1]);
    }
/*
    - Output
    Lectura args[0]- valor0
    Lectura args[1]- valor1

    Ejecución de main CON 1 SOLO argumento
    console  -> java ZooMain.java valor0
    - Output
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at pe.gustavochiclla.javase11.clase1.ZooMain.main(ZooMain.java:28)

*/


}
