package ejercicio2;

public class LibroConTipo {
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
}