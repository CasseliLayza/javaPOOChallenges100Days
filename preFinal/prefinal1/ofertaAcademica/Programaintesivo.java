package preFinal.prefinal1.ofertaAcademica;

import java.util.List;

public class Programaintesivo extends OfertaAcademica {
    private int horas;
    private double valorHora;
    private List<Curso> cursos;

    public Programaintesivo(String nombre, String descripcion, int horas, double valorHora, List<Curso> cursos) {
        super(nombre, descripcion);
        this.horas=horas;
        this.valorHora= valorHora;
        this.cursos= cursos;
    }

    @Override
    public double culcularPrecio() {
        double precioBasePrograma= valorHora*horas;
        return precioBasePrograma+precioCursos();
    }

    public double precioCursos() {
        double precioCursos=0;
        for (Curso curso:cursos) {
             precioCursos += curso.culcularPrecio();
        }
        return precioCursos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
