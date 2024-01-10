package pildoras.clases_internas_actionListener;

import javax.swing.*;

public class PruebaTemporizador2 {

    public static void main(String[] args) {

        Relog miRelog = new Relog(5000, true);
        miRelog.enMarcha();
        JOptionPane.showMessageDialog(null, "Aceptar para salir");

        System.exit(0);

    }
}
