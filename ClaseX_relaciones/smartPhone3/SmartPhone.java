package ClaseX_relaciones.smartPhone3;

import ClaseX_relaciones.smartPhone2.Chip;

public class SmartPhone {
    private String marcaSmartPhone;
    private String modelo;
    private Bateria bateria;
    private int numeroDeChips;
    protected SIM[] SIMs;
    private String usuario;

    public SmartPhone(String marcaSmartPhone, String modelo, Bateria bateria) {
        this.marcaSmartPhone = marcaSmartPhone;
        this.modelo = modelo;
        this.bateria = bateria;
        this.numeroDeChips = 0;
        this.SIMs = new SIM[2];
        this.SIMs[0] = null;
        this.SIMs[1] = null;
    }


    public SmartPhone(SIM[] SIMs) {
        this.SIMs = SIMs;
    }

    public void setSIMs(SIM nuevoChips) {
        if (numeroDeChips < 2) {
            this.SIMs[numeroDeChips] = nuevoChips;
            numeroDeChips++;
        }
    }

    public String getSpecsSIMs() {
        String spectChips = "";
        for (int i = 0; i < this.SIMs.length; i++) {
            if (this.SIMs[i] == null) {
                spectChips += "\n\tSIM" + i + " vacio";
            } else {
                spectChips += this.SIMs[i].getCarateristicas();
                if (i < this.SIMs.length - 1) {
                    spectChips += "\n";
                }
            }

        }
        return spectChips;
    }

    public String getSpecsBateria() {
        return this.bateria.getCaracteristicas();
    }

    public String getMarcaSmartPhone() {
        return marcaSmartPhone;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroDeChips() {
        return numeroDeChips;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return this.usuario;
    }
}
