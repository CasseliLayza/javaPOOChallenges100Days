package finalC.src;

public class Producto extends Oferta {

    private double precio;
    private double impuesto;

    public Producto(String nombre, String descripcion, double precio, double impuesto) {
        super(nombre, descripcion);
        this.precio = precio;
        this.impuesto = impuesto;

    }

    public Producto(String nombre, String descripcion, double precio) {
        super(nombre, descripcion);
        this.precio = precio;
        Double porcentajeImpuesto = 0.1;
        this.impuesto = porcentajeImpuesto;

    }

    @Override
    public double calcularPrecio() {
        return precio + precio * impuesto;
    }

    @Override
    public int compareTo(Oferta o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }
}
