package ClaseX_relaciones.smartPhone1;

public class Bateria {
    private String marca;
    private int capacidad_mAh;

    public Bateria(String marca) {
        this.marca = marca;
        this.capacidad_mAh = 0;
    }

    //gettes
    public String getMarca(){
        return this.marca;
    }

    public int getCapacidad_mAh(){
        return this.capacidad_mAh;
    }

    //Settes
    public void setMarca(String marcaBateria){
        this.marca = marcaBateria;
    }

    public void setCapacidad_mAh(int numero_mAh){
    this.capacidad_mAh = numero_mAh;
    }

/*    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad_mAh() {
        return capacidad_mAh;
    }

    public void setCapacidad_mAh(int capacidad_mAh) {
        this.capacidad_mAh = capacidad_mAh;
    }*/
}
