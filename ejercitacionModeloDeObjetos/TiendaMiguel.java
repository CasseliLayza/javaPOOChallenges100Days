package ejercitacionModeloDeObjetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TiendaMiguel {
    private List<Cliente> clientes;
    private List<Producto> productos;
    private List<Empleado> empleados;
    private String turno;
    private List<Venta> ventas;


    public TiendaMiguel(List<Cliente> clientes, List<Producto> productos, List<Empleado> empleados, String turno) {
        this.clientes = clientes;
        this.productos = productos;
        this.empleados = empleados;
        this.turno = turno;
        this.ventas = new ArrayList<>();
    }


    public void registarVentas(Producto producto, Cliente cliente, Empleado empleado) {
        if (empleado.registrarVenta(cliente, producto)) {
            Venta venta = new Venta(producto, empleado, new Date(), cliente);
            this.ventas.add(venta);
        }
    }


    public double reporteVentas() {
        int i = 0;
        double totalVentas = 0.0;
        for (Venta venta : ventas) {
            System.out.println("venta.mostrarRegistroVenta(" + i + "): " + venta.mostrarRegistroVenta());
            totalVentas += venta.getPrecio();
            i++;
        }
        return totalVentas;
    }


}
