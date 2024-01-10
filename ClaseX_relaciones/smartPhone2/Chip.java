package ClaseX_relaciones.smartPhone2;

public class Chip {
    private String empresa;
    private int numero;

    // C
    public Chip(String empresa) {
        this.empresa = empresa;
        this.numero = 0;
    }

    // S
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // G
    public String getEmpresa() {
        return empresa;
    }

    public int getNumero() {
        return numero;
    }


}
