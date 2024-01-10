package ClaseX_relaciones.smartPhone;

public class Chip {
    private  String operador;
    private  int numero;

    public Chip(String operador, int numero) {
        this.operador = operador;
        this.numero = numero;
    }

    public void mostrar(){
        System.out.println("empresa = " + operador);
        System.out.println("nuemero = " + numero);
    }
}
