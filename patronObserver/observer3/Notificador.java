package patronObserver.observer3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Notificador {
    private Map<String, List<Subscritor>> susbscriptores;


    public Notificador() {
        this.susbscriptores = new HashMap<>();
    }

    public void susbscribe(Subscritor cliente, String producto) {
        List<Subscritor> subscritos = susbscriptores.get(producto);
        if(subscritos == null) subscritos = new LinkedList<>();
        subscritos.add(cliente);
        susbscriptores.put(producto,subscritos);
    }

    public void unsusbscribe(Subscritor cliente, String producto) {
        List<Subscritor> subscritos =susbscriptores.get(producto);
        if(subscritos==null) return;
        subscritos.remove(cliente);
        susbscriptores.put(producto,subscritos);
    }


    public void notificar(String producto) {
        List<Subscritor> subscritos =susbscriptores.get(producto);
        for (Subscritor clientesSubscritos : subscritos) {
            clientesSubscritos.notificarSubscriptor(producto);
        }
    }
}
