package Clase8_impresora;

import java.util.Date;

public abstract class Impresora {

    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    protected Double porcentajeTinta;


    public Impresora(String modelo, String tipoConexion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = new Date();
        this.hojasDisponibles = 0;
        this.porcentajeTinta = 0.0;
    }

    public boolean tienePapel() {
        return this.hojasDisponibles > 0;
    }

    public boolean necesitaTinta() {
        double minimaTintaRequerida = 0.1;
        return this.porcentajeTinta <= minimaTintaRequerida;
    }

    public abstract String imprimir();


}


