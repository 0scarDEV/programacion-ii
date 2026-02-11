package ejercicio2;

import java.util.Scanner;

public class LibroConTipo {
    public enum TipoLibro {
        NOVELA, HISTORIA, TECNOLOGIA
    }

    // Atributos
    private String titulo;
    private String autores;
    private String editorial;
    private TipoLibro tipo;
    private int anho;
    private String isbn;

    // Constructor
    LibroConTipo(String titulo, String autores, String editorial, TipoLibro tipo, int anho, String isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.tipo = tipo;
        this.anho = anho;
        this.isbn = isbn;
    }

    // Getters
    public String getTitulo() {return titulo;}
    public String getAutores() {return autores;}
    public String getEditorial() {return editorial;}
    public int getAnho() {return anho;}
    public String getIsbn() {return isbn;}
    public TipoLibro getTipo() {return tipo;}

    // Métodos
    @Override
    public String toString() {
        return """
                Titulo = %s
                Autores = %s
                Editorial = %s
                Tipo = %s
                Año = %d
                Isbn = %s""".formatted(titulo, autores, editorial, tipo, anho, isbn);
    }

    // Estáticos
    static LibroConTipo crearLibroDesdeConsola(Scanner scanner) {
        System.out.print("Introduce el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce los autores: ");
        String autores = scanner.nextLine();

        System.out.print("Introduce la editorial: ");
        String editorial = scanner.nextLine();

        System.out.print("Introduce el tipo de libro: ");
        String tipo = scanner.nextLine();
        TipoLibro tipoLibro = TipoLibro.valueOf(tipo.toUpperCase());

        System.out.print("Introduce el año de edición: ");
        int anho = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduce el ISBN: ");
        String isbn = scanner.nextLine();

        return new LibroConTipo(titulo, autores, editorial, tipoLibro, anho, isbn);
    }
}