package patronObserver.observer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptorSystem {
    private String name;
    private Map<String,List<Subscriptor>> subscriptors= new HashMap<>();


    public void addSubscriptor(Subscriptor subscriptor, String producto) {
         List<Subscriptor> subscriptos = this.subscriptors.get(producto);
         if(subscriptos==null) {
             subscriptos=new ArrayList<>();
         }
        subscriptos.add(subscriptor);
         subscriptors.put(producto,subscriptos);

    }

    public void publishCliente(String producto){
        List<Subscriptor> subscriptos =subscriptors.get(producto);
        for (Subscriptor subscriptor: subscriptos) {
            subscriptor.notify(producto);
        }

    }

    public void removeSubscriptor(Subscriptor subscriptor, String producto){
        List<Subscriptor> subscritos = subscriptors.get(producto);
        if(subscritos == null) return;
        subscritos.remove(subscriptor);
        subscriptors.put(producto,subscritos);
    }
}
