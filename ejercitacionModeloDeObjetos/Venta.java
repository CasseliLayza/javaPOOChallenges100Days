package ejercitacionModeloDeObjetos;

import java.util.Date;

public class Venta {
    private Producto producto;
    private double precio;
    private Empleado vendedor;
    private Date fechaHoraVenta;

    private Cliente cliente;

    public Venta(Producto producto, Empleado vendedor, Date fechaHoraVenta, Cliente cliente) {
        this.producto = producto;
        this.precio = producto.getPrecio();
        this.vendedor = vendedor;
        this.fechaHoraVenta = fechaHoraVenta;
        this.cliente = cliente;
    }


    public String mostrarRegistroVenta() {
        return "\n\t producto: " + this.producto.getNombre() +
                "\n\t precio: " + this.precio +
                "\n\t Vendedor: " + this.vendedor.getNombreEmpleado() +
                "\n\t horafechaventa: " + this.fechaHoraVenta +
                "\n\t cliente: " + this.cliente.getNombreCliente();
    }

    public double getPrecio() {
        return precio;
    }
}
