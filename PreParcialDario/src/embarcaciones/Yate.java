package PreParcialDario.src.embarcaciones;

import PreParcialDario.src.marineros.Capitan;

public class Yate extends Embarcacion {
    private int cantidadCamarotes;

    public Yate(double precioBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, int cantidadCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public boolean esMasLujosoQue(Yate otroYate) {
        return this.cantidadCamarotes > otroYate.cantidadCamarotes;
    }

    public int getCantidadCamarotes(){
        return cantidadCamarotes;
    }
}
