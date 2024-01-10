package preFinal.prefinal2;

import java.util.ArrayList;
import java.util.List;

public class Programa extends OfertaAcademinca {
    private int horas;
    private double precioHora;
    private List<Curso> cursos;

    public Programa(String nombre, String descripcion, int horas, double precioHora, List<Curso> cursos) {
        super(nombre, descripcion);
        this.horas = horas;
        this.precioHora = precioHora;
        this.cursos = cursos;
    }


    @Override
    public double calcularPrecio() {
        double precioPrograma = horas * precioHora;
        return precioPrograma + precioCursos();
    }

    private double precioCursos() {
        double preciototalCursos = 0.0;

        for (Curso curso : cursos) {
            preciototalCursos += curso.calcularPrecio();
        }
        return preciototalCursos;
    }

    public List<Curso> getCursosPrograma(){
        return cursos;
    }

}
