package pildoras.coche_poo;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int centrimettosCubicosMotor;
    private int pesoPlataforma;
    private String color;
    private int pesototal;
    private boolean asientosCuero, climatizador;


    public Coche(int largo, int ancho, int centrimettosCubicosMotor) {
        this.largo = largo;
        this.ancho = ancho;
        this.centrimettosCubicosMotor = centrimettosCubicosMotor;
        this.ruedas = 4;
        this.pesoPlataforma = 500;
        this.color = null;
        this.pesototal = 0;
        this.asientosCuero = false;
        this.climatizador = false;

    }

    public Coche() {

    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setPesoPlataforma(int pesoPlataforma) {
        this.pesoPlataforma = pesoPlataforma;
    }

    public String dimePropiedades() {
        return "\n\truedas = " + this.ruedas +
                "\n\tlargo = " + this.largo +
                "\n\tancho = " + this.ancho +
                "\n\tcentrimettosCubicosMotor = " + this.centrimettosCubicosMotor +
                "\n\tpesoPlataforma = " + this.pesoPlataforma;
    }

    public int getLargo() {
        return largo;
    }

    public int getPesoPlataforma() {
        return pesoPlataforma;
    }

    public void estableceColor(String color) {
        this.color = color;
    }

    public String dimeColor() {
        return "Este coches es de color: " + this.color;
    }

    public void configuraAsientos(String asientosCuero) {

        if (asientosCuero.equalsIgnoreCase("Si")) {
            this.asientosCuero = true;
        } else {
            this.asientosCuero = false;
        }
    }


    public String dimeAsientosCuero() {
        if (asientosCuero) return "El coche tiene asisentos de cuero";
        return "El coche tiene asisentos de serie";
    }


    public void configuraClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("Si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }


    public String dimeClimitizador() {
        if (this.climatizador) {
            return "El coche tiene climatizador";
        } else {
            return "El coche NO tiene climatizador";

        }
    }


    public String dimePesoCoche() {
        int pesoCarroceria = 500;
        this.pesototal = pesoPlataforma + pesoCarroceria;

        if (asientosCuero == true) {
            pesototal += 50;
        }

        if (climatizador == true) {
            pesototal += 20;
        }

        return "El peso total del coche es: " + pesototal;
    }

    public int precioCoche() {
        int precioFinal = 10000;

        if (asientosCuero == true) {
            precioFinal += 2000;
        }
        if (climatizador == true) {
            precioFinal += 1500;
        }
        return precioFinal;
    }


}

