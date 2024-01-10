package pildoras.coche_poo;

public class Furgoneta extends Coche{
    private int capacidadExtra;
    private int plazasExtra;

    public Furgoneta(int largo, int ancho, int centrimettosCubicosMotor, int capacidadExtra, int plazasExtra) {
        super(largo, ancho, centrimettosCubicosMotor);
        this.capacidadExtra = capacidadExtra;
        this.plazasExtra = plazasExtra;
    }

    public String dimeDatosFurgoneta(){
        return "La capacidad e carga es: "+capacidadExtra+ " Las pasas extras son "+capacidadExtra;
    }


}
