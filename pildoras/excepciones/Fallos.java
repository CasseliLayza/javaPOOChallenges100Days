package pildoras.excepciones;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fallos {
    public static void main(String[] args) {

        //-------------------------------------------------------Ejecucion de pruebas---------------------------------------------------------


        int[] mimatriz = new int[5];

        mimatriz[0] = 5;
        mimatriz[1] = 38;
        mimatriz[2] = -15;
        mimatriz[3] = 98;
        mimatriz[4] = 71;

        for (int e : mimatriz) {
            System.out.println("Posicion " + e);
        }

/*
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));

        System.out.println("Hola "+ nombre+ " tienes "+edad +" años."+" El programa termino su ejecucion");
*/


/*        try {
            Image imagen = ImageIO.read(new File("D:/WALLPAPERS/ROG.png"));
        } catch (IOException e) {// IOExecption para acceder a archivos// controlada por el sistema obliga try/catch
            //throw new RuntimeException(e);
            System.out.println("No found image file!!  :(");
        }*/


/*        try {
            inputDatos();

        } catch (InputMismatchException e) {// capture misma exception o una heredada, ver foto
            System.out.println("Que ingresaste como nombre???");
        }*/

        /* 1
        // lanzar execptin manual
        String mail = JOptionPane.showInputDialog("Ingresa correo: ");
        try {
            compruebaCorreo(mail);
        } catch (EOFException e) {
            System.out.println("ingresaste menos de 3 caracteres???");
        }
        */


        // Usando mi propia excepcion
/*
        String mail = JOptionPane.showInputDialog("Ingresa correo: ");
        try {
            compruebaCorreo(mail);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
*/

        //capturando varias excepcions
/*        try {

            division();
        } catch (ArithmeticException e) {
            System.out.println("Error - no se permite la division por cero");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println(e.getClass().getClass());
            System.out.println(e.getCause());

            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error - no ingresaste un numero");
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getClass());
            System.out.println(e.getCause());
            e.printStackTrace();
        }*/


        //Uso de final
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducie el dividendo");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Introducie el divisior");
        int num2 = Integer.parseInt(scan.nextLine());

        try {
            division2(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Error - no se permite la division por cero");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println(e.getClass().getClass());
            System.out.println(e.getCause());

            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error - no ingresaste un numero");
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getClass());
            System.out.println(e.getCause());
            e.printStackTrace();
        } finally {
            //scan.close();// cierra conexion, por lejibilidad y se asegura q siempe se ejecute esta sentencia de liberacion de recursos
            System.out.println("cierra conexion, por lejibilidad y se asegura q siempe se ejecute esta sentencia de liberacion de recursos");
        }


//-------------------------------------------------------Metodos---------------------------------------------------------
    }

    static void inputDatos() throws InputMismatchException {// No controlada por el sistema, error programador

        Scanner s = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre = s.nextLine();
        System.out.println("nombre = " + nombre);


        System.out.println("ingresa tu edad");
        int edad = s.nextInt();
        System.out.println("edad = " + edad);

    }


    // usando mi primera execpcion
    //1 static void compruebaCorreo(String mail) throws EOFException {
    static void compruebaCorreo(String mail) throws MiExcepcion {

        if (mail.length() <= 3) {
            //1 throw new EOFException();

            throw new MiExcepcion("El mail es demasiado corto");

        } else {

            boolean punto = false;
            int arroba = 0;

            for (int i = 0; i < mail.length(); i++) {
                if ((mail.charAt(i)) == '@') {
                    arroba++;
                }
                if (mail.charAt(i) == '.') {
                    punto = true;
                }
            }

            if (punto && arroba == 1) {
                System.out.println(" correo correcto");

            } else {
                System.out.println(" correo NO correcto");
            }
        }
    }


    //capturando varias excepcions-------------------------------------------------------------

    static void division() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introducie el dividendo"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introducie el divisior"));

        System.out.println("num1/num2 = " + num1 / num2);
    }

    //uso de varias excepcions y final-------------------------------------------------------------

    static void division2(int num1, int num2) {

        System.out.println("num1/num2 = " + num1 / num2);
    }


}


