package patronObserver;


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Casseli");
        Cliente cliente1 = new Cliente("Miguel");
        Cliente cliente2 = new Cliente("Dian");
        Suscriber s = new Cliente("s");

        SuscriberSystem publisherManager = new SuscriberSystem();

        Tienda tienda = new Tienda("Amazon", publisherManager);
        tienda.suscribirCliente(cliente,"Iphone 11");
        tienda.suscribirCliente(cliente1,"Iphone 11");
        tienda.suscribirCliente(cliente2,"Iphone 15");
        tienda.suscribirCliente(cliente2,"Iphone 17");
        tienda.unSubscriber(cliente,"Iphone 11");

        tienda.nuevoProducto("Iphone 20");
        tienda.nuevoProducto("Iphone 13");
        tienda.nuevoProducto("Iphone 11");
        tienda.nuevoProducto("Iphone 17");




    }
}
