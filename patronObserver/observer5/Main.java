package patronObserver.observer5;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Casseli");
        Cliente cliente1 = new Cliente("Alexa");
        Cliente cliente2 = new Cliente("YuriBoica");

        Tienda tienda = new Tienda("Amazon");
        tienda.subscribeCliente(cliente,"Iphone 14");
        tienda.subscribeCliente(cliente1,"Iphone 14");

        //tienda.desSubscribirCliente(cliente1,"Iphone 14");
        tienda.subscribeCliente(cliente2,"Iphone 15");

        tienda.llegaNuevoProducto("Iphone 14");
        tienda.llegaNuevoProducto("Iphone 15");


/*        List<String> letras = new ArrayList<>();
        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");

        System.out.println("letras = " + letras);
        letras.remove("a");

        System.out.println("letras = " + letras);
        letras.remove("a");*/ //no genera excepcion si no lo encuentra
    }
}
