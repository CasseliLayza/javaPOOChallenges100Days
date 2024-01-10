package patronObserver.observer1;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombreTienda;
    private List<String> productos;
    private SubscriptorSystem subscriptorSystem;

    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.subscriptorSystem = new SubscriptorSystem();
        this.productos = new ArrayList<>();
    }

    public void addProductos(String productos) {
        this.productos.add(productos);
    }

    public void suscribirCliente(Cliente cliente, String producto) {
        subscriptorSystem.addSubscriptor(cliente, producto);
    }

    public void nuevoProducto(String nuevoProducto) {
        addProductos(nuevoProducto);
        subscriptorSystem.publishCliente(nuevoProducto);
    }

    public void desuscribirCliente(Cliente cliente, String producto) {
        subscriptorSystem.removeSubscriptor(cliente, producto);
    }


}
