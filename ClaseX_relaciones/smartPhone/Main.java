package ClaseX_relaciones.smartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone cell = new SmartPhone("Iphone 17 ProMax", 5000, "Iphone.inc");

        Chip entel = new Chip("Entel", 99997777);
        Chip claro = new Chip("Claro", 99998888);

        cell.agregarChip(entel);
        cell.agregarChip(claro);

        cell.mostrar();
    }
}
