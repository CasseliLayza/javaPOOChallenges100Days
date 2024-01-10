package preFinal.prefinal2;

public abstract class OfertaAcademinca implements Comparable<OfertaAcademinca> {
    private String nombre;
    private String descripcion;

    public OfertaAcademinca(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();


    @Override
    public int compareTo(OfertaAcademinca o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }

    public String getNombre() {
        return nombre;
    }
}
