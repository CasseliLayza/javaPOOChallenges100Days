package finalC.src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("Market House");
        Producto harina = new Producto("Harina", "Harina leudante", 30, 0.1);
        Producto agua = new Producto("Agua", "Agua sin gas", 15, 0.1);
        supermercado.agregarOferta(FabricaDeOfertas.CODIGO_PAQUETE, "Masa de Pizza", "Ingredientes de pizza", 50, List.of(agua, harina));
        supermercado.agregarOferta(FabricaDeOfertas.CODIGO_PRODUCTO, "Agua", "Agua con gas", 20, List.of());
        supermercado.agregarOferta(FabricaDeOfertas.CODIGO_PRODUCTO, "Harina", "Harina común", 15, List.of());
        supermercado.agregarOferta("", "Chocolate", "Chocolate con maní", 20, List.of());
        supermercado.informe();
    }
}
