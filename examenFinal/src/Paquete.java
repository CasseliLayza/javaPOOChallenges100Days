package examenFinal.src;

import preFinal.prefinal2.Programa;

import java.util.List;

public class Paquete extends Oferta {
    private double precio;
    private double descuento;
    private List<Producto> productos;


    public Paquete(String nombre, String descripcion, double precio, List<Producto> productos) {
        super(nombre, descripcion);
        this.precio = precio;
        Double porcentajeDescuento = 0.1;
        this.descuento = porcentajeDescuento;
        this.productos = productos;
    }

    @Override
    public double calcularPrecio() {
        double precioBasePaquete = precio - precio * descuento;
        return precioBasePaquete + precioProductos();
    }

    private double precioProductos() {
        double sumatoriaPrecioProductos = 0.0;
        for (Producto productos : productos) {
            sumatoriaPrecioProductos += productos.calcularPrecio();
        }
        return sumatoriaPrecioProductos;
    }

    @Override
    public int compareTo(Oferta o) {
        return Double.compare(this.calcularPrecio(), o.calcularPrecio());
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
