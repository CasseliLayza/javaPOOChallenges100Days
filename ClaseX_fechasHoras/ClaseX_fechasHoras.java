package ClaseX_fechasHoras;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClaseX_fechasHoras {


    public static Calendar calendar = new GregorianCalendar();

    public static void main(String[] args) {

        System.out.println("********************** Date SimpleDatFormat Calendar watch?v=oHzjfj8UWDI ***************************************************************\n");

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("sdf = " + sdf);

        String fechaFormatted = sdf.format(fecha);

        System.out.println("fechaFormatead = " + fechaFormatted);

        Date fecha2 = new Date();

        System.out.println("***** Usando Calendar para fecha personalizada****");

        calendar.set(2021, 11, 19); // seses cuenta desde el cero 11 es diciembre.
        Date fechaPersonalizada = calendar.getTime();
        System.out.println("Fecha guardada tipo calendar " + fechaPersonalizada);
        String fechaPersonalizadaFormateado = sdf.format(fechaPersonalizada);
        System.out.println("fechaPersonalizadaFormateado = " + fechaPersonalizadaFormateado);

        int dia = calendar.get(calendar.DATE);
        int mes = calendar.get(calendar.MONTH);
        int anio = calendar.get(calendar.YEAR);

        System.out.println("dia = " + dia);
        System.out.println("mes = " + mes);
        System.out.println("anio = " + anio);


        System.out.println("\n**** Prueba resta horas falla masiva CHATGPT*************************************************************************************");

        Date dateFC = new Date();

        System.out.println("fechaActual = " + dateFC);
        System.out.println("fechaActualEnMS = " + dateFC.getTime());

        //String statusDate = "2023-11-17 10:00:00";
        //String statusDate = "2023-11-17 14:29:37";
        String statusDate = "2023-11-13 13:33:35";
        //String statusDate = "";
        //String statusDate = "null";
        //String statusDate = "1";

        System.out.println("statusDate = " + statusDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date statusDateF = simpleDateFormat.parse(statusDate);
            float attenDelayFM = (float) Math.abs(dateFC.getTime() - statusDateF.getTime()) / (3600000);

            System.out.println("attenDelayFM = " + attenDelayFM);

        } catch (ParseException e) {
            System.out.println("stataDate was null or empty");
        }


        System.out.println("Continua");


        System.out.println("*******************************Calendar DHR https://www.youtube.com/watch?v=moHU56c_rGU ************************");


        int dia1 = 1;
        int mes2 = 11;
        int anio2 = 2023;

        System.out.println("dias: "+calculaDias(dia1,mes2,anio2));

    }

    public static int calculaDias (int dia1, int mes2, int anio2){
        Calendar inicio = Calendar.getInstance();
        inicio.set(anio2,mes2 -1, dia1);
        System.out.println("Dia iniio: "+inicio.getTime());
/*        inicio.set(Calendar.HOUR,0);
        inicio.set(Calendar.HOUR_OF_DAY,0);
        inicio.set(Calendar.MINUTE,0);
        inicio.set(Calendar.SECOND,0);*/

        Calendar actual = Calendar.getInstance();

        System.out.println("Dia actual: "+actual.get(actual.DATE));
        System.out.println("Dia actual: "+actual.getTime());
/*        actual.set(Calendar.HOUR,0);
        actual.set(Calendar.HOUR_OF_DAY,0);
        actual.set(Calendar.MINUTE,0);
        actual.set(Calendar.SECOND,0);*/
        
        long finMS = actual.getTimeInMillis();
        long inicioMS = inicio.getTimeInMillis();
        
        int dias = (int) ((Math.abs(finMS-inicioMS))/(1000*60*60*24));
        System.out.println("actual = " + actual);

       return  + dias;


    }

}
