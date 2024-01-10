package pildoras.coche_poo;

public class Main {
    public static void main(String[] args) {
        Coche renoult = new Coche(2000,400,250);
        renoult.setRuedas(4);
        renoult.setPesoPlataforma(2000);

        System.out.println("renoult.dimePropiedades() = " + renoult.dimePropiedades());

        System.out.println("renoult.getLargo() = " + renoult.getLargo());
        System.out.println("renoult.getPeso() = " + renoult.getPesoPlataforma());

        //renoult.estableceColor(JOptionPane.showInputDialog("Introduce color"));
        System.out.println("renoult.dimeColor() = " + renoult.dimeColor());

        //renoult.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero"));
        renoult.configuraAsientos("Si");

        System.out.println("renoult.dimeAsientosCuero() = " + renoult.dimeAsientosCuero());

        System.out.println("renoult.dimePesoCoche() = " + renoult.dimePesoCoche());
        
        //renoult.configuraClimatizador(JOptionPane.showInputDialog("Tiene Climatizador"));
        System.out.println("renoult.dimeClimitizador() = " + renoult.dimeClimitizador());
        System.out.println("renoult.dimePesoCoche() = " + renoult.dimePesoCoche());
        System.out.println("renoult.precioCoche() = " + renoult.precioCoche());
        

        Coche micche1 = new Coche(2000,4500,400);
        micche1.estableceColor("rosa");

        Furgoneta miFurgoneta1= new Furgoneta(200000,7000,600,10,14);
        miFurgoneta1.estableceColor("Axul");
        miFurgoneta1.configuraAsientos("Si");
        miFurgoneta1.configuraClimatizador("Si");
        miFurgoneta1.precioCoche();

        System.out.println("miFurgoneta1.dimeDatosFurgoneta() = " + miFurgoneta1.dimeDatosFurgoneta());
        System.out.println("micche1 = " + micche1.dimePropiedades());
        System.out.println("miFurgoneta1.dimePropiedades() = " + miFurgoneta1.dimePropiedades());

        
    }
    

}
