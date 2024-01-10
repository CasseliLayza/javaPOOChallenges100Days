package Clase8_bancoNacional;

import java.util.Scanner;

public class CuentaCorriente extends Cuenta {
    private Double montoDescubierto;
    private Cliente clienteCC;

    public CuentaCorriente(String numeroCuenta, Cliente clienteCC) {
        super(numeroCuenta);
        this.montoDescubierto = 0.0;
        this.clienteCC = clienteCC;
    }

    public CuentaCorriente(String numeroCuenta, Double montoDescubierto, Cliente clienteCC) {
        super(numeroCuenta);
        this.montoDescubierto = montoDescubierto;
        this.clienteCC = clienteCC;
    }


    public void setMontoDescubierto(double cantidad) {
        this.montoDescubierto = cantidad;
    }

    @Override
    public String extraerEfectivo(double cantidad) {
        if (cantidad <= super.saldo) {
            super.saldo -= cantidad;
            return "Retiro exitoso el saldo actual es: " + super.saldo;
        } else if (this.montoDescubierto > 0 && super.saldo > 0) {
            double montoDescubiertoRetiradoMasSaldo = this.montoDescubierto + super.saldo;
            this.montoDescubierto = 0.0;
            return "Retiro exitoso : " + montoDescubiertoRetiradoMasSaldo;
        } else {
            System.out.println("Saldo insuficiente ingrese 'Y' para retiro de Descubierto");
            Scanner scanner = new Scanner(System.in);
            String flag = scanner.nextLine();
            if (flag.toUpperCase().equals("Y")) {
                double montoDescubierto = this.montoDescubierto;
                this.montoDescubierto = 0.0;
                return " Retiro exitoso montoDescubierto: " + montoDescubierto;
            } else {
                return " Seleccion invalida - Operacion cancelada";
            }
        }
    }

}
