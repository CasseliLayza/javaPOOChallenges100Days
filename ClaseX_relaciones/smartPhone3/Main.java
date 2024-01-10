package ClaseX_relaciones.smartPhone3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SmartPhone cell = new SmartPhone("Iphone.inc CHINO","Iphone 17 proMax",new Bateria("Iphone battery.inc",new Date(120,11,5),6000));


        SIM claro = new SIM("claro");
        claro.setNumeroSerie("SNqdfghjkl2345");
        claro.setNumeroAbonado("98542757");

        SIM movistar = new SIM("movistar");
        movistar.setNumeroSerie("SNswqtylqlj456");
        movistar.setNumeroAbonado("9754362876");

        SmartPhone cellSoloSIMs = new SmartPhone(new SIM[]{claro, movistar});

        cell.setSIMs(claro);
        cell.setSIMs(movistar);
        cell.setusuario("EL QUE PAGA XD ");
        System.out.println("Usuario = " + cell.getUsuario());
        System.out.println("MarcaSmartPhone = " + cell.getMarcaSmartPhone());
        System.out.println("Modelo = " + cell.getModelo());
        System.out.println("NumeroDeChips = " + cell.getNumeroDeChips());
        System.out.println("SpecsBateria = " + cell.getSpecsBateria());
        System.out.println("SpecsSIMs = " + cell.getSpecsSIMs());




    }
}
