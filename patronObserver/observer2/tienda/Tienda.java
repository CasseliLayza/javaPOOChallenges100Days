package patronObserver.observer2.tienda;

import patronObserver.observer2.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String storeName;
    private List<String> products;
    private PublisherManager publisherManager;

    public Tienda(String storeName, String publisherName) {
        this.storeName = storeName;
        this.products = new ArrayList<>();
        this.publisherManager = new PublisherManager(publisherName);
    }

    public void subscribirCliente(Cliente cliente, String product) {
        publisherManager.addSubscriptor(cliente, product);
    }

    public void newproduct(String product) {
        this.products.add(product);
        publisherManager.publishCliente(product);
    }

    public void desubscribirCliente(Cliente cliente, String product) {
        publisherManager.removeSubscriptor(cliente, product);
    }

}
