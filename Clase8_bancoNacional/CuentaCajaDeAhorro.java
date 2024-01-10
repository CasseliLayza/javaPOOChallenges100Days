package Clase8_bancoNacional;

public class CuentaCajaDeAhorro extends Cuenta {
    private double tazaInteres;
    private Cliente clienteCCH;

    public CuentaCajaDeAhorro(String numeroCuenta, Cliente clienteCCH) {
        super(numeroCuenta);
        this.tazaInteres = 0.07;
        this.clienteCCH = clienteCCH;
    }

    public CuentaCajaDeAhorro(String numeroCuenta, double tazaInteres, Cliente clienteCCH) {
        super(numeroCuenta);
        this.tazaInteres = tazaInteres;
        this.clienteCCH = clienteCCH;
    }

    @Override
    public String extraerEfectivo(double cantidad) {
        if (cantidad < super.saldo) {
            super.saldo -= cantidad;
            return "Retiro exitoso el saldo actual es: " + super.saldo;
        } else {
            return "Saldo insuficiente el saldo actual es: " + super.saldo;
        }

    }

    public String cobrarInteres() {
        super.saldo -= super.saldo * this.tazaInteres;
        return "Retiro de intereses con exito : " + super.saldo * this.tazaInteres;

    }


}
