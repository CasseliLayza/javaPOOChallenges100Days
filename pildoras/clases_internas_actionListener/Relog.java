package pildoras.clases_internas_actionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Relog {
    private int intervalo;
    private boolean sonido;

    public Relog(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha() {

        ActionListener oeyente = new DameLahora();
        Timer miTemporizador = new Timer(intervalo, oeyente);
        miTemporizador.start();
    }

    private class DameLahora implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora = new Date();
            int constanteConvierteASegundos = 1000;
            System.out.println("La hora cada "+ intervalo/ constanteConvierteASegundos +"s "+ ": " + ahora);

            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

}
