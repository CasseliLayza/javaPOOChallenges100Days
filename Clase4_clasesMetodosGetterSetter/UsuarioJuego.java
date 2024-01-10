package Clase4_clasesMetodosGetterSetter;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private double puntaje;
    protected int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 0;

    }
//Metodos
    public void aumentarPuntaje(){
        this.puntaje +=1;
    }

    public void subirNivel(){
        this.nivel +=1;
    }

    public void bonus(int valor){
        this.puntaje +=valor;
    }
//Getter
    public int getNivel() {
        return nivel;
    }
//Setter
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPuntaje() {
        return puntaje;
    }
}
