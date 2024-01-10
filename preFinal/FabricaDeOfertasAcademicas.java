package preFinal;

import java.util.List;

public class FabricaDeOfertasAcademicas {
    public static String CODIGO_CURSO = "curso";
    public static String CODIGO_PROGRAMA_INTENSIVO = "programa";

    public static OfertaAcademica crear(String codigo, String nombre, String decripcion, int cantidadhoras, double valorhora, List<Curso> cursos) throws MyExceptionCrearCursoError {
        OfertaAcademica nuevaOfertaAcademica;
        if (codigo.equals(FabricaDeOfertasAcademicas.CODIGO_CURSO)) {
            nuevaOfertaAcademica = new Curso(nombre, decripcion, cantidadhoras, valorhora);

        } else if (codigo.equals(FabricaDeOfertasAcademicas.CODIGO_PROGRAMA_INTENSIVO)) {
            nuevaOfertaAcademica = new ProgramaIntensivo(nombre, decripcion, cantidadhoras, valorhora, cursos);

        } else {
            throw new MyExceptionCrearCursoError("Error de creacicion oferta nula");
        }
        return nuevaOfertaAcademica;
    }

}
