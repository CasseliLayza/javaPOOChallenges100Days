package RomiBanconacional.src;

public class CajaDeAhorro extends Cuenta{

    private double interes;

    public CajaDeAhorro(Cliente cliente) {
        super(cliente);
        this.interes = 0.0;
    }
    public CajaDeAhorro(Cliente cliente, double monto) {
        super(cliente);
        this.interes = monto;
    }

    @Override
    public void depositarEfectivo(double monto) {
        super.saldo = super.saldo + monto;
    }
    @Override
    public void extraerEfectivo(double monto) {

        if(monto <= super.saldo){
            super.saldo = super.saldo - monto;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void cobrarInteres(){
        super.saldo = super.saldo * this.interes;
    }

}
