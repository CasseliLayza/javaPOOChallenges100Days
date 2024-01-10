package preFinal.prefinal1.ofertaAcademica;

public abstract class OfertaAcademica implements Comparable<OfertaAcademica> {
    private String nombre;
    private String descripcion;


    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public abstract double culcularPrecio();

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(OfertaAcademica o) {
        return Double.compare(culcularPrecio(), o.culcularPrecio());
    }


}
