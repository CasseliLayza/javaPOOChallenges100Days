package Clase4_clasesMetodosGetterSetter;

public class Clase4_ClasesMetodosGetterSetter {
    public static void main(String[] args) {
        UsuarioJuego usuarioA = new UsuarioJuego("Casseli", "1234");
        //TestNivel
        usuarioA.setNivel(1);
        System.out.println("Nivel seteado en: " + usuarioA.getNivel());
        usuarioA.subirNivel();
        System.out.println("Nivel incrementado : " + usuarioA.getNivel());
        //Test Puntaje
        usuarioA.aumentarPuntaje();
        System.out.println("Puntaje incrementado : " + usuarioA.getPuntaje());
        //Test Bonus
        usuarioA.bonus(7);
        System.out.println("Puntaje incrementado : " + usuarioA.getPuntaje());


    }
}
