package preParcial.src.preexamen.embarcaciones;

import preParcial.src.preexamen.marineros.Capitan;

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

    public double calcularAlquiler(){
        double alquiler = this.precioBase;
        int lastFactoryRelease = 2023;
        if (this.anioFabricacion > lastFactoryRelease) {
            alquiler += this.valorAdicional;
        }
        return alquiler;
    }




}
