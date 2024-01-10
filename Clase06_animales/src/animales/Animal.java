package Clase06_animales.src.animales;

public abstract class Animal {
    protected int cantidadDePatas;

    public Animal(int cantidadDePatas) {
        this.cantidadDePatas = cantidadDePatas;
    }

    public abstract void emitirSonido();

    public abstract int getCantidadDePatas();
}
