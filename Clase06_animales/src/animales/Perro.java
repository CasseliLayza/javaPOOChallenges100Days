package Clase06_animales.src.animales;

public class Perro extends Animal {
    private boolean esGuardian;

    public Perro(int cantidadDePatas, boolean esGuardian) {
        super(cantidadDePatas);
        this.esGuardian = esGuardian;
    }

    @Override
    public void emitirSonido() {
        if (this.esGuardian) {
            System.out.println("Perro says guau con cara de malo");
        } else {
            System.out.println("Perro says guau con cara de bueno");
        }
    }

    @Override
    public int getCantidadDePatas() {
        return super.cantidadDePatas;
    }
}
