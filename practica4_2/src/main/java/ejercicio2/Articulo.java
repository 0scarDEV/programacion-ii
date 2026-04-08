package ejercicio2;

public class Articulo extends Publicacion {
    private String nombreRevista;
    private int volumen;
    private int paginaInicial;
    private int paginaFinal;

    public Articulo(String titulo, int anho, String nombreRevista, int volumen, int paginaInicial, int paginaFinal) {
        super(titulo, anho);
        this.nombreRevista = nombreRevista;
        this.volumen = volumen;
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
