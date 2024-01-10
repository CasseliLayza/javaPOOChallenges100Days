package patronObserver.observer3;

public class Cliente implements Subscritor {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void notificarSubscriptor(String producto) {
        System.out.println("Hola " + nombre);
        System.out.println("Ya! tines disponible el " + producto);
    }
}
