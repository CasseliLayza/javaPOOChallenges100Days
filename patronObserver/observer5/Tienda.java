package patronObserver.observer5;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<String> productos;
    private Publicador publicador;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos=new ArrayList<>();
        this.publicador= new Publicador();
    }

    public void subscribeCliente(Cliente cliente, String producto){
        publicador.subscribe(cliente,producto);
    }

    public void llegaNuevoProducto(String producto){
        producto.equals(producto);
        publicador.notificarSubscriptores(producto);
    }

    public void desSubscribirCliente(Cliente cliente, String producto) {
        publicador.desSubscribe(cliente,producto);
    }
}
