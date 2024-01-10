package ClaseX_relaciones.smartPhone1;

public class Chip {
    private String operador;
    private int numero;

    public Chip(String operador) {
        this.operador = operador;
        this.numero = 0; // un clip de un operador inicialmente no teiene numero de abonado asiganado
    }

    //gettes
    public String getOperador() {
        return this.operador;
    }

    public int getNumero() {
        return this.numero;
    }

    //setters
    public void setNumero(int numero) {
        this.numero = numero;
    }


}
