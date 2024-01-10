package ejercitacionModeloDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente casseli = new Cliente("casseli");
        casseli.setPresupuesto(1000);
        Cliente alex = new Cliente("Alex");
        alex.setPresupuesto(100);

        Empleado empleado = new Empleado("Pepe","AM");
        Empleado empleado1 = new Empleado("Lalo","PM");

        Producto producto = new Producto("papitasLays", 1.5, "lays");
        Producto producto1 = new Producto("chetos", 1.7, "laysFood");
        Producto producto2 = new Producto("gaseosa", 3.5, "Cocaloa");
        Producto producto3 = new Producto("cevesa", 5.5, "Backus");

        List<Producto> productos = new ArrayList<>();
        productos.add(producto);
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);
        empleados.add(empleado1);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(casseli);
        clientes.add(alex);

        System.out.println("\ncasseli.saldoDisponible inicial = " +  casseli.saldoDisponible());
        System.out.println("Alex.saldoDisponible inicial = " +  alex.saldoDisponible()+"\n");

        TiendaMiguel tiendaMiguel = new TiendaMiguel(clientes,productos,empleados,"AM-PM");
        tiendaMiguel.registarVentas(producto,casseli,empleado);
        tiendaMiguel.registarVentas(producto1,alex,empleado1);
        tiendaMiguel.registarVentas(producto2,casseli,empleado);
        tiendaMiguel.registarVentas(producto3,casseli,empleado1);
        System.out.println("\nVentas total: "+tiendaMiguel.reporteVentas());

        System.out.println("\ncasseli.saldoDisponible Final = " +  casseli.saldoDisponible());
        System.out.println("Alex.saldoDisponible Final = " +  alex.saldoDisponible());

    }

}
