package Caso_de_estudio_Clase_4_tarjetas_credito_debito;

public class Servicio {
    private TarjetaDebito tarjetaDebito;
    private TarjetaCredito tarjetaCredito;

    public Servicio(TarjetaDebito tarjetaDebito, TarjetaCredito tarjetaCredito) {
        this.tarjetaDebito = tarjetaDebito;
        this.tarjetaCredito = tarjetaCredito;
    }
}
