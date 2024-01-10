package Clase09_interfaces;

public class RobotPesado extends SistemaArmas implements Elevable{
    public RobotPesado(String energia) {
        super(energia);
    }

    @Override
    public void volar() {
        System.out.println("Volar con sobeconsumo de energia!!");
    }
}
