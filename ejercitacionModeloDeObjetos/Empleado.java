package ejercitacionModeloDeObjetos;

public class Empleado {
    private String nombreEmpleado;
    private String turno;

    public Empleado(String nombreEmpleado, String turno) {
        this.nombreEmpleado = nombreEmpleado;
        this.turno = turno;
    }

    public boolean registrarVenta(Cliente cliente, Producto producto){
        return cliente.comprarProducto(producto);

    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
}
