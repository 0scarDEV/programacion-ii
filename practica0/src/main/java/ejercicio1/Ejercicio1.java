package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Aprendiendo Java, ¡qué guay!");
        System.out.println("Este es mi primer programa en Java");

        // Alternativa con TextBlock
        System.out.println("""
                    Aprendiendo Java, ¡qué guay!
                    Este es mi primer programa en Java.
                """);

        // Lectura por teclado (bien)
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu nota: ");
        double nota = sc.nextDouble();
        sc.close();*/

        // ¿Aprendemos nuevas clases?
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu nota: ");
        Double nota = Double.parseDouble(sc.nextLine());
        sc.close();


        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
    }
}