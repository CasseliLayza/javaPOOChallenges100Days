package RomiBanconacional.src;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        Cliente c = new Cliente("123","Fernandez","435678","35775");
        Cuenta caja = new CajaDeAhorro(c,5);
        Cuenta corriente = new CuentaCorriente(c,120);

        caja.depositarEfectivo(123);
        caja.extraerEfectivo(400);

        ((CajaDeAhorro) caja).cobrarInteres();

        corriente.depositarEfectivo(200);
        corriente.extraerEfectivo(20);

    }
}