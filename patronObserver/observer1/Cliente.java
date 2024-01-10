package patronObserver.observer1;

public class Cliente implements Subscriptor {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void notify(String producto) {
        System.out.println("this.nombre = " + this.nombre);
        System.out.println("voy a comprar el producto = " + producto);
    }
}
