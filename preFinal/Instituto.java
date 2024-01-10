package preFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertaAcademicas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertaAcademicas = new ArrayList<>();
    }

    public void agregarOfertaAcademica(String codigo, String nombre, String decripcion, int cantidadhoras, double valorhora, List<Curso> cursos) {

        try {
            OfertaAcademica nuevaOferta = FabricaDeOfertasAcademicas.crear(codigo, nombre, decripcion, cantidadhoras, valorhora, cursos);
            this.ofertaAcademicas.add(nuevaOferta);
        } catch (MyExceptionCrearCursoError e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    public void informe() {

        Collections.sort(this.ofertaAcademicas);
        System.out.println("-------Informe-----");
        mostrarIforme();
        System.out.println("----" + this.nombre + "----");
    }

    public void mostrarIforme() {
        for (OfertaAcademica ofertaAcademica : this.ofertaAcademicas) {
            if (ofertaAcademica instanceof Curso) {
                mostrarCurso(ofertaAcademica);

            } else {
                ProgramaIntensivo programaIntensivo = (ProgramaIntensivo) ofertaAcademica;
                mostrarPaqueteDetail(programaIntensivo);
                for (Curso curso : programaIntensivo.getCursos()) {
                    mostrarCurso(curso);

                }
                System.out.println("} ");
            }
        }
    }

    public void mostrarPaqueteDetail(ProgramaIntensivo programaIntensivo) {
        System.out.println("programaIntensivo = " + programaIntensivo.getNombre() + ", PecioPrograma = " + programaIntensivo.calcularPrecio() + " {");
    }

    private void mostrarCurso(OfertaAcademica ofertaAcademica) {
        System.out.println("Curso getNombre() = " + ofertaAcademica.getNombre());
        System.out.println("\tcalcularPrecio() = " + ofertaAcademica.calcularPrecio());
    }
}
