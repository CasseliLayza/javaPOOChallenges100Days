package preFinal.prefinal1;

import preFinal.prefinal1.instituto.Instituto;
import preFinal.prefinal1.ofertaAcademica.Curso;
import preFinal.prefinal1.ofertaAcademica.fabricaOferta.FabricaDeOfertasAcademicas;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Instituto instituto = new Instituto("Digial House");

        //Curso java = new Curso("Java", "Introducción a OOP", 15, 3.5);
        Curso java = new Curso("Java", "Introducción a OOP", 15, 2.5);
        Curso react = new Curso("React", "Introducción al desarrollo web", 20, 2.5);

        instituto.agregarOfertaAcademica(FabricaDeOfertasAcademicas.CODIGO_CURSO, "React", "Introducción al desarrollo web", 20, 2.5, List.of());
        instituto.agregarOfertaAcademica(FabricaDeOfertasAcademicas.CODIGO_CURSO, "Java", "Introducción a OOP", 15, 2.5, List.of());

        instituto.agregarOfertaAcademica("", "Kotlin", "Introducción a OOP y Funcional", 20, 2.5, List.of());

        instituto.agregarOfertaAcademica(FabricaDeOfertasAcademicas.CODIGO_PROGRAMA_INTENSIVO, "Fullstack", "Programa Fullstack", 50, 2.5, List.of(java, react));

        instituto.reporte();
    }
}
