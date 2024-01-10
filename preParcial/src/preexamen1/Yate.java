package preParcial.src.preexamen1;

public class Yate extends Embarcacion {

    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int aniofabriccion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, aniofabriccion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public boolean esMasLujosoQue(Yate otroYate) {
        return this.cantidadCamarotes > otroYate.cantidadCamarotes;

    }

    public int getCantidadCamarotes() {
        return this.cantidadCamarotes;
    }
}
