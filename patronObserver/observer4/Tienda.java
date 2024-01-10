package patronObserver.observer4;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String storeName;
    private List<String> products;
    private Publicador publicador;

    public Tienda(String storeName) {
        this.storeName = storeName;
        this.products = new ArrayList<>();
        this.publicador = new Publicador();
    }

    public void registarCliente(Cliente cliente, String product) {
        publicador.addSubscriptor(cliente, product);
    }

    public void desregistarCliente(Cliente cliente, String product) {
        publicador.removeSubscriptor(cliente, product);
    }

    public void nuevoProducto(String producto) {
        this.products.add(producto);
        publicador.publicar(producto);
    }
}
