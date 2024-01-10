package pildoras.persona_abstrac;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona{
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSgt;


    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre);

        this.sueldo = sueldo;
        GregorianCalendar calenario = new GregorianCalendar(anio, mes - 1, dia);
        this.altaContrato= calenario.getTime();
        idSgt++;
        this.id=idSgt;


    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = this.sueldo*porcentaje/100;
        this.sueldo+=aumento;
    }

    @Override
    public String dameDescripcion() {
        return "tiene el id: "+id+" con un sueldo de: "+sueldo;
    }
}
