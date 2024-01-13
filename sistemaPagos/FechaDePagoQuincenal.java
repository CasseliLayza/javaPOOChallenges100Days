package sistemaPagos;

import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaDePagoQuincenal {

    public static void main(String[] args) {
        //Datos de Prueba
        //String fechaIngresada = "2024-03-28";  // return 2024-04-01
        //String fechaIngresada = "2024-06-28";  // return 2024-07-01
        //String fechaIngresada = "2024-08-27";  // return 2024-08-29
        //String fechaIngresada = "2024-11-25";  // return 2024-11-29
        //String fechaIngresada = "2024-11-10";  // return 2024-11-15
        String fechaIngresada = "2024-12-10";  // return 2024-12-16

        // Obtiene la fecha ingresada por el usuario en el formato yyyy-mm-dd
        //String fechaIngresada = JOptionPane.showInputDialog("Introduce una Fecha en formato yyyy-MM-dd por ejemplo: 2024-03-28 ");


        // Convierte la cadena de fecha a un objeto LocalDate
        LocalDate fecha = LocalDate.parse(fechaIngresada);
        System.out.println("fecha ingresada = " + fecha);

        // Calcula la fecha de pago de la quincena
        LocalDate fechaDePago = ValidacionFecha.calcularFechaDePagoQuincenal(fecha);

        // Muestra la fecha de pago resultante
        System.out.println("!!!**-- Fecha pago resultante --**!!! => " + fechaDePago.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        //**********************************************************************




    }


}
