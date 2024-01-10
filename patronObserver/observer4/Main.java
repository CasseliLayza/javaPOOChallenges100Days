package patronObserver.observer4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("casseli");
        Cliente cliente1 = new Cliente("Alex");
        Cliente cliente2 = new Cliente("Pepe");
        Cliente cliente3 = new Cliente("Yury");

        Tienda tienda = new Tienda("Amazon");
        tienda.registarCliente(cliente,"Iphone X");
        tienda.registarCliente(cliente1,"Iphone 17");
        tienda.registarCliente(cliente2,"Iphone 15");
        tienda.registarCliente(cliente3,"Iphone 13");

        tienda.desregistarCliente(cliente2,"Iphone 15");

        tienda.nuevoProducto("Iphone X");
        tienda.nuevoProducto("Iphone 17");
        tienda.nuevoProducto("Iphone 15");
        tienda.nuevoProducto("Iphone 13");
    }
}
