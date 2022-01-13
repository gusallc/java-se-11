package pe.gustavochiclla.javase11.clase1;

public class GetterAndSetter {
    String name;

    // get -> sirve para Obtener el valor
    public String getName() {
        return name;
    }

    // set -> sirve para pasarle valor al campo "this.name"
    public void setName(String name) {
      this.name /*hace referencia al "String name" de la instancia*/ = name /*hace referencia al argumento del método setName()*/;
    }
    //Nota: Los getters an setters están en "CamelCase"  {name} => [get]{Name}

}
