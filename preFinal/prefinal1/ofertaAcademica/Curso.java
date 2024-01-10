package preFinal.prefinal1.ofertaAcademica;

public class Curso extends OfertaAcademica {
    private int horas;
    private double valorHora;

    public Curso(String nombre, String descripcion, int horas, double valorHora) {
        super(nombre, descripcion);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double culcularPrecio() {
    return horas*valorHora;

    }



}
