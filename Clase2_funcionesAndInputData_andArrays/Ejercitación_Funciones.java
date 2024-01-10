package Clase2_funcionesAndInputData_andArrays;

import java.util.Objects;
import java.util.Scanner;

public class Ejercitación_Funciones {

    /*  Hacer una función que dado un número indica si es un número primo o no. Un número
        primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
        ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1
        y por 17.
        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
        función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
        obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
        divisor)
    */

    public static boolean esPrimo(int numero) {
        boolean primo = true;
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && i != numero) {
                primo = false;
            }
        }

        return primo;

    }

/*  Escribir una función que reciba tres números y devuelva el máximo entre los tres números.Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    el resultado.
*/

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
        if (unNumeroA > unNumeroB && unNumeroA > unNumeroC) {
            return unNumeroA;
        } else if (unNumeroB > unNumeroA && unNumeroB > unNumeroC) {
            return unNumeroB;
        } else {
            return unNumeroC;
        }
    }

/*
    Escribir una función:
    boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
    false, en caso de que coincidan.
*/
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return !Objects.equals(unTextoA, unTextoB);
    }


//////////////////////////////testing////////////////////////////////////
    public static void main(String[] args) {

        Scanner scanenr = new Scanner(System.in);
        System.out.print("Ingrese un numero para saber si es primo: ");
        int numero = scanenr.nextInt();
        System.out.println("Es primo: " + esPrimo(+numero));

        System.out.println("Ingrese 3 numeros para saber cual es el mayor: ");
        int num1 = scanenr.nextInt();
        int num2 = scanenr.nextInt();
        int num3 = scanenr.nextInt();
        System.out.println("maximoEntreTresNumeros = " + maximoEntreTresNumeros(num1,num2,num3));

        System.out.println("Ingresa 2 textos distintos para compararlos: ");
        Scanner scaneer = new Scanner(System.in);
        String a = scaneer.nextLine();
        String b = scaneer.nextLine();
        System.out.println("cadenasDeTextoDistintas(\"a\",\"b\") = " + cadenasDeTextoDistintas(a,b));

        scanenr.close();
        scaneer.close();
    }
    

}
