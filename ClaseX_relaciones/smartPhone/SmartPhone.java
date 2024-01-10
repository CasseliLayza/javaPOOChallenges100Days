package ClaseX_relaciones.smartPhone;

import ClaseX_relaciones.smartPhone.Bateria;
import ClaseX_relaciones.smartPhone.Chip;

public class SmartPhone {
    private String modelo;
    private Bateria bateria; // composicion rombo negro
    private int nroChips;
    private Chip[] chips; // agregacion rombo blanco

    public SmartPhone(String modelo, int cantmAh, String marcaBateria){
        this.modelo = modelo;
        this.bateria = new Bateria(cantmAh,marcaBateria);
        this.nroChips = 0;
        this.chips = new Chip[2];
    }

    public void mostrar(){
        System.out.println("modelo = " + this.modelo);
        bateria.mostrar();
        System.out.println("nroChips = " + this.nroChips);
        for (int i = 0; i < chips.length; i++) {
            chips[i].mostrar();
        }
    }

    public void agregarChip(Chip nuevoChip){
        if (this.nroChips<2){
            chips[nroChips] = nuevoChip;
            nroChips++;
        }
    }

}
