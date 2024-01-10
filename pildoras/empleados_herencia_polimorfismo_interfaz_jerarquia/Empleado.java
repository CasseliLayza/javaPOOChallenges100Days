package pildoras.empleados_herencia_polimorfismo_interfaz_jerarquia;

import java.util.*;

public class Empleado implements Comparable, Trabajadores{
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSgt;


    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calenario = new GregorianCalendar(anio, mes - 1, dia);
        this.altaContrato= calenario.getTime();
        idSgt++;
        this.id=idSgt;


    }

    public Empleado(String nombre) {
        this(nombre, 3000, 2022, 7, 9);
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public String getNombre() {
        return nombre + " el id es: "+id;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = this.sueldo*porcentaje/100;
        this.sueldo+=aumento;
    }


    @Override
    public int compareTo(Object otroObjeto) {
        Empleado empleado = (Empleado) otroObjeto;

        if (this.sueldo < empleado.sueldo ) {
            return -1;
        }

        if (this.sueldo> empleado.sueldo  ) {
            return 1;
        }

        return 0;
    }

    @Override
    public double estableceBonus(double gratificacion) {
        return Trabajadores.bonoBase+gratificacion;
    }
}
