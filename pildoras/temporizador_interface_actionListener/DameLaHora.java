package pildoras.temporizador_interface_actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLaHora implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("te pongo la hora cada 5s : " +ahora);
    }
}
