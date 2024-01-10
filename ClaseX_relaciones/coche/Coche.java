package ClaseX_relaciones.coche;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoplataforma;

    // Carateristicas que ueden variar dependiendo del carro
    private String color;
    private int pesoTotal;
    private boolean assientosCuero, climatizador;


    public Coche() {
        this.ruedas = 4;
        this.largo = 2000;
        this.ancho = 300;
        this.motor = 1600;
        this.pesoplataforma = 500;
    }

    public String dimeDatosGenerales() { //gettes
        return "\n\tEL veihiculo tiene: " + ruedas + " ruedas" +
                "\n\tEl largo del vehiculo: " + largo / 1000 + " metros" +
                "\n\tEl ancho del vehiculo: " + ancho + " cm" +
                "\n\tEl peso de la plataforma: " + pesoTotal + " kg";

    }

    public void estableceColor(String colorCoche) { //setter
        this.color = colorCoche;
    }

    public String dimeColor() { // getter
        return "El color del coche es: " + this.color;
    }

    public void configuraAsientos(String asientosCuero) { // Setter
        if (asientosCuero == "SI") {
            this.assientosCuero = true;
        } else {
            this.assientosCuero = false;
        }
    }

    public String dimeAsientosCuero() {
        if (assientosCuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }
}
