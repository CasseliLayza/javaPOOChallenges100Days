package Caso_de_estudio_Clase_4_tarjetas_credito_debito;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cuenta casseliCuenta = new Cuenta("Casseli","1234509876549");
        Cuenta cuentaMallPlaza = new Cuenta("MallPlaza.SAC","127890084645256");
        cuentaMallPlaza.inputSaldo(1700000);
        casseliCuenta.inputSaldo(400000);
        System.out.println("casseliCuenta.getSaldo() = " + casseliCuenta.getSaldo());
        System.out.println("cuentaMallPlaza.getSaldo() = " + cuentaMallPlaza.getSaldo());
        TarjetaDebito tarjetaDebitoCasseli = new TarjetaDebito("Casseli","5678912456",new Date(123, Calendar.AUGUST,11),casseliCuenta);

        System.out.println("tarjetaDebitoCasseli.getFechaVencimiento() = " + tarjetaDebitoCasseli.getFechaVencimiento());
        System.out.println("Transaccion realizada: "+tarjetaDebitoCasseli.realizaTransaccion(2000,cuentaMallPlaza));

        System.out.println("casseliCuenta.getSaldo() = " + casseliCuenta.getSaldo());
        System.out.println("cuentaMallPlaza.getSaldo() = " + cuentaMallPlaza.getSaldo());

        TarjetaCredito tarjetaCreditoCasseli = new TarjetaCredito("Casseli Layza");
        tarjetaCreditoCasseli.setSegunEvaluacionCreditecia(18000,2.2,12);

        System.out.println("tarjetaCreditoCasseli.getLineaCredito() = " + tarjetaCreditoCasseli.getLineaCredito());

        System.out.println("tarjetaCreditoCasseli.realizarCompra(2000,cuentaMallPlaza,12) = " + tarjetaCreditoCasseli.realizarCompra(2000, cuentaMallPlaza, 8));
        System.out.println("tarjetaCreditoCasseli.pagarResumenTarjeta() = " + tarjetaCreditoCasseli.pagarResumenTarjeta(2044,1));
        tarjetaCreditoCasseli.verRegistroDeudaCredito();

        System.out.println("cuentaMallPlaza.getSaldo() = " + cuentaMallPlaza.getSaldo());
        System.out.println("tarjetaCreditoCasseli.getLineaCredito() = " + tarjetaCreditoCasseli.getLineaCredito());

        System.out.println(tarjetaCreditoCasseli.ifOperadorTernarioUnBloque());


    }
}
