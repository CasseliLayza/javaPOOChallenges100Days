package patronObserver.observer4;

public class Cliente implements Subscriptor{
    private String clienteName;

    public Cliente(String clienteName) {
        this.clienteName = clienteName;
    }


    @Override
    public void notificar(String product) {
        System.out.println("this.clienteName = " + this.clienteName);
        System.out.println("product disponible compra ya!! => " + product);
    }
}
