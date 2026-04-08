package ejercicio3;

import java.util.List;

import ejercicio1.Autor;
import ejercicio2.Articulo;
import ejercicio2.ComunicacionEnCongreso;
import ejercicio2.Libro;
import ejercicio2.Publicacion;

public class RegistroPublicacionesAutor {
    private Autor investigador;
    private List<Publicacion> publicaciones;

    public RegistroPublicacionesAutor(Autor investigador, List<Publicacion> publicaciones) {
        this.investigador = investigador;
        this.publicaciones = publicaciones;
    }

    public Autor getInvestigador() {
        return investigador;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void addPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public double calcularIndiceC() {
        double numCitasArticulo = 0;
        double numCitasLibro = 0;
        double numCitasComunicacion = 0;

        for (Publicacion pub : publicaciones) {
            if (pub instanceof Articulo) {
                numCitasArticulo += pub.getNumCitas();
            } else if (pub instanceof Libro) {
                numCitasLibro += pub.getNumCitas();
            } else if (pub instanceof ComunicacionEnCongreso) {
                numCitasComunicacion += pub.getNumCitas();
            }
        }

        return (numCitasArticulo * 1) + (numCitasLibro * 0.8) + (numCitasComunicacion * 0.6);
    }
}
