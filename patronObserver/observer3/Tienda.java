package patronObserver.observer3;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<String> productos;
    private Notificador notificador;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
        this.notificador= new Notificador();
    }

    public void suscribirCLiente(Cliente cliente, String producto) {
        notificador.susbscribe(cliente, producto);
    }

    public void desSubscribirCliente(Cliente cliente, String producto) {
        notificador.unsusbscribe(cliente, producto);
    }

    public void nuevoProducto(String producto){
        productos.add(producto);
        notificador.notificar(producto);
    }
}
