package pildoras.clases_internas_actionListener.clases_interna_local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Relog {//la clase contenedora no puede acceder a las variables de la clase interna local
    public void enMarcha(final int intervalo, final boolean sonido) {// las variables de una clase interna local son final

         class DameLahora implements ActionListener { //clase interna local, puede acceder a las variables encapsuladas de la clase que lo contiene
            @Override  // la clase interna local no lleva modficiador de acceso y solo se usa cuando solo se instancia una vez un objeto
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                int constanteConvierteASegundos = 1000;
                System.out.println("La hora cada "+ intervalo/ constanteConvierteASegundos +"s "+ ": " + ahora);

                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener oeyente = new DameLahora();
        Timer miTemporizador = new Timer(intervalo, oeyente);
        miTemporizador.start();
    }

}
