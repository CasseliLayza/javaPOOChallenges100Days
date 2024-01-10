package RomiBanconacional.src;

public class Cliente {

    private String numeroDeCliente;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(String numeroDeCliente, String apellido, String dni, String cuit) {
        this.numeroDeCliente = numeroDeCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
}
