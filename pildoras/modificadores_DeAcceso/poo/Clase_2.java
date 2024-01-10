package pildoras.modificadores_DeAcceso.poo;


import pildoras.modificadores_DeAcceso.pacquete_Pruebas.Clase_3;

public class Clase_2 {
    public static void main(String[] args) {
        Clase_1 miObj = new Clase_1();
        Clase_3 miObj2 = new Clase_3();
        System.out.println("miObj2.miMetodo() = " + miObj2.miMetodo());
    }
}
