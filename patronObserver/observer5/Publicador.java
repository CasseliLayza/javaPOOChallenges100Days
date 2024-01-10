package patronObserver.observer5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publicador {
    private Map<String, List<EresSubscriptor>> subscriptores;

    public Publicador() {
        this.subscriptores = new HashMap<>();
    }

    public void subscribe(Cliente cliente, String producto) {
        List<EresSubscriptor> listaSubscritos = dameLaListaDESubscriptores(producto);
        listaSubscritos.add(cliente);
        subscriptores.put(producto,listaSubscritos);
    }

    private List<EresSubscriptor> dameLaListaDESubscriptores(String producto) {
        List<EresSubscriptor> listaSubscritos = subscriptores.get(producto);
        if(listaSubscritos==null){
            listaSubscritos = new ArrayList<>();
        }
        return listaSubscritos;
    }


    public void notificarSubscriptores(String producto) {
        List<EresSubscriptor> listaSubscritos=subscriptores.get(producto);
        for (EresSubscriptor clienteSubscriptor: listaSubscritos) {
            clienteSubscriptor.notificame(producto);
        }
    }

    public void desSubscribe(Cliente cliente, String producto) {
        List<EresSubscriptor> listaSubscritos =dameLaListaDESubscriptores(producto);
        listaSubscritos.remove(cliente);
        subscriptores.put(producto,listaSubscritos);
    }
}
