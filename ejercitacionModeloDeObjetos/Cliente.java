package ejercitacionModeloDeObjetos;

public class Cliente {
    private String nombreCliente;
    private double presupuesto;

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.presupuesto = 0.0;
    }

    public boolean comprarProducto(Producto producto) {
        if (producto.getPrecio() <= presupuesto) {
            this.presupuesto -= producto.getPrecio();
            return true;
        }else
            return false;
    }

    public void setPresupuesto(double credito){
        this.presupuesto+= credito;
    }

    public double saldoDisponible(){
        return presupuesto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
}
