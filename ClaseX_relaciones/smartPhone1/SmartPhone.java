package ClaseX_relaciones.smartPhone1;

public class SmartPhone {
    private String marcaSmartPhone;
    private Bateria bateria;
    private int numerosChips;
    private Chip[] chips;

    public SmartPhone(String marcaSmartPhone, String marcaBateria, int capacidad_mAh) {
        this.marcaSmartPhone = marcaSmartPhone;
        this.bateria = new Bateria(marcaBateria); // composicion - Bateria interna compone al SmartPhone, si muere el SmartPhone desapacere la Bateria.
        this.bateria.setCapacidad_mAh(capacidad_mAh);
        this.numerosChips = 0;
        this.chips = new Chip[2]; // Agregacion los chips se agregan al SmartPhone, puede existir un telefono con ranuras de sim vacias.

    }

    public void mostrar() {
        System.out.println("marcaSmartPhone = " + this.marcaSmartPhone);
        System.out.println("Marca Bateria = " + this.bateria.getMarca());
        System.out.println("Capacidad Bateria en mAh = " + this.bateria.getCapacidad_mAh());
        System.out.println("numeroChips = " + this.numerosChips);
        for (int i = 0; i < chips.length; i++) {
            System.out.println("Datos de chip " + i);
            System.out.println("\tOperador = "+this.chips[i].getOperador());
            System.out.println("\tNumero = "+this.chips[i].getNumero());
        }
    }

    public void setChips(Chip nuevochip) {
        if (this.numerosChips < 2) {
            chips[this.numerosChips] = nuevochip;
            this.numerosChips++;
        }

    }

}
