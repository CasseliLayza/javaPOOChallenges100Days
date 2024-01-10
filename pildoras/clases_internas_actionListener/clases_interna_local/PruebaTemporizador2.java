package pildoras.clases_internas_actionListener.clases_interna_local;

import javax.swing.*;

public class PruebaTemporizador2 {

        public static void main(String[] args) {

            Relog miRelog = new Relog();
            miRelog.enMarcha(7000,true);
            JOptionPane.showMessageDialog(null, "Aceptar para salir");

            System.exit(0);

        }


}
