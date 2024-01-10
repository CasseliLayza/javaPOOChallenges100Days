package ejercitacionModeloDeObjetos;

public class Producto {
    private String nombre;
    private double precio;
    private String proveedor;

    public Producto(String nombre, double precio, String proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }


    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
