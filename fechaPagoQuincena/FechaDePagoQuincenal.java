package fechaPagoQuincena;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaDePagoQuincenal {

    public static void main(String[] args) {
        // Obtiene la fecha ingresada por el usuario en el formato yyyy-mm-dd
        String fechaIngresada = "2023-12-31";  // Puedes cambiar esta fecha según la entrada del usuario

        // Convierte la cadena de fecha a un objeto LocalDate
        LocalDate fecha = LocalDate.parse(fechaIngresada);

        // Calcula la fecha de pago de la quincena
        LocalDate fechaDePago = calcularFechaDePagoQuincenal(fecha);

        // Muestra la fecha de pago resultante
        System.out.println("Fecha de pago de la quincena: " + fechaDePago.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    // Función para calcular la fecha de pago de la quincena
    private static LocalDate calcularFechaDePagoQuincenal(LocalDate fecha) {
        // Verifica si el día ingresado es antes o después del día 15 del mes
        boolean esPrimeraQuincena = fecha.getDayOfMonth() <= 15;
        System.out.println(esPrimeraQuincena);

        // Determina el día objetivo (15 o 30) según la quincena
        int diaObjetivo = esPrimeraQuincena ? 15 : 30;

        // Obtiene el día de la semana de la fecha ingresada
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();

        // Si la fecha ingresada es un día hábil y es igual al día objetivo, no hay cambios
        if (diaDeLaSemana != DayOfWeek.SATURDAY && diaDeLaSemana != DayOfWeek.SUNDAY && fecha.getDayOfMonth() == diaObjetivo) {
            return fecha;
        }

        // Calcula la fecha de pago de la quincena
        LocalDate fechaDePago = esPrimeraQuincena ?
                fecha.withDayOfMonth(15) :
                fecha.withDayOfMonth(fecha.lengthOfMonth());  // Último día del mes

        // Verifica si la fecha de pago es un día hábil, y si no, ajusta al día hábil más cercano
        while (fechaDePago.getDayOfWeek() == DayOfWeek.SATURDAY || fechaDePago.getDayOfWeek() == DayOfWeek.SUNDAY) {
            fechaDePago = fechaDePago.minusDays(1);  // Retrocede un día
        }

        return fechaDePago;
    }
}
