package ejercicio2;
import ejercicio1.Autor;

public class Articulo extends Publicacion {
    private String nombreRevista;
    private int volumen;
    private int paginaInicial;
    private int paginaFinal;

    public Articulo(String titulo, int anho, int numCitas, Autor autor, String nombreRevista, int volumen, int paginaInicial, int paginaFinal) {
        super(titulo, anho, numCitas, autor);
        this.nombreRevista = nombreRevista;
        this.volumen = volumen;

        if (paginaInicial <= 0 || paginaFinal <= 0 || paginaFinal < paginaInicial) {
            throw new IncorrectPagesException("Las páginas deben ser números positivos y la página final debe ser mayor o igual a la página inicial.");
        }

        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + ", revista " + nombreRevista + ", volumen " + volumen
                + ", páginas de la " + paginaInicial + " a la " + paginaFinal;
    }
}
