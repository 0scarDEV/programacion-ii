package ejercicio2;

public class Publicacion {
    private String titulo;
    private int anho;
    
    public Publicacion(String titulo, int anho) {
        this.titulo = titulo;
        this.anho = anho;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnho() {
        return anho;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", año: " + anho;
    }
}
