package ejercicio2;

import ejercicio1.Autor;

public class Publicacion {
    private String titulo;
    private int anho;
    private int numCitas;
    private Autor primerAutor;

    public Publicacion(String titulo, int anho, int numCitas, Autor primerAutor) {
        this.titulo = titulo;
        this.anho = anho;
        this.numCitas = numCitas;
        this.primerAutor = primerAutor;
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

    public Autor getPrimerAutor() {
        return primerAutor;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", año: " + anho + ", " + numCitas + " citas a otra publicación, primer autor: " + primerAutor.getNombre() + " " + primerAutor.getApellidos();
    }
}
