package ClaseX_relaciones.smartPhone3;

import java.util.Date;

public class Bateria {
    private String marcaBateria;
    private int capaciadaMAH;
    private Date fechaFabricacion;

    public Bateria(String marcaBateria, Date fechaFabricacion, int capaciadaMAH ) {
        this.marcaBateria = marcaBateria;
        this.fechaFabricacion = fechaFabricacion;
        this.capaciadaMAH= capaciadaMAH;
    }

    public void setCapaciadaMAH(int capaciadaMAH) {
        this.capaciadaMAH = capaciadaMAH;
    }

    public String getCaracteristicas(){
        return  "\n\tMarca: "+this.marcaBateria+
                "\n\tCapacidad mAh: "+ this.capaciadaMAH+
                "\n\tFehca de fabr: "+this.fechaFabricacion;

    }
}
