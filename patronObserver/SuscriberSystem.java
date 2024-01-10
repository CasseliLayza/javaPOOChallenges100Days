package patronObserver;

import java.util.*;

public class SuscriberSystem {
    private String nombre;
    private Map<String, List<Suscriber>> suscribers = new HashMap<>();

    public void addSuscriber(Suscriber suscriber, String producto) {
        List<Suscriber> suscriptos = this.suscribers.get(producto);
        if (suscriptos == null) {
            suscriptos = new ArrayList<>();
        }
        suscriptos.add(suscriber);
        this.suscribers.put(producto, suscriptos);
        //this.publish(producto);
    }

    public void removeSuscriber(Suscriber suscriber, String producto) {
        List<Suscriber> suscriptos = this.suscribers.get(producto);
        if (suscriptos == null){
            return;
        }
        suscriptos.remove(suscriber);
        this.suscribers.put(producto, suscriptos);
    }

    public void publish(String producto) {
        List<Suscriber> suscriptos = this.suscribers.get(producto);
        for (Suscriber suscriber : suscriptos) {
            suscriber.notify(producto);
        }
    }

    public void addNewProduct(String nuevoProducto) {
        if (suscribers.get(nuevoProducto) == null) {
            List<Suscriber> newSubscribers = new ArrayList<>();
            this.suscribers.put(nuevoProducto, newSubscribers);
            System.out.println("nuevo producto registrado, sin subscriptores");
        } else {

            this.publish(nuevoProducto);
       /*     for (Map.Entry<String, List<Suscriber>> entry : suscribers.entrySet()) {
                if (nuevoProducto.equals(entry.getKey())) {
                    this.publish(nuevoProducto);
                }
            }*/
           // System.out.println("prod Sin subscriptores");
        }

    }

}
