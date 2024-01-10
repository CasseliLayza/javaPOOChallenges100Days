package RomiBanconacional.src;

public class CuentaCorriente extends Cuenta{

    private double montoDescubierto;

    public CuentaCorriente(Cliente cliente) {
        super(cliente);
        this.montoDescubierto = 0.0;
    }

    public CuentaCorriente(Cliente cliente, double montoDescubierto) {
        super(cliente);
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    public void depositarEfectivo(double monto) {
        super.saldo = super.saldo + monto;
    }

    @Override
    public void extraerEfectivo(double monto) {
        if(super.saldo + montoDescubierto >= monto){
            super.saldo = super.saldo - monto;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}
