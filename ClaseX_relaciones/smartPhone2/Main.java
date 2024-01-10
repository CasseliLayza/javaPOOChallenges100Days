package ClaseX_relaciones.smartPhone2;

public class Main {
    public static void main(String[] args) {
        SmartPhone cell = new SmartPhone("Iphone.inc","IPhone 17 ProMAX",new Bateria("Battery IPhone.inic","2020"));
        Chip movistar = new Chip("movistar");
        Chip bitel = new Chip("Bitel");
        movistar.setNumero(999966654);
        bitel.setNumero(988875436);

        cell.setChips(movistar);
        cell.setChips(bitel);

        System.out.println("Marca = " + cell.getMarcaCell());
        System.out.println("Modelo = " +   cell.getModelo());
        System.out.println("EspecsBateriaInterna : " + cell.getEspecsBateriaInterna());
        cell.getEspecsChips();



    }



}
