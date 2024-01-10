package Clase8_bancoNacional;

public class BancoNacional {
    public static void main(String[] args) {
        Cliente clienteCH = new Cliente("11112222", "Lopez", "12345654");
        clienteCH.setCuit("zxcvbnm124");

        clienteCH.getDtsCliente();

        CuentaCajaDeAhorro cuentaCH = new CuentaCajaDeAhorro("numbercta00088", 0.07, clienteCH);

        cuentaCH.depositarEfectivo(700.0);
        System.out.println(cuentaCH.informarSaldo());
        System.out.println(cuentaCH.extraerEfectivo(400.0));
        System.out.println(cuentaCH.cobrarInteres());


        Cliente clienteCc = new Cliente("33333333334444444", "Lara", "12223344");
        clienteCH.setCuit("zxcvb23443");
        CuentaCorriente cuentaCte = new CuentaCorriente("nro2345678", clienteCc);
        cuentaCte.setMontoDescubierto(70);
        cuentaCte.depositarEfectivo(500);
        System.out.println(cuentaCte.informarSaldo());
        System.out.println(cuentaCte.extraerEfectivo(400));
        System.out.println(cuentaCte.extraerEfectivo(100));
        System.out.println(cuentaCte.extraerEfectivo(100));


    }

}
