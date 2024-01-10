package Clase8_bancoNacional;

public class Cliente {
    private String numeroDeCliente;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(String numeroDeCliente, String apellido, String dni) {
        this.numeroDeCliente = numeroDeCliente;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void getDtsCliente() {
        System.out.println(this.numeroDeCliente);
        System.out.println(this.apellido);
        System.out.println(this.dni);
        System.out.println(this.cuit);
    }
}
