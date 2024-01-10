package patronObserver.observer2.cliente;

public class Cliente implements Subscriptor {
    private String name;

    public Cliente(String name) {
        this.name = name;
    }


    @Override
    public void notify(String producto) {
        System.out.println("Hola " + this.name);
        System.out.println("Puedes comparar yaaa !! tu producto = " + producto);
    }
}
