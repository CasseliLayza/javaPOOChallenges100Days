package pildoras.temporizador_interface_actionListener;

import javax.swing.*;

public class PruebaTemporizador {
    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();

       // ActionListener oyente = new DameLaHora(); // tbn se puede conforma un oyente instanciando la interface con la clase q lo implemente--DameLaHora es ActionLisetnerable

        Timer miTemporizador = new Timer(5000,oyente);
        miTemporizador.start();

        JOptionPane.showMessageDialog(null,"pulsa aceptar para detener");

        System.exit(0);


    }
}
