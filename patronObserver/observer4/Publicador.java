package patronObserver.observer4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publicador {
    private Map<String, List<Subscriptor>> subscriptores;

    public Publicador() {
        this.subscriptores = new HashMap<>();
    }

    public void addSubscriptor(Subscriptor cliente, String product) {
        List<Subscriptor> subscritos = subscriptores.get(product);
        if (subscritos == null) subscritos = new ArrayList<>();
        subscritos.add(cliente);
        subscriptores.put(product, subscritos);

    }

    public void removeSubscriptor(Subscriptor cliente, String product) {
        List<Subscriptor> subscritos = subscriptores.get(product);
        if (subscritos == null) return;
        subscritos.remove(cliente);
        subscriptores.put(product, subscritos);

    }

    public void publicar(String producto) {
        List<Subscriptor> subscritos = subscriptores.get(producto);
        for (Subscriptor subscritor : subscritos) {
            subscritor.notificar(producto);
        }
    }
}
