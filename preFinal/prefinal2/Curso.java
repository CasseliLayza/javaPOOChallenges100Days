package preFinal.prefinal2;

public class Curso extends OfertaAcademinca {
    private int horas;
    private double precioHora;

    public Curso(String nombre, String descripcion, int horas, double precioHora) {
        super(nombre, descripcion);
        this.horas = horas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularPrecio() {
        return horas*precioHora;
    }


}
