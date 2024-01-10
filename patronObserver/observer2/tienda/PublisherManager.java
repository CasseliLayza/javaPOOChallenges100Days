package patronObserver.observer2.tienda;

import patronObserver.observer2.cliente.Subscriptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublisherManager {
    private String publisherName;
    private Map<String, List<Subscriptor>> subscriptors;

    public PublisherManager(String publisherName) {
        this.publisherName = publisherName;
        this.subscriptors = new HashMap<>();
    }

    public void addSubscriptor(Subscriptor cliente, String product) {
        List<Subscriptor> subscritos = this.subscriptors.get(product);
        if (subscritos == null) subscritos = new ArrayList<>();
        subscritos.add(cliente);
        subscriptors.put(product, subscritos);
    }


    public void publishCliente(String product) {
        List<Subscriptor> subscritos = this.subscriptors.get(product);
        for (Subscriptor subscriptor : subscritos) {
            subscriptor.notify(product);
        }

    }

    public void removeSubscriptor(Subscriptor cliente, String product) {
        List<Subscriptor> subscritos = this.subscriptors.get(product);
        if (subscritos == null) return;
        subscritos.remove(cliente);
        subscriptors.put(product, subscritos);
    }
}
