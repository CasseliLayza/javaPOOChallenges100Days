package Clase8_impresora;

public class ImpresoraCannon extends Impresora{
    public ImpresoraCannon(String modelo, String tipoConexion) {
        super(modelo, tipoConexion);
    }

    @Override
    public String imprimir() {
        return "Cannon printing Test ";
    }

    @Override
    public boolean necesitaTinta (){
        double minimaTintaRequerida = 0.15;
        return super.porcentajeTinta <= minimaTintaRequerida;
    }
}
