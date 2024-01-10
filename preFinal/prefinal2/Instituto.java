package preFinal.prefinal2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademinca> ofertaAcademincas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertaAcademincas = new ArrayList<>();
    }

    public void agregarOfertaAcademica(String codigoCurso, String curso, String descripcion, int horas, double valorHora, List<Curso> cursos) {

        try {
            OfertaAcademinca nuevaOferta = FabricaDeOfertasAcademicas.crearOferta(codigoCurso, curso, descripcion, horas, valorHora, cursos);
            ofertaAcademincas.add(nuevaOferta);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public void reporte() {
        System.out.println("------------Informe ofertas Academicas------------");
        mostrarinforme();
        System.out.println("-----------" + nombre + "-----------");
    }

    private void mostrarinforme() {
        Collections.sort(ofertaAcademincas);
        for (OfertaAcademinca oferta : ofertaAcademincas) {
            ofertasShow(oferta);
            if (oferta instanceof Programa) {
                Programa programa = (Programa) oferta;
                for (Curso curso : programa.getCursosPrograma()) {
                    ofertaDetailCursos(curso);
                }
            }
        }
    }

    private void ofertaDetailCursos(Curso curso) {
        System.out.println("\t" + curso.getNombre() + "\tprecio: " + curso.calcularPrecio());
    }

    private void ofertasShow(OfertaAcademinca oferta) {
        System.out.println(oferta.getNombre() + "\tprecio: " + oferta.calcularPrecio());
    }
}
