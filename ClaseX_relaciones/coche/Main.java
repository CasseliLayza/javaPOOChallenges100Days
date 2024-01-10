package ClaseX_relaciones.coche;

public class Main {
    public static void main(String[] args) {
        Coche renoult = new Coche();
           renoult.estableceColor("Verde");
        System.out.println(renoult.dimeColor());
        System.out.println(renoult.dimeDatosGenerales());

            renoult.configuraAsientos("no");
        System.out.println( renoult.dimeAsientosCuero());;




    }
}
