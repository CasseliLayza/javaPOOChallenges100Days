package preParcial.src.preexamen1;

public class Velero extends Embarcacion {

    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int aniofabriccion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, aniofabriccion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande(){
        int numeroMinMastiles = 4;
        return cantidadMastiles> numeroMinMastiles;
    }
}
