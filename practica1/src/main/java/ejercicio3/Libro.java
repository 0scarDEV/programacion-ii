package ejercicio3;

import java.util.Scanner;

public class Libro {
    String titulo;
    String[] autores;
    String editorial;
    int anhoEdicion;
    String isbn;
    
    public Libro(String titulo, String[] autores, String editorial, int anhoEdicion, String isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anhoEdicion = anhoEdicion;
        this.isbn = isbn;
    }

    public static Libro crearLibroDesdeConsola() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el título: ");
        String titulo = sc.nextLine();

        System.out.println("Introduce los autores (separados por comas): ");
        String[] autores = sc.nextLine().split(",");

        System.out.println("Introduce la editorial: ");
        String editorial = sc.nextLine();

        System.out.println("Introduce el año de edición: ");
        int anhoEdicion = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        
        System.out.println("Introduce el ISBN: ");
        String isbn = sc.nextLine();
        sc.close();
        return new Libro(titulo, autores, editorial, anhoEdicion, isbn);
    }

    @Override
    public String toString() {
        return """
                Título: %s
                Autores: %s
                Editorial: %s
                Año de Edición: %d
                ISBN: %s
                """.formatted(titulo, String.join(", ", autores), editorial, anhoEdicion, isbn);
    }
}
