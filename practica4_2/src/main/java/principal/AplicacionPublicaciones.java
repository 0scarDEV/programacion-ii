package principal;

import ejercicio1.Autor;
import ejercicio2.*;
import java.util.ArrayList;

public class AplicacionPublicaciones {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        Autor autor1 = new Autor("1", "de Cervantes", "Miguel", "InstitutoX");
        Autor autor2 = new Autor("2", "Desconocido", "Autor", "InstitutoY");
        Autor autor3 = new Autor("3", "Desconocido", "Autor", "InstitutoZ");

        publicaciones.add(new Libro("El Quijote", 1605, 0, autor1, "Anaya", "Madrid"));
        publicaciones.add(new ComunicacionEnCongreso("Titulo", 2010, 0, autor2, "CongresoX", "CiudadY", "PaisZ"));
        publicaciones.add(new Articulo("Articulo1", 2020, 0, autor3, "Revista1", 1, 1, 1));

        for (Publicacion pub : publicaciones) {
            System.out.print("\n" + pub);
        }
    }
}
