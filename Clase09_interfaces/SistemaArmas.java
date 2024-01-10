package Clase09_interfaces;

public class SistemaArmas {

    private String energia;

    public SistemaArmas(String energia) {
        this.energia = energia;
    }


    public String getEnergia(){
        return this.energia;
    }

    public void atacar(){
        System.out.println("Ataque!!");
    }

    public void defenderse(){
        System.out.println("Defensa!!");
    }

    public void mostrar(){
        System.out.println("Muestra!!");
    }


}
