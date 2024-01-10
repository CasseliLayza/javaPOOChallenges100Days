package Clase2_funcionesAndInputData_andArrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Clase2_Funciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Input/testing Ejercicio 01
        System.out.print("Ingresa el número que quieres verificar si es primo: ");
        int numero = scanner.nextInt();
        System.out.println("El numero ingresado "+numero+" es primo? " +esPrimo(numero));;

        //Input/testing Ejercicio 02
        System.out.print("Ingresa el unNumeroA para verificar el máximo entre los tres números : ");
        int unNumeroA = scanner.nextInt();
        System.out.print("Ingresa el unNumeroB para verificar el máximo entre los tres números: ");
        int unNumeroB = scanner.nextInt();
        System.out.print("Ingresa el unNumeroC para verificar el máximo entre los tres números: ");
        int unNumeroC = scanner.nextInt();
        System.out.println("EL maximo4 numero ingresado es: "+ maximoEntreTresNumeros(unNumeroA,unNumeroB,unNumeroC));

        //Input/testing Ejercicio 03
        Scanner scannerr = new Scanner(System.in);
        System.out.print("Ingresa el unTextoA para verificar si es distinto al unTextoB: ");
        String unTextoA = scannerr.nextLine();
        System.out.print("Ingresa el unTextoB para verificar si es distinto al unTextoA: ");
        String unTextoB = scannerr.nextLine();
        System.out.println("Las cadenas ingresadas son distintas? "+cadenasDeTextoDistintas(unTextoA,unTextoB));




         scanner.close();
         scannerr.close();

    }

/*  Ejercicio 1
    Hacer una función que dado un número indica si es un número primo o no. Un número
    primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
    ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por 17.
    Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
    función desarrollada para comprobar si es primo o no.*/

        static boolean esPrimo(int numero){
            int contador = 2;
            boolean primo=true;
            while ((primo) && (contador!=numero)){
                if (numero % contador == 0){
                    primo = false;
                }
                contador++;
            }
            return primo;

        }


/*  Ejercicio 2
    Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
    Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    el resultado.*/

        static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){

            Integer[] allNumbers = new Integer[3];
            allNumbers[0]= unNumeroA;
            allNumbers[1]= unNumeroB;
            allNumbers[2]= unNumeroC;

            Arrays.sort(allNumbers);

            return allNumbers[allNumbers.length-1];
        }

/*  Ejercicio 3
    Escribir una función:
    boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
    false, en caso de que coincidan.*/

       static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){

            if(Objects.equals(unTextoA, unTextoB)){
                return false;
            }else {
                return true;
            }
        }


}




