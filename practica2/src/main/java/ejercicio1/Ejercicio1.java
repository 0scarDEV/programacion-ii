package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Libro[] libros = new Libro[4];
        libros[0] = new Libro("El Quijote", "Miguel de Cervantes", "Editorial A", 1605, "1234567890");
        libros[1] = new Libro("Cien años de soledad", "Gabriel  García Márquez", "Editorial B", 1967, "0987654321");
        libros[2] = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "Editorial C", 2001, "1122334455");

        System.out.println("Mostramos los libros completos: ");
        for (Libro libro : libros) {
            if (libro != null) {
                System.out.println("-----------------------------");
                System.out.println(libro);
            }
        }

        Scanner sc = new Scanner(System.in);
        libros[3] = crearLibroDesdeConsola(sc);
        sc.close();

        System.out.println("Mostramos los libros por título: ");
        for (Libro libro : libros) {
            System.out.println("\t" + libro.getTitulo());
        }
    }

    static Libro crearLibroDesdeConsola(Scanner scanner){
        System.out.print("Introduce el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce los autores: ");
        String autores = scanner.nextLine();

        System.out.print("Introduce la editorial: ");
        String editorial = scanner.nextLine();

        System.out.print("Introduce el año de edición: ");
        int anho = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduce el ISBN: ");
        String isbn = scanner.nextLine();

        return new Libro(titulo, autores, editorial, anho, isbn);
    }
}
