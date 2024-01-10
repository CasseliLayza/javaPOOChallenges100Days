package ClaseX_relaciones.smartPhone3;

public class SIM {
    private String operador;
    private String numeroAbonado;
    private String numeroSerie;

    public SIM(String operador) {
        this.operador = operador;
        this.numeroAbonado= "";
        this.numeroSerie= "";
    }

    public void setNumeroAbonado(String numeroAbonado) {
        this.numeroAbonado = numeroAbonado;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getCarateristicas(){
        return "\n\tOperador: "+ this.operador+
                "\n\t\tNumero: "+this.numeroAbonado+
                "\n\t\tNumero Serie: "+this.numeroSerie;
    }
}
