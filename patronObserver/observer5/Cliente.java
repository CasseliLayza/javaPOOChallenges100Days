package patronObserver.observer5;

public class Cliente implements EresSubscriptor{
    private String nombreCliente;

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public void notificame(String producto) {
        System.out.println("Hola = " + nombreCliente);
        System.out.println("Ya esta disponible el..!! " + producto);
    }
}
