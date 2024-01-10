package patronObserver.observer6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notificador {
    private Map<String, List<Subscriptor>> subscriptoresPorProducto = new HashMap<>();

    public void subscribe(Cliente cliente, String producto) {
        List<Subscriptor> listaSubscriptoresPorProducto = getSubscriptors(producto);
        listaSubscriptoresPorProducto.add(cliente);
        subscriptoresPorProducto.put(producto,listaSubscriptoresPorProducto);
    }

    private List<Subscriptor> getSubscriptors(String producto) {
        List<Subscriptor> listaSubscriptoresPorProducto = subscriptoresPorProducto.get(producto);
        if (listaSubscriptoresPorProducto == null) {
            listaSubscriptoresPorProducto = new ArrayList<>();
        }
        return listaSubscriptoresPorProducto;
    }


    public void notificar(String producto) {
        List<Subscriptor> listaSubscriptoresPorProducto = getSubscriptors(producto);
        for (Subscriptor subscriptor: listaSubscriptoresPorProducto) {
            subscriptor.notifica(producto);
        }
    }

    public void unsubscribe(Cliente cliente, String product) {
        List<Subscriptor> listaSubscriptoresPorProducto = getSubscriptors(product);
        listaSubscriptoresPorProducto.remove(cliente);
        subscriptoresPorProducto.put(product,listaSubscriptoresPorProducto);

    }
}
