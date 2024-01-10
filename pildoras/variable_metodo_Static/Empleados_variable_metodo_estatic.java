package pildoras.variable_metodo_Static;

public class Empleados_variable_metodo_estatic {

    public static void main(String[] args) {
        Empleados trabajado1 = new Empleados("Paco");
        Empleados trabajado2 = new Empleados("Ana");
        Empleados trabajado3 = new Empleados("zzzz");
        Empleados trabajado4 = new Empleados("Adzz");
        Empleados trabajado5 = new Empleados("naaz");
        trabajado2.cambiarSeccion("Desarrollo");

        System.out.println(trabajado1.getDatos() +
                "\n" + trabajado2.getDatos() +
                //Empleados.id++;
                "\n" + trabajado3.getDatos() +
                "\n" + trabajado4.getDatos() +
                "\n" + trabajado5.getDatos());

        System.out.println(Empleados.dameIdSgt());

        System.out.println(trabajado1.getDatos() +
                "\n" + trabajado2.getDatos() +
                //Empleados.id++;
                "\n" + trabajado3.getDatos() +
                "\n" + trabajado4.getDatos() +
                "\n" + trabajado5.getDatos());
    }


}

class Empleados{
    private final String nombre;
    private String seccion;
    public int id;
    private static int idSgt = 1;

    public Empleados(String nombre) {
        this.nombre = nombre;
        this.seccion = "Administracion";
        this.id = idSgt;
        idSgt++;
    }


    public void cambiarSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDatos() {
        return "El nombre es " + this.nombre + " ,la seccion es " + this.seccion + " y el id es " + this.id;
    }


    public static String dameIdSgt() {
        return "EL id sgt es: " + idSgt;
    }

}


