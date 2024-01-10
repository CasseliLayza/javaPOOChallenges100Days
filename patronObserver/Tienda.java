package patronObserver;

import java.util.ArrayList;
import java.util.List;
public class Tienda {
    private String nombre;
    private List<String> productos;
    private SuscriberSystem suscriberSystem;

    public Tienda(String nombre, SuscriberSystem suscriberSystem) {
        this.nombre = nombre;
        this.suscriberSystem = suscriberSystem;
        this.productos= new ArrayList<>();
    }

    public void suscribirCliente(Cliente cliente, String producto){
        this.suscriberSystem.addSuscriber(cliente,producto);
    }

    public void nuevoProducto(String nuevoProducto){
        this.productos.add(nuevoProducto);
        //suscriberSystem.publish();
        this.suscriberSystem.addNewProduct(nuevoProducto);
    }

    public void unSubscriber(Cliente cliente, String producto){
        this.suscriberSystem.removeSuscriber(cliente, producto);
    }
}
