package Caso_de_estudio_Clase_4_tarjetas_credito_debito;

import java.util.Date;

public class TarjetaDebito {
    private String nombreTitular;
    private String numero;
    private Date fechaVencimiento;

    private Cuenta cuenta;


    public TarjetaDebito(String nombreTitular, String numero, Date fechaVencimiento, Cuenta cuenta) {
        this.nombreTitular = nombreTitular;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cuenta = cuenta;
    }

    public String realizaTransaccion(double cantidad, Cuenta cuentaDestino) {

        if (this.fechaVencimiento.getTime() >= new Date().getTime()) {

            return cuenta.debitarSaldo(cantidad, cuentaDestino) +
                    "\n\timporte = " + cantidad +
                    "\n\tnombreCuentaDestino = " + cuentaDestino.getNombreCliente();
        } else {
            return "La tarjeta vencio el " + this.fechaVencimiento + " acerquese a su banco para renovarla";
        }

    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
}
