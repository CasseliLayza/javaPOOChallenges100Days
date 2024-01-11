package preParcialD.src;

import preParcialD.src.embarcaciones.Embarcacion;
import preParcialD.src.embarcaciones.Velero;
import preParcialD.src.embarcaciones.Yate;
import preParcialD.src.marineros.Capitan;
import preParcialD.src.sistema.Sistema;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Velero velero = new Velero(50000,10000,2021,50,new Capitan("Harry","lara","1223qwwe"),10);
        Velero velero1 = new Velero(40000,20000,2020,70,new Capitan("Gerar","lapa","1223asdfg"),20);

        Yate yate = new Yate(70000,30000,2022,90,new Capitan("Pepe","Riva","po899"),20);
        Yate yate1 = new Yate(70000,30000,2022,90,new Capitan("Pepe","Riva","po899"),50);

        List<Embarcacion> listaObjetosEmbaracaciones = new ArrayList<>();
        listaObjetosEmbaracaciones.add(velero);
        listaObjetosEmbaracaciones.add(velero1);
        listaObjetosEmbaracaciones.add(yate);
        Sistema sistema = new Sistema(listaObjetosEmbaracaciones);

        System.out.println("alquiler(velero) = " + sistema.calcularAlquiler(velero));
        System.out.println("esGrande(velero) = " + sistema.esGrande(velero));
        System.out.println("masLujoso(yate,yate1) = " + sistema.obtenerMasLujoso(yate,yate1).getCantidadCamarotes());
        System.out.println("calcularAlquiler(yate1) = " + sistema.calcularAlquiler(yate1));
    }
}