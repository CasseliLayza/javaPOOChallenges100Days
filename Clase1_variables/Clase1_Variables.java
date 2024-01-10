package Clase1_variables;

public class Clase1_Variables {
    public static void main(String[] args) {
        //perro
        Mascota manchitas = new Mascota();
        manchitas.tipoMascota= "perro";
        manchitas.nombre= "Manchitas";
        manchitas.edad= 2;
        manchitas.cuantoCome= 1.5f;
        manchitas.quehace = "Guau Guau";

        System.out.println(manchitas.nombre+ " tiene " +manchitas.edad +" años");
        System.out.print(manchitas.nombre + " come " +manchitas.cuantoCome+ "kg y hace, ");
        manchitas.comoHace();

        //Pez
        Mascota nemo = new Mascota();
        nemo.tipoMascota= "pez";
        nemo.nombre= "Nemo";
        nemo.edad= 1;
        nemo.cuantoCome= 140f;
        nemo.quehace = "grub grub";

        System.out.println(nemo.nombre+ " tiene " +nemo.edad +" años");
        System.out.print(nemo.nombre + " come " +nemo.cuantoCome+ "gr. y hace, ");
        nemo.comoHace();

        //Gato
        Mascota silvestre = new Mascota();
        silvestre.tipoMascota= "gato";
        silvestre.nombre= "Silvestre";
        silvestre.edad= 3;
        silvestre.cuantoCome= 500f;
        silvestre.quehace = "grub grub";

        System.out.println(silvestre.nombre+ " tiene " +silvestre.edad +" años");
        System.out.print(silvestre.nombre + " come " +silvestre.cuantoCome+ "gr. y hace, ");
        silvestre.comoHace();

        //Tortuga
        Mascota manuelita = new Mascota();
        manuelita.tipoMascota= "tortuga";
        manuelita.nombre= "Manuelita";
        manuelita.edad= 12;
        manuelita.cuantoCome= 300f;
        manuelita.quehace = "vive con Silvia en Uruguay";

        System.out.println(manuelita.nombre+ " tiene " +manuelita.edad +" años");
        System.out.print(manuelita.nombre + " come " +manuelita.cuantoCome+ "gr. y que hace, ");
        manuelita.comoHace();

        //Paloma
        Mascota gardel = new Mascota();
        gardel.tipoMascota= "paloma";
        gardel.nombre= "Gardel";
        gardel.edad= 1;
        gardel.cuantoCome= 350f;
        gardel.quehace = "le canta a Silvia las mañanitas";

        System.out.println(gardel.nombre+ " tiene " +gardel.edad +" años");
        System.out.print(gardel.nombre + " come " +gardel.cuantoCome+ "gr. y que hace, ");
        gardel.comoHace();


    }
}

class Mascota {
    String tipoMascota;
    String nombre;
    int edad;
    float cuantoCome;
    String quehace;

    void comoHace(){
        System.out.println(quehace+"\n");
    }
}
