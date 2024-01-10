package patronObserver.observer3;

public class Main {
    public static void main(String[] args) {
        Cliente cassei = new Cliente("Casseli");
        Cliente alex = new Cliente("Alex");
        Cliente yury = new Cliente("Yury");
        Tienda tienda = new Tienda("Amazon");

        tienda.suscribirCLiente(cassei,"Iphone X");
        tienda.suscribirCLiente(alex,"Iphone X");
        tienda.suscribirCLiente(yury,"Iphone XV");

        tienda.desSubscribirCliente(cassei,"Iphone X");

        tienda.nuevoProducto("Iphone X");
        tienda.nuevoProducto("Iphone XV");
    }
}
