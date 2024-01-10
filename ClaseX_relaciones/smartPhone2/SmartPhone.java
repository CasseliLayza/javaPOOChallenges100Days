package ClaseX_relaciones.smartPhone2;

public class SmartPhone {
    private String marcaCell;
    private String modelo;
    private Bateria bateriaInterna;
    private int numerosDeSIMs;
    private Chip[] chips;

    public SmartPhone(String marcaCell, String modelo, Bateria bateriaInterna) {
        this.marcaCell = marcaCell;
        this.modelo = modelo;
        this.bateriaInterna = bateriaInterna;
        this.numerosDeSIMs = 0;
        this.chips = new Chip[2];
    }

    public String getMarcaCell() {
        return marcaCell;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEspecsBateriaInterna() {
       return "\n\tMarca de bateria: "+ bateriaInterna.getMarca()+
               "\n\tCapacidad en mAh: "+ bateriaInterna.getCapacidad_mAh()+
               "\n\tAño de fabricacion: "+ bateriaInterna.getAnoFabricacion();
    }

    public void getEspecsChips() {
        for (int i = 0; i < chips.length; i++) {
            System.out.println("Chip "+i+" :");
            System.out.println("\tEmpresa = " + chips[i].getEmpresa());
            System.out.println("\tNumero = " + chips[i].getNumero());
        }
    }

    public void setChips(Chip nuevoChip){
        if(numerosDeSIMs<2){
            chips[numerosDeSIMs]=nuevoChip;
            numerosDeSIMs++;
        }
    }
}
