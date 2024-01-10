package patronObserver.observer2;

import patronObserver.observer2.cliente.Cliente;
import patronObserver.observer2.tienda.Tienda;

public class Main {
    public static void main(String[] args) {
        Cliente casseli = new Cliente("Casseli");
        Cliente alex = new Cliente("Alex");
        Cliente yuri = new Cliente("Yury");
        Cliente pepe = new Cliente("Pepe");

        Tienda tienda = new Tienda("Meli","Publicador");
        tienda.subscribirCliente(casseli,"Iphoen17");
        tienda.subscribirCliente(alex,"Iphoen15");
        tienda.subscribirCliente(yuri,"Iphoen15");
        tienda.subscribirCliente(pepe,"Iphoen13");

        tienda.desubscribirCliente(yuri, "Iphoen15");

        tienda.newproduct("Iphoen17");
        tienda.newproduct("Iphoen15");
        tienda.newproduct("Iphoen13");

    }
}
