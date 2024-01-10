package PreParcialDario.src.embarcaciones;

import PreParcialDario.src.marineros.Capitan;

public class Velero extends Embarcacion {
    private int cantidadMastiles;

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, int cantidadMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande() {
        int MINIMA_CANTIDAD_MASTILES = 4;
        return this.cantidadMastiles > MINIMA_CANTIDAD_MASTILES;
    }
}
