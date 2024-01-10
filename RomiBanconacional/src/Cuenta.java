package RomiBanconacional.src;

public abstract class  Cuenta {
    protected Double saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public abstract void depositarEfectivo (double monto);
    public abstract void extraerEfectivo(double monto);

}
