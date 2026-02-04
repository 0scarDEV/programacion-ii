package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo;
        String[] autores;
        String editorial;
        int anhoEdicion;
        String isbn;

        System.out.println("Introduce el título: ");
        titulo = sc.nextLine();

        System.out.println("Introduce los autores (separados por comas): ");
        autores = sc.nextLine().split(",");

        System.out.println("Introduce la editorial: ");
        editorial = sc.nextLine();

        System.out.println("Introduce el año de edición: ");
        anhoEdicion = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        
        System.out.println("Introduce el ISBN: ");
        isbn = sc.nextLine();
        sc.close();

        Libro libro = new Libro(titulo, autores, editorial, anhoEdicion, isbn);
        System.out.println("\nInformación del libro: \n" + libro);
    }
}
