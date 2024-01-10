package Clase09_interfaces.comparable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura ("Juan", 55000,2006,9,25);
        jefe_RRHH.estableceIncentivo(2570);

        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0]= new Empleado("Ana",30000,2000,07,07);
        misEmpleados[1]= new Empleado("Carlos",50000,1995,06,15);
        misEmpleados[2]= new Empleado("Paco",25000,2005,9,25);
        misEmpleados[3]= new Empleado("Antonio",47500,2009,11,9);
        misEmpleados[4]= jefe_RRHH;//Principio de sustitucion Polimorfismo
        misEmpleados[5]= new Jefatura("Maria",95000,1999,05,26);

        Jefatura jefe_Finanzas=(Jefatura)misEmpleados[5];

        jefe_Finanzas.estableceIncentivo(55000);

        Arrays.sort(misEmpleados);

        for (Empleado empleado:misEmpleados) {
            System.out.println("Nombre: "+empleado.getNombre()+
            " Sueldo: "+empleado.getSueldo()+
            " FechaIngreso: "+empleado.getFechaIngreso());


        }


    }
}
