package Clase2_funcionesAndInputData_andArrays;

public class Clase2_inputData {
    public static void main(String[] args) {
        String nombre = "Casseli";
        String apeliido = "Layza";
        System.out.println("metodo con substring: "+nombre.substring(0,1)+apeliido.substring(0,1));
        System.out.println("metodo con charAt: "+nombre.charAt(0)+apeliido.charAt(0));
        String iniciales = nombre.substring(0,1)+apeliido.substring(0,1);
        System.out.println(iniciales);


        String iniciales2 = String.valueOf(nombre.toCharArray()[0]+ + apeliido.toCharArray()[0]);
        System.out.println(iniciales2);

        String fecha = "12/10/23";
        String[] fechaArray = fecha.split("/");
        System.out.println(fechaArray[0]+" "+fechaArray[1]+" "+fechaArray[2]);


    }
}
