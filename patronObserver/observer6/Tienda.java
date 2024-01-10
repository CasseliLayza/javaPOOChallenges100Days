package patronObserver.observer6;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<String> productos;
    private Notificador notificador;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
        this.notificador = new Notificador();
    }

    public void subscribe(Cliente cliente, String producto) {
        notificador.subscribe(cliente, producto);
    }

    public void notificar(String producto) {
        notificador.notificar(producto);
    }


    public void unsubscribe(Cliente cliente, String producto) {
        notificador.unsubscribe(cliente,producto);
    }
}
