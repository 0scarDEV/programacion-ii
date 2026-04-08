package ejercicio2;

public class Publicacion {
    private String titulo;
    private int anho;
    private int numCitas;
    
    public Publicacion(String titulo, int anho, int numCitas) {
        this.titulo = titulo;
        this.anho = anho;
        this.numCitas = numCitas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnho() {
        return anho;
    }

    public int getNumCitas() {
        return numCitas;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", año: " + anho + ", " + numCitas + " citas a otra publicación.";
    }
}
