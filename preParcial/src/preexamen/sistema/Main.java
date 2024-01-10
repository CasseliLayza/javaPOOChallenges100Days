package preParcial.src.preexamen.sistema;

import preParcial.src.preexamen.embarcaciones.Embarcacion;
import preParcial.src.preexamen.embarcaciones.Velero;
import preParcial.src.preexamen.embarcaciones.Yate;
import preParcial.src.preexamen.marineros.Capitan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Yate yate = new Yate(20000, 5000, 2020, 50, new Capitan("Casseli", "layza", "qwert123"), 50);
        Yate yate1 = new Yate(25000, 6000, 2024, 60, new Capitan("Alex", "Lara", "qwer5679"), 25);

        Velero velero = new Velero(15000, 3000, 2020, 30, new Capitan("Yuri", "Acosta", "qwert899"), 10);
        Velero velero1 = new Velero(18000, 3600, 2021, 35, new Capitan("Muari", "Ancon", "qwer5687"), 14);

        List<Embarcacion> embarcaciones = new ArrayList<>();
        embarcaciones.add(yate);
        embarcaciones.add(yate1);
        embarcaciones.add(velero);
        embarcaciones.add(velero1);

        Sistema sistema = new Sistema(embarcaciones);

        System.out.println("sistema calcularAlquiler(yate) = " + sistema.calcularAlquiler(yate));
        System.out.println("sistema calcularAlquiler(yate1) = " + sistema.calcularAlquiler(yate1));
        System.out.println("sistema obtenerMasLujoso(yate,yate1) el que tiene nro de camarotes = " + sistema.obtenerMasLujoso(yate,yate1).getCantidadCamarotes());
        System.out.println("sistema esGrande(velero) = " + sistema.esGrande(velero1));

    }
}
