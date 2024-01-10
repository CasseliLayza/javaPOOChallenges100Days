package ClaseX_colecciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contenedor contenor = new Contenedor(1, "China", true);
        Contenedor contenor1 = new Contenedor(0, "EEUU", true);
        Contenedor contenor2 = new Contenedor(3, "Brasil", true);
        Contenedor contenor3 = new Contenedor(5, "Desconocido", true);
        Contenedor contenor4 = new Contenedor(2, "Canada", true);
        Contenedor contenor5 = new Contenedor(6, "Desconocido", true);


        List<Contenedor> listaContenedores = new ArrayList<>();
        listaContenedores.add(contenor);
        listaContenedores.add(contenor1);
        listaContenedores.add(contenor2);
        Puerto puerto = new Puerto(listaContenedores);
        puerto.ingresarContenedor(contenor3);
        puerto.ingresarContenedor(contenor4);
        puerto.ingresarContenedor(contenor5);

        System.out.println("calcPeligrososYDesconocidos = " + puerto.calcPeligrososYDesconocidos());
        puerto.mostrarContenedoresOrdenadosById();

    }


}
