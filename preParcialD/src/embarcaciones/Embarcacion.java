package preParcialD.src.embarcaciones;

import preParcialD.src.marineros.Capitan;

public class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslora;
    private Capitan capitan;

    public Embarcacion(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public double calcularAlquiler() {
        double alquiler = this.precioBase;
        if (this.anioFabricacion > 2020) {
            alquiler += this.valorAdicional;
        }
        return alquiler;
    }
}
