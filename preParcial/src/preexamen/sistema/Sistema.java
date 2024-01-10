package preParcial.src.preexamen.sistema;

import preParcial.src.preexamen.embarcaciones.Embarcacion;
import preParcial.src.preexamen.embarcaciones.Velero;
import preParcial.src.preexamen.embarcaciones.Yate;

import java.util.List;

public class Sistema {
    private List<Embarcacion> embarcaciones;

    public Sistema(List<Embarcacion> embarcaciones) {
        this.embarcaciones = embarcaciones;
    }

    public double calcularAlquiler(Embarcacion embarcacion){
        return embarcacion.calcularAlquiler();
    }

    public Yate obtenerMasLujoso(Yate unYate, Yate otroYate){
/*        if (unYate.getCantidadCamarotes() == otroYate.getCantidadCamarotes()) {
            return null;
        }
        return unYate.esMasLujosoQue(otroYate)? unYate: otroYate;*/

        if (unYate.esMasLujosoQue(otroYate)) {
            return unYate;
        } else if (otroYate.esMasLujosoQue(unYate)) {
            return otroYate;
        }else {
            return null;
        }

    }

    public boolean esGrande(Velero velero){
        return velero.esGrande();
    }
}
