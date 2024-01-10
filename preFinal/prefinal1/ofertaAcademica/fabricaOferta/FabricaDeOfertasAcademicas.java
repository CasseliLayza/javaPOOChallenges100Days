package preFinal.prefinal1.ofertaAcademica.fabricaOferta;

import preFinal.prefinal1.ofertaAcademica.Curso;
import preFinal.prefinal1.ofertaAcademica.OfertaAcademica;
import preFinal.prefinal1.ofertaAcademica.Programaintesivo;

import java.util.List;

public class FabricaDeOfertasAcademicas {
    public static String CODIGO_CURSO = "curso";
    public static String CODIGO_PROGRAMA_INTENSIVO = "programa";

    public static OfertaAcademica crearOferta(String codigoOferta, String nombre, String descripcion, int horas, double valorhora, List<Curso> cursos) throws MyExceptionFailNewOffer {

        OfertaAcademica nuevaOfertaAcademica;
        if (codigoOferta == FabricaDeOfertasAcademicas.CODIGO_CURSO) {
            nuevaOfertaAcademica = new Curso(nombre, descripcion, horas, valorhora);

        } else if (codigoOferta == FabricaDeOfertasAcademicas.CODIGO_PROGRAMA_INTENSIVO) {
            nuevaOfertaAcademica = new Programaintesivo(nombre, descripcion, horas, valorhora, cursos);

        } else {
            throw new MyExceptionFailNewOffer("No se puedo crear la oferta solicitada");
        }
        return nuevaOfertaAcademica;
    }

}
