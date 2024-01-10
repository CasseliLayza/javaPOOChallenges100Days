package patronObserver;

public class Cliente implements Suscriber {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notify(String producto) {

        System.out.println("Hola : " + this.nombre);
        System.out.println("\tcomprar el nuevo producto en stock: " + producto);

    }



}
