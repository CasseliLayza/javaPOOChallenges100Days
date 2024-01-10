package pildoras.tipos_enum;

import java.util.Scanner;

public class UsoTallas {

    //enum Talla {MIN,MEDIANO,GRANDE,MUY_GRANDE}

    enum Talla{

        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
        private String abreviatura;

        private Talla(String abreviatura){
            this.abreviatura= abreviatura;
        }

        public String dameAbreviatura(){
            return abreviatura;
        }
    }

    public static void main(String[] args) {
/*      Talla s = Talla.MIN;
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su talla  MINI(\"S\"),MEDIANO(\"M\"),GRANDE(\"L\"),MUY_GRANDE(\"XL\") =  ");
        String entradaDatos= scanner.nextLine().toUpperCase();

        Talla laTalla = Enum.valueOf(Talla.class,entradaDatos);
        System.out.println("laTalla.dameAbreviatura() = " + laTalla.dameAbreviatura());

        Talla a = Talla.GRANDE;
        System.out.println(a);
        System.out.println(a.dameAbreviatura());

    }

}
