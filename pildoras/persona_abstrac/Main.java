package pildoras.persona_abstrac;

public class Main {
    public static void main(String[] args) {
        Persona[] lasPersonas= new Persona[2];
        lasPersonas[0]= new Empleado("Yuri",450,2017,5,20);
        lasPersonas[1]= new Alumno("Alex","administracion");

        for (Persona persona:lasPersonas) {
            System.out.println(persona.dameNombre()+", "+persona.dameDescripcion());
        }

    }
}
