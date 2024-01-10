package Clase06_animales.src.animales;

public class Gato extends Animal {

    public Gato(int cantidadDePatas) {
        super(cantidadDePatas);
    }

    @Override
    public void emitirSonido() {
        System.out.println("animales.Gato says miau");
    }

    @Override
    public int getCantidadDePatas() {
        return super.cantidadDePatas;
    }

    public void afilarseLasUnias() {
        System.out.println("Me estoy afilando las uñas con el sillón nuevo.");
    }
}
