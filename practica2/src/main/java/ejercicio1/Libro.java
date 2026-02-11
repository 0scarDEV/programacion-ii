package ejercicio1;

import java.util.Scanner;

class Libro {
    // Atributos
    private String titulo;
    private String autores;
    private String editorial;
    private int anho;
    private String isbn;

    // Constructor
    Libro(String titulo, String autores, String editorial, int anho, String isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anho = anho;
        this.isbn = isbn;
    }

    // Getters
    public String getTitulo() {return titulo;}
    public String getAutores() {return autores;}
    public String getEditorial() {return editorial;}
    public int getAnho() {return anho;}
    public String getIsbn() {return isbn;}

    // Métodos
    @Override
    public String toString() {
        return """
               Titulo = %s
               Autores = %s
               Editorial = %s
               Año = %d
               Isbn = %s""".formatted(titulo, autores, editorial, anho, isbn);
    }

    // Estáticos
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