package pildoras.empleados_herencia_polimorfismo_interfaz_jerarquia;

public class Jefatura extends Empleado implements Jefe{
    private double incentivo;
    public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);
    }


    public void estableceIncentivo(double b){
        this.incentivo=b;
    }

    public double dameSueldo(){
        double sueldoJefe=super.dameSueldo();
        return sueldoJefe+incentivo;
    }

    @Override
    public String tomarDecisiones(String decision) {
        return "Un mienbro de la direccion/jefatura a tomado la decision de: " +decision;
    }

    @Override
    public double estableceBonus(double gratificacion) {
        double prima= 2000;
        return Trabajadores.bonoBase+prima+gratificacion;
    }
}
