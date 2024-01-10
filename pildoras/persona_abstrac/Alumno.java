package pildoras.persona_abstrac;

public class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public String dameDescripcion() {
        return "este alumno estudia la carrera de: "+this.carrera +" y se llama: "+super.dameNombre();
    }
}
