package sistemaPagos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ValidacionFecha {


    // Función para calcular la fecha de pago de la quincena
    public static LocalDate calcularFechaDePagoQuincenal(LocalDate fecha) {

        // Extrayendo dia/mes
        // Crear un formateador para expresar solo día y mes
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM");

        // Obtener la representación de cadena con día y mes
        String diaMes = fecha.format(formateador);

        // Imprimir la representación de día y mes
        System.out.println("Día y mes: " + diaMes);

        System.out.println("Es feriado? = " + ValidaFeriado.esDiaFestivo(diaMes));

        // Verifica si el día ingresado es antes o después del día 15 del mes
        boolean esPrimeraQuincena = fecha.getDayOfMonth() <= 15;

        // Determina el día objetivo (15 o 30) según la quincena
        int diaObjetivo = esPrimeraQuincena ? 15 : 30;

        // Obtiene el día de la semana de la fecha ingresada
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();

        // Si la fecha ingresada es un día hábil y es igual al día objetivo, no hay cambios
        //if (diaDeLaSemana != DayOfWeek.SATURDAY && diaDeLaSemana != DayOfWeek.SUNDAY && fecha.getDayOfMonth() == diaObjetivo) {
        //improve
        if (diaDeLaSemana != DayOfWeek.SATURDAY && diaDeLaSemana != DayOfWeek.SUNDAY && fecha.getDayOfMonth() == diaObjetivo && !ValidaFeriado.esDiaFestivo(diaMes)) {
            return fecha;
        }

        // Calcula la fecha de pago de la quincena
        LocalDate fechaDePago = esPrimeraQuincena ?
                fecha.withDayOfMonth(15) :
                //        fecha.withDayOfMonth(fecha.lengthOfMonth());  // Último día del mes
                //Improve
                fecha.getMonth() == Month.FEBRUARY ? fecha.withDayOfMonth(fecha.lengthOfMonth()) : fecha.withDayOfMonth(30);  // Último día del mes

        /*// Verifica si la fecha de pago es un día hábil, y si no, ajusta al día hábil más cercano hacia la derecha
        while (fechaDePago.getDayOfWeek() == DayOfWeek.SATURDAY || fechaDePago.getDayOfWeek() == DayOfWeek.SUNDAY) {
            fechaDePago = fechaDePago.minusDays(1);  // Retrocede un día
        }
        return fechaDePago;*/

        System.out.println("idealFP = " + fechaDePago);
        LocalDate fechaPagoToL = fechaDePago;
        LocalDate fechaPagoToR = fechaDePago;

        // Verifica si la fecha de pago es un día hábil, y si no, ajusta al día hábil más cercano hacia la derecha
        while (fechaPagoToL.getDayOfWeek() == DayOfWeek.SATURDAY || fechaPagoToL.getDayOfWeek() == DayOfWeek.SUNDAY || ValidaFeriado.esDiaFestivo((fechaPagoToL.format(DateTimeFormatter.ofPattern("dd-MM"))))) {
            fechaPagoToL = fechaPagoToL.minusDays(1);  // Retrocede un día
        }
        System.out.println("possibleFPToL = " + fechaPagoToL);

        // Verifica si la fecha de pago es un día hábil, y si no, ajusta al día hábil más cercano hacia la izquierda
        while (fechaPagoToR.getDayOfWeek() == DayOfWeek.SATURDAY || fechaPagoToR.getDayOfWeek() == DayOfWeek.SUNDAY || ValidaFeriado.esDiaFestivo((fechaPagoToR.format(DateTimeFormatter.ofPattern("dd-MM"))))) {
            fechaPagoToR = fechaPagoToR.plusDays(1);  // Retrocede un día
        }
        System.out.println("possibleFPToR = " + fechaPagoToR);

        System.out.println(" cronusssL= " + ChronoUnit.DAYS.between(fechaPagoToL, fechaDePago));
        System.out.println(" cronusssR= " + ChronoUnit.DAYS.between(fechaDePago, fechaPagoToR));


        if (ChronoUnit.DAYS.between(fechaPagoToL, fechaDePago) < ChronoUnit.DAYS.between(fechaDePago, fechaPagoToR)) {
            return fechaPagoToL;
        } else if (ChronoUnit.DAYS.between(fechaPagoToL, fechaDePago) > ChronoUnit.DAYS.between(fechaDePago, fechaPagoToR)) {

            return fechaPagoToR;
        } else {
            return fechaPagoToL;
        }

//        LocalDate fecha1 = LocalDate.of(2022, 1, 1);
//        LocalDate fecha2 = LocalDate.of(2022, 1, 10);
//
//        // Calcular la diferencia en días
//        long diferenciaEnDias = ChronoUnit.DAYS.between(fecha1, fecha2);
//
//        // Imprimir la diferencia en días
//        System.out.println("Diferencia en días: " + diferenciaEnDias);
    }
}
