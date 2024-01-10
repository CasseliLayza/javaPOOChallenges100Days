package patronObserver.observer6;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Caseli");
        Cliente cliente1 = new Cliente("Carla");
        Cliente cliente2 = new Cliente("Camila");
        Tienda tienda = new Tienda("Amazon");
        tienda.subscribe(cliente,"AAAAA");
        tienda.subscribe(cliente1,"AAAAA");
        tienda.subscribe(cliente2,"CCCCC");

        tienda.unsubscribe(cliente1,"AAAAA");

        tienda.notificar("AAAAA");
        tienda.notificar("CCCCC");
    }
}
