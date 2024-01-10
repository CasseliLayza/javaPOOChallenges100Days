package Clase8_bancoNacional;

public abstract class Cuenta {

    private String numeroCuenta;
    protected double saldo;

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;

    }

    public void depositarEfectivo(double importe) {
        this.saldo += importe;
    }

    public abstract String extraerEfectivo(double cantidad);


    public String informarSaldo() {
        return "Saldo actual: " + this.saldo;
    }
}
