package Clase09_interfaces.comparable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado implements Comparable {

    private String nombre;
    private int sueldo;
    private Date fechaIngreso;

    public Empleado(String nombre, int sueldo, int añioIngreso, int mesIngreso, int diaIngreso) {
        int ANO_CERO_COMPUTACION = 1900;
        int INICIO_CUENTA_MESES = 1;

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaIngreso = new Date(añioIngreso - ANO_CERO_COMPUTACION, mesIngreso - INICIO_CUENTA_MESES, diaIngreso);
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public long fechaIngresoMs(){
        return this.fechaIngreso.getTime();
    }


    @Override
    public int compareTo(Object otroObjeto) {

        return Integer.compare(this.sueldo,((Empleado)otroObjeto).sueldo);
/*
        Empleado empleado = (Empleado) otroObjeto;
        if (this.sueldo< empleado.sueldo) {
            return -1;
        } else if (this.sueldo > empleado.sueldo) {
            return 1;
        }
        return 0;
*/

    }
}
