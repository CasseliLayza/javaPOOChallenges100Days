package Clase8_impresora;

public class ImpresoraEpson extends Impresora {

    public ImpresoraEpson(String modelo, String tipoConexion) {

        super(modelo, tipoConexion);
    }

    @Override
    public String imprimir() {
        return "Epson printing Test";
    }
}
