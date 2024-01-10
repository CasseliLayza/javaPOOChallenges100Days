package examenFinal.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermercado {
    private String nombre;
    private List<Oferta> ofertas;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();
    }

    public void agregarOferta(String codigoOferta, String nombre, String descripcion, double precio, List<Producto> productos) {

        try {
            ofertas.add(FabricaDeOfertas.crearOferta(codigoOferta, nombre, descripcion, precio, productos));
        } catch (MyExceptionErrorCodigoOferta e) {
            System.out.println(e.getMessage());
        }

    }

    public void informe() {
        System.out.println("--------Informe--------");
        mostrarOfertas();
        System.out.println("--------Market House--------");


    }

    private void mostrarOfertas() {
        Collections.sort(ofertas);
        for (Oferta oferta : ofertas) {
            if (oferta instanceof Producto) {
                mostraProductos(oferta);
            } else {
                Paquete paquete = (Paquete) oferta;
                mostrarProductoResume(paquete);
                for (Producto producto : paquete.getProductos()) {
                    mostraProductos(producto);
                }
            }
        }
    }

    private void mostraProductos(Oferta oferta) {
        System.out.println("\tProducto { nombre = " + oferta.getNombre() + "\t" + "precio = " + oferta.calcularPrecio() + " }");
    }

    private void mostrarProductoResume(Oferta oferta) {
        System.out.println("Paquete { nombre = " + oferta.getNombre() + "\t" + "precio = " + oferta.calcularPrecio() + " }");
    }
}
