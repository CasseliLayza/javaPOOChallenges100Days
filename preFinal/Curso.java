package preFinal;

public class Curso extends OfertaAcademica {
    private int cantidadHoras;
    private double valorHora;

    public Curso(String nombre, String descripcion, int cantidadHoras, double valorHora) {
        super(nombre, descripcion);
        this.cantidadHoras = cantidadHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return cantidadHoras*valorHora;
    }


}
