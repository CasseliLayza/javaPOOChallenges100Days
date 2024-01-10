package preParcial.src.preexamen1;

public class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int aniofabriccion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int aniofabriccion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.aniofabriccion = aniofabriccion;
        this.eslora = eslora;
    }


        public double calcularAlquiler(){
        double precioAlquiler= this.precioBase;
            if (this.aniofabriccion > 2020) {
                precioAlquiler+=this.valorAdicional;
            }
            return precioAlquiler;
    }


}
