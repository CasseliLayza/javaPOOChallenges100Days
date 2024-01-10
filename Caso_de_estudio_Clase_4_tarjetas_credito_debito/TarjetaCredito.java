package Caso_de_estudio_Clase_4_tarjetas_credito_debito;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TarjetaCredito {
    private String nombreCliente;
    private double lineaCredito;
    private double interes;
    private int maxNumeroCuotas;
    private double deudaPorCouta;
    private Map<String, String> resgistroCoutas;

    public TarjetaCredito(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.lineaCredito = 0;
        this.interes = 0;
        this.maxNumeroCuotas = 0;
        // Al crearse una TC la linea de credito interes y maxNumeroCuotas se asigana por evaluacion crediticia por caada usuario.
        this.deudaPorCouta = 0;
        this.resgistroCoutas = new HashMap<>();
    }

    public void setSegunEvaluacionCreditecia(double lineaCredito, double interes, int maxNumeroCuotas) {
        this.lineaCredito = lineaCredito;
        this.interes = interes / 100;
        this.maxNumeroCuotas = maxNumeroCuotas;
    }


    public String realizarCompra(double cantidad, Cuenta cuentaDestino, int numeroDeCuotras) {
        deudaPorCouta = numeroDeCuotras != 0 ? (cantidad * (1 + (numeroDeCuotras * this.interes))) / numeroDeCuotras : 0;
        generaRegistroDeuda(numeroDeCuotras);
        if (cantidad <= this.lineaCredito && numeroDeCuotras <= this.maxNumeroCuotas) {
            double deuda = cantidad * (1 + (numeroDeCuotras * this.interes));
            this.lineaCredito -= deuda;
            double switchValue = numeroDeCuotras != 0 ? deudaPorCouta : deuda;
            double switchValue1 = numeroDeCuotras != 0 ? numeroDeCuotras : 1;
            cuentaDestino.inputSaldo(cantidad);
            return "\n\tCompra realizada con exito el monto es: " + cantidad + " soles" +
                    "\n\tNumero de coutas a pagar : " + numeroDeCuotras +
                    "\n\tEl interes 2.2% c/d cuota es: " + this.interes * cantidad + " soles" +
                    "\n\tEL interes 2.2% por " + numeroDeCuotras + " cuota/s es: " + this.interes * cantidad * (double) numeroDeCuotras + " soles" +
                    "\n\tLa deudaPorCouta: " + this.deudaPorCouta + " soles" +
                    "\n\tEl pagoTotal a realizar: " + switchValue * (double) switchValue1 + " soles" +
                    "\n\tSu saldo actual de su TC es: " + this.lineaCredito + " soles";
        } else {
            return "\n\tSaldo insuficiente su linea actual es: " + this.lineaCredito +
                    "\n\tel maximo de numero de cuotras es: " + this.maxNumeroCuotas +
                    "\n\tSu consumo no precesado fue por: " + cantidad;
        }

    }

    private void generaRegistroDeuda(int numeroDeCuotras) {
        for (int i = 1; i < numeroDeCuotras + 1; i++) {
            resgistroCoutas.put("cuota" + i, String.valueOf(deudaPorCouta));
            System.out.println("cuota" + i + " = " + resgistroCoutas.get("cuota" + i));
        }
        //resgistroCoutas.put("cuota" + 12, "Pagado");
       /* for (int i = 1; i < numeroDeCuotras+1; i++) {

            System.out.println("cuota" + i + " = " + resgistroCoutas.get("cuota" + i));
        }*/
    }

    public String pagarResumenTarjeta(double importe, int numeroCuota) {

        if (numeroCuota != 0 && numeroCuota <= resgistroCoutas.size() && numeroCuota <= this.maxNumeroCuotas) {
            String.valueOf(numeroCuota);

            if (importe >= deudaPorCouta) {
                for (Map.Entry<String, String> entry : resgistroCoutas.entrySet()) {
                    if (("cuota" + numeroCuota).equals(entry.getKey()) && !Objects.equals(entry.getValue(), "Pagado")) {
                        resgistroCoutas.put("cuota" + numeroCuota, "Pagado");
                        return "Nro de : " + entry.getKey() + " = " + entry.getValue();
                    }
                }
                return "Cuota ya pagada";

            } else {
                return "Ingrese la deuda de couta completa " + this.deudaPorCouta;
            }

        } else {
            return "Ingrese una cuota valida, ud tiene " + resgistroCoutas.size() + " cuota/s a pagar";
        }

    }


    public void verRegistroDeudaCredito() {
        System.out.println("Registro de deuda:");
        for (Map.Entry<String, String> entry : resgistroCoutas.entrySet()) {

            System.out.println("Nro de : " + entry.getKey() + " = " + entry.getValue());

        }
    }


    public double getLineaCredito() {
        return lineaCredito;
    }

    public String ifOperadorTernarioUnBloque(){
        if (true) return "true";
        if (false) return "false";
        return "TruefaSE";
    }

}
