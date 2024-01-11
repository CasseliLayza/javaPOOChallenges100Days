# Consigna


Simulacro de Examen finalC Objetivo
Realizar el diagrama UML y programar en Java, implementando los patrones que se requieran, el siguiente enunciado:

## Enunciado

**Desafío**

Un __Instituto__ necesita desarrollar un sistema para el área comercial y académica que le permita armar __ofertas académicas__ es decir armar paquetes con los __cursos__ 
que se dictan en la institución para constituir __programas intensivos__. Estos __cursos__ están diseñados a su vez para poder dictarse y ofrecerse en forma independiente 
sin necesidad de cursar un __programa intensivo__. Es decir, que tanto un __curso__ como un __programa__ son __ofertas académicas__ que el área comercial podrá ofrecer.
Toda __oferta académica__ es decir __cursos y __programas__ tienen un __nombre__, una __descripción__ y deberán tener una __funcionalidad__ que le permita al área comercial 
poder contar con un precio para cada una de estas ofertas con la siguiente lógica:
* El precio de un curso se calcula de acuerdo a la cantidad de carga horaria mensual de esa materia por la cantidad de meses de duración de la misma 
y un valor hora que se establece por cada materia.
* El precio de un programa intensivo es la sumatoria de los precios de todos los cursos que forman el programa y se bonifica un determinado porcentaje dependiendo del programa.
* El Instituto deberá poder generar un informe que permita mostrar todos los cursos y programas que ofrece indicando el nombre y precio de cada uno. 
(no es necesario mostrar los cursos que tiene un programa intensivo).
* El Instituto también deberá poder agregar ofertas académicas. Recibirá un texto como parámetro para indicar qué tipo de oferta académica es. 
Será “curso” para agregar cursos o “programa” en caso de la necesidad de agregar un programa intensivo. También deberá recibir todos los 
demás parámetros necesarios para la creación de una oferta académica.
* Reproducir la siguiente situación en el método main e invocar al método que genera el informe.

```java
public class Main {
    public static void main(String[] args) {
        Curso frontEnd = new Curso("Front End", 16, 2, 1000);
        Curso backEnd = new Curso("Back End", 20, 2, 900);

        ProgramaIntensivo fullStack = new ProgramaIntensivo("FullStack", 0, 0, 20);
        fullStack.agregarCurso(frontEnd);
        fullStack.agregarCurso(backEnd);

        System.out.println("Precio del Curso Front End: $" + frontEnd.calcularPrecio());
        System.out.println("Precio del Curso Back End: $" + backEnd.calcularPrecio());
        System.out.println("Precio del Programa Intensivo FullStack: $" + fullStack.calcularPrecio());
    }
}
```

¡Muchos éxitos!