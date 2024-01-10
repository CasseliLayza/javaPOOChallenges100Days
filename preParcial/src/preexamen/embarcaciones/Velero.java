package preParcial.src.preexamen.embarcaciones;

import preParcial.src.preexamen.marineros.Capitan;

public class Velero extends Embarcacion {
    private int cantidadMastiles;

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, int cantidadMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public boolean esGrande(){
        int MINIMA_CANTIDAD_MASTILES = 4;
        return this.getCantidadMastiles()> MINIMA_CANTIDAD_MASTILES;
    }
}
