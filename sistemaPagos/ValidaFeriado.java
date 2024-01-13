package sistemaPagos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ValidaFeriado {


    public static boolean esDiaFestivo(String diaMes) {

        // Especifica la ruta del archivo db festivos
        String rutaArchivo = "src/sistemaPagos/dbFestivos/Feriados.txt";
        boolean feriado = false;
        String linea = "";

        try {
            // Crea un objeto FileReader y BufferedReader para leer el archivo
            FileReader fileReader = new FileReader(rutaArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Lee cada línea del archivo
            while ((linea = bufferedReader.readLine()) != null) {
                // valida feriado
                //System.out.println(linea);
                if (diaMes.equals(linea)) {
                    feriado = true;
                    break;
                }
            }

            // Cierra los recursos después de su uso
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            // Manejo de excepciones en caso de error de lectura
            e.printStackTrace();
        }
        // respuesta de busqueda feriado
        return feriado;

    }

}
