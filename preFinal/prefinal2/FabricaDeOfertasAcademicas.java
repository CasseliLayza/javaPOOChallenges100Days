package preFinal.prefinal2;

import java.util.List;
import java.util.Objects;

public class FabricaDeOfertasAcademicas {

    public static final String CODIGO_CURSO = "curso";
    public static final String CODIGO_PROGRAMA_INTENSIVO = "programa";

    public static OfertaAcademinca crearOferta(String codigoCurso, String curso, String descripcion, int horas, double valorHora, List<Curso> cursos) throws MyException {
        OfertaAcademinca nuevaOferta;
        if (Objects.equals(codigoCurso, CODIGO_CURSO)) {
            nuevaOferta = new Curso(curso, descripcion, horas, valorHora);
        } else if (Objects.equals(codigoCurso, CODIGO_PROGRAMA_INTENSIVO)) {
            nuevaOferta = new Programa(curso, descripcion, horas, valorHora, cursos);
        } else {
            throw new MyException("nuevaOferta null, crea de nuevo la oferta con el campo codigo CURSO/PROGRAMAINTENSIVO");
        }
        return nuevaOferta;
    }
}
