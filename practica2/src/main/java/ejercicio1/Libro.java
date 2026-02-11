package ejercicio1;

class Libro {
    private String titulo;
    private String autores;
    private String editorial;
    private int anho;
    private String isbn;

    Libro(String titulo, String autores, String editorial, int anho, String isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anho = anho;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnho() {
        return anho;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return """
               Titulo = %s
               Autores = %s
               Editorial = %s
               Año = %d
               Isbn = %s""".formatted(titulo, autores, editorial, anho, isbn);
    }
}