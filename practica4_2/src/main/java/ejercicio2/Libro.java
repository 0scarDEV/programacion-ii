package ejercicio2;

public class Libro extends Publicacion {
    private String editorial;
    private String lugar;

    public Libro(String titulo, int anho, String editorial, String lugar) {
        super(titulo, anho);
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
