package patronObserver.observer6;

public class Cliente implements Subscriptor{
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void notifica(String producto) {
        System.out.println("Hola " + nombre);
        System.out.println("Producto disponible ya!!  " + producto);
    }
}
