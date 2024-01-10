package ClaseX_colecciones;

import java.lang.reflect.Array;
import java.util.*;

public class Puerto {
    private List<Contenedor> contenedores;

    public Puerto(List<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    public Puerto() {
        this.contenedores = new ArrayList<>();
    }

    public void ingresarContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    public void mostrarContenedoresOrdenadosById() {

        Collections.sort(contenedores);

        for (Contenedor contenedor : contenedores) {
            System.out.println("contenedores Ordendos By Id = " + contenedor.getName());
        }

    }

    public int calcPeligrososYDesconocidos() {
        int contenedorResoult = 0;
        for (Contenedor contenedor : contenedores
        ) {
            if (contenedor.esPeligroso() && contenedor.esDesconocido()) {
                contenedorResoult++;
            }
        }
        return contenedorResoult;
    }

}
