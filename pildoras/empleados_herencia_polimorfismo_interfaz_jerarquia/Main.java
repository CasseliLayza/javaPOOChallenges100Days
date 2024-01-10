package pildoras.empleados_herencia_polimorfismo_interfaz_jerarquia;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

/*
        Empleado empleado1 = new Empleado("second", 80500, 2029, 1, 1);
        Empleado yoMerengues = new Empleado("Second", 700000, 2017, 12, 17);
        Empleado empleado2 = new Empleado("Alex", 40000, 2012, 11, 23);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        yoMerengues.subeSueldo(50);

        System.out.println("empleado2.getNombre() = " + empleado2.getNombre());
        System.out.println("empleado2.getSueldo() = " + empleado2.getSueldo());
        System.out.println("empleado2.getAltaContrato() = " + empleado2.getAltaContrato());

        System.out.println("empleado1.getNombre() = " + empleado1.getNombre());
        System.out.println("empleado1.getSueldo() = " + empleado1.getSueldo());
        System.out.println("empleado1.getAltaContrato() = " + empleado1.getAltaContrato());
*/
        Jefatura jefeRRHH = new Jefatura("casseliElGrande,", 50000, 2020, 5, 9);
        jefeRRHH.estableceIncentivo(2500);


        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 16, 12);
        misEmpleados[2] = new Empleado("Martin Martin", 102225000, 1992, 03, 15);
        misEmpleados[3] = new Empleado("casseli");
        misEmpleados[4] = jefeRRHH; // poli es un empleado,  polimorfiemos
        misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 2);

        Jefatura jefaFinanzasMaria = (Jefatura) misEmpleados[5];
        jefaFinanzasMaria.estableceIncentivo(55000);


/*

        for (int i = 0; i < 6; i++) {
            misEmpleados[i].subeSueldo(5);
        }


        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre: " + misEmpleados[i].getNombre() +
                    " Sueldo: " + misEmpleados[i].dameSueldo() +
                    "Fecha de alta: " + misEmpleados[i].getAltaContrato());

        }
*/

/*
        for (Empleado empleado : misEmpleados) {
            empleado.subeSueldo(10);
        }

        for (Empleado e : misEmpleados) {

            System.out.println("Nombre: " + e.getNombre() +
                    " Sueldo: " + e.dameSueldo() +
                    " Fecha de alta: " + e.getAltaContrato());

        }
*/

        //ordenar por sueldo a los empleados,********************************************
        System.out.println("ordenar por sueldo a los empleados:");
        Arrays.sort(misEmpleados);

        for (Empleado e : misEmpleados) {

            System.out.println("Nombre: " + e.getNombre() +
                    " Sueldo: " + e.dameSueldo() +
                    " Fecha de alta: " + e.getAltaContrato());

        }

        Empleado directorComercial = new Director("Pepito", 7000000, 2012, 7, 9);
        Comparable ejemplo = new Empleado("teteraza", 1200, 2021, 4, 8);


        if (directorComercial instanceof Empleado) {
            System.out.println("es de tipo Director");
        }

        if (ejemplo instanceof Comparable) {
            System.out.println("implementa la interfaz comparable");
        }

        // prueba interfaz implementada en jefe y heredada en director

        System.out.println("jefaFinanzasMaria.tomarDecisiones(\"Dar vacaciones a todos \") = " + jefaFinanzasMaria.tomarDecisiones("Dar vacaciones a todos"));
        System.out.println("((Director) directorComercial).tomarDecisiones(\"Dar Aumento a todos xD\") = " + ((Director) directorComercial).tomarDecisiones("Dar Aumento a todos xD"));

        // prueba de interfaces heredadas trabajadores-->Jefe y herencia de las mismas en la clase Director
        System.out.println("Bonus establecido por jefaFinanzas Maria = " + jefaFinanzasMaria.estableceBonus(500));
        System.out.println("misEmpleados[0].estableceBonus(500) = " + misEmpleados[0].estableceBonus(500));
        System.out.println("((Director) directorComercial).estableceBonus(500) = " + ((Jefatura) directorComercial).estableceBonus(500));

    }

}
