package preFinal;

import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {

    private int cantidadHoras;
    private double valorHora;
    private List<Curso> cursos;

    public ProgramaIntensivo(String nombre, String descripcion, int cantidadHoras, double valorHora, List<Curso> cursos) {
        super(nombre, descripcion);
        this.cantidadHoras = cantidadHoras;
        this.valorHora = valorHora;
        this.cursos = cursos;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);

    }

    @Override
    public double calcularPrecio() {
        double valorBasePrograma = cantidadHoras * valorHora;
        return valorBasePrograma + calcularPreciototalDeCursos();
    }

    public double calcularPreciototalDeCursos() {
        double precioCursos = 0;
        for (Curso curso : cursos) {
            precioCursos += curso.calcularPrecio();
        }
        return precioCursos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
