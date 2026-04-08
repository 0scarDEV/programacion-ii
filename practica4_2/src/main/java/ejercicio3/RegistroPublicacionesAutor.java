package ejercicio3;

import java.util.List;

import ejercicio1.Autor;
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
}
