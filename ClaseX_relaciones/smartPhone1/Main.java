package ClaseX_relaciones.smartPhone1;

public class Main {
    public static void main(String[] args) {

        SmartPhone cell = new SmartPhone("Iphone.inc", "Iphone.bat.inc", 7000);

        Chip claro = new Chip("Claro");
        claro.setNumero(999997777);

        Chip movistar = new Chip("Movistar");
        movistar.setNumero(888881111);

        cell.setChips(claro);
        cell.setChips(movistar);

        cell.mostrar();

    }
}
