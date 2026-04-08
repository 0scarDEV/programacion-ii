package ejercicio2;
import ejercicio1.Autor;

public class ComunicacionEnCongreso extends Publicacion {
    private String nombreCongreso;
    private String ciudad;
    private String pais;

    public ComunicacionEnCongreso(String titulo, int anho, int numCitas, Autor autor, String nombreCongreso, String ciudad, String pais) {
        super(titulo, anho, numCitas, autor);
        this.nombreCongreso = nombreCongreso;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombreCongreso() {
        return nombreCongreso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return super.toString() + ", congreso " + nombreCongreso + " en " + ciudad + ", " + pais;
    }
}
