package patronObserver.observer1;

public class Main {
    public static void main(String[] args) {
        Cliente casseli = new Cliente("casseli");
        Cliente cliente1 = new Cliente("Alejandra");
        Cliente cliente2 = new Cliente("Alex");
        Cliente cliente3 = new Cliente("Yuri");

        Tienda tienda = new Tienda("Amzaon");
        tienda.suscribirCliente(casseli,"Iphone 17");
        tienda.suscribirCliente(cliente1,"Iphone 15");
        tienda.suscribirCliente(cliente2,"Iphone 15");
        tienda.suscribirCliente(cliente3,"Iphone 13");
        tienda.desuscribirCliente(cliente2,"Iphone 15");
        tienda.nuevoProducto("Iphone 17");
        tienda.nuevoProducto("Iphone 15");
        tienda.nuevoProducto("Iphone 13");
    }
}
