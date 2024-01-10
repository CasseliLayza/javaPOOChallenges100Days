package Clase06_animales.src;

import Clase06_animales.src.animales.Animal;
import Clase06_animales.src.animales.Gato;
import Clase06_animales.src.animales.Perro;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Gato(4);
        Animal animal2 = new Perro(4, false);

        animal1.emitirSonido();
        animal2.emitirSonido();

        animal1.getCantidadDePatas();

        if (animal1 instanceof Gato) {
            Gato miGato = (Gato) animal1;
            miGato.afilarseLasUnias();
        }

        if (animal2 instanceof Gato) {
            ((Gato) animal2).afilarseLasUnias();
        }
    }
}