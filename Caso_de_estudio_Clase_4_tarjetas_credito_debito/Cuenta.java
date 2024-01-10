package Caso_de_estudio_Clase_4_tarjetas_credito_debito;

public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;
    private TarjetaDebito tarjetaDebito;

    public Cuenta(String nombreCliente, String numeroCuenta) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.tarjetaDebito = null;
    }

    public void inputSaldo(double saldo) {
        this.saldo += saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public boolean debitarSaldo(double cantidad, Cuenta cuentaDestino) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            cuentaDestino.inputSaldo(cantidad);
            return true;
        }
        return false;
    }
}
