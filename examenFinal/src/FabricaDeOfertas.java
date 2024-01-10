package examenFinal.src;

import java.util.List;

public class FabricaDeOfertas {

    public static final String CODIGO_PAQUETE = "paquete";
    public static final String CODIGO_PRODUCTO = "producto";


    public static Oferta crearOferta(String codigoOferta, String nombre, String descripcion, double precio, List<Producto> productos) throws MyExceptionErrorCodigoOferta {
        Oferta nuevaOferta;
        if (codigoOferta.equals(CODIGO_PRODUCTO)) {
            nuevaOferta = new Producto(nombre, descripcion, precio);
        } else if (codigoOferta.equals(CODIGO_PAQUETE)) {
            nuevaOferta = new Paquete(nombre, descripcion, precio, productos);
        } else {
            throw new MyExceptionErrorCodigoOferta("No se puedo crear la oferta solicitada");
        }

        return nuevaOferta;
    }
}
