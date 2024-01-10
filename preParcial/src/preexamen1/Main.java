package preParcial.src.preexamen1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Yate yate = new Yate(new Capitan("Casseli","layza","12345qwe"),70000,20000,2020,70,20);
        Yate yate1 = new Yate(new Capitan("Segundo","Lara","09877qwe"),50000,10000,2021,60,10);

        Velero velero = new Velero(new Capitan("Alex","Lopez","5678asdfg"),30000,10000,2020,30,15);
        Velero velero1 = new Velero(new Capitan("Yury","Mendez","4567a0jdg"),20000,8000,2021,25,10);

        List<Embarcacion> listaEmbarcaciones = new ArrayList<>();
        listaEmbarcaciones.add(yate);
        listaEmbarcaciones.add(yate1);
        listaEmbarcaciones.add(velero);
        listaEmbarcaciones.add(velero1);

        Sistema sistema = new Sistema(listaEmbarcaciones);

        System.out.println("calcularAlquiler(yate1) = " + sistema.calcularAlquiler(yate1));
        System.out.println("esGrande(velero) = " + sistema.esGrande(velero));
        System.out.println("obtenerMasLujoso(yate,yate1).getCantidadCamarotes() = " + sistema.obtenerMasLujoso(yate,yate1).getCantidadCamarotes());
        System.out.println("calcularAlquiler(velero1) = " + sistema.calcularAlquiler(velero1));

    }
}
