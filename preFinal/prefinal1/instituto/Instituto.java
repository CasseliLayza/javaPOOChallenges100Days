package preFinal.prefinal1.instituto;

import preFinal.prefinal1.ofertaAcademica.*;
import preFinal.prefinal1.ofertaAcademica.fabricaOferta.FabricaDeOfertasAcademicas;
import preFinal.prefinal1.ofertaAcademica.fabricaOferta.MyExceptionFailNewOffer;

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

    public void agregarOfertaAcademica(String codigoOferta, String nombre, String descripcion, int horas, double valorhora, List<Curso> cursos) {

        try {
            OfertaAcademica nuevaOferta = FabricaDeOfertasAcademicas.crearOferta(codigoOferta,nombre, descripcion, horas, valorhora, cursos);
            ofertaAcademicas.add(nuevaOferta);

        } catch (MyExceptionFailNewOffer e) {
            System.out.println(e.getMessage());
        }

    }

    public void reporte() {
        System.out.println("------" + nombre + "-----");
        muestraReporteOfertas();
        System.out.println("------Digital House----");
    }

    public void muestraReporteOfertas() {
        Collections.sort(ofertaAcademicas);
        for (OfertaAcademica ofertas: ofertaAcademicas) {
            if(ofertas instanceof Curso){
                muestrasCurso(ofertas);
            } else {
                Programaintesivo programaintesivo = (Programaintesivo) ofertas;
                muestraPrograma(programaintesivo);
                for (Curso cursos: programaintesivo.getCursos()) {
                    muestrasCurso(cursos);
                }
            }
        }
    }

    public void muestraPrograma(Programaintesivo programaintesivo) {
        System.out.println("programa = " + programaintesivo.getNombre());
        System.out.println("PrecioPrograma = " + programaintesivo.culcularPrecio());
    }

    public void muestrasCurso(OfertaAcademica ofertas) {
        System.out.println("Curso = " + ofertas.getNombre());
        System.out.println("PrecioCurso = " + ofertas.culcularPrecio());
    }
}
