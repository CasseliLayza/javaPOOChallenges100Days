package ClaseX_colecciones;

import java.util.Objects;

public class Contenedor implements Comparable<Contenedor> {
    private int id;
    private String pais;
    private boolean peligroso;

    public Contenedor(int numero, String pais, boolean peligroso) {
        this.id = numero;
        this.pais = pais;
        this.peligroso = peligroso;
    }


    public boolean esPeligroso() {
        return peligroso;
    }

    public boolean esDesconocido() {
        return Objects.equals(pais, "Desconocido");
    }


    public String getName() {
        return this.pais;
    }


    @Override
    public int compareTo(Contenedor otroContenedor) {
        return Integer.compare(this.id, otroContenedor.id);
    }


}
