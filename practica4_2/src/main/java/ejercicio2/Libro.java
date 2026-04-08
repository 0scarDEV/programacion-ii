package ejercicio2;
import ejercicio1.Autor;

public class Libro extends Publicacion {
    private String editorial;
    private String lugar;

    public Libro(String titulo, int anho, int numCitas, Autor autor, String editorial, String lugar) {
        super(titulo, anho, numCitas, autor);
        this.editorial = editorial;
        this.lugar = lugar;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getLugar() {
        return lugar;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + ", año " + getAnho() + ", editorial: " + editorial + ", lugar: " + lugar;
    }
}
