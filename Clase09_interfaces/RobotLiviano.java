package Clase09_interfaces;

public class RobotLiviano extends SistemaArmas implements Elevable{
    public RobotLiviano(String energia) {
        super(energia);
    }

    @Override
    public void volar() {
        System.out.println("Volar!!");
    }
}
