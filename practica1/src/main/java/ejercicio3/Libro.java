package ejercicio3;

public class Libro {
    private String titulo;
    private String[] autores;
    private String editorial;
    private int anhoEdicion;
    private String isbn;
    
    public Libro(String titulo, String[] autores, String editorial, int anhoEdicion, String isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anhoEdicion = anhoEdicion;
        this.isbn = isbn;
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
