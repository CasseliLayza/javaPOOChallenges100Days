package ClaseX_relaciones.smartPhone2;

public class Bateria {
    private String marca;
    private int capacidad_mAh;
    private String anoFabricacion;

    public Bateria(String marca, String anoFabricacion) {
        this.marca = marca;
        this.anoFabricacion = anoFabricacion;
        this.capacidad_mAh = 0;
    }

    public void setAnoFabricacion(String anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidad_mAh() {
        return capacidad_mAh;
    }

    public String getAnoFabricacion() {
        return anoFabricacion;
    }

}
