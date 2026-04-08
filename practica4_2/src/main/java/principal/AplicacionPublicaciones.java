package principal;

import ejercicio1.Autor;
import ejercicio2.*;
import ejercicio3.RegistroPublicacionesAutor;

import java.util.ArrayList;

public class AplicacionPublicaciones {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        Autor autor1 = new Autor("1", "de Cervantes", "Miguel", "InstitutoX");
        Autor autor2 = new Autor("2", "Desconocido", "Autor", "InstitutoY");
        Autor autor3 = new Autor("3", "Desconocido", "Autor", "InstitutoZ");

        publicaciones.add(new Libro("El Quijote", 1605, 2, autor1, "Anaya", "Madrid"));
        publicaciones.add(new ComunicacionEnCongreso("Titulo", 2010, 3, autor2, "CongresoX", "CiudadY", "PaisZ"));

        Publicacion articulo;
        try {
            articulo = new Articulo("Articulo1", 2020, 10, autor3, "Revista1", 1, 3, 1);
        } catch (IncorrectPagesException e) {
            System.out.println("Error al crear el artículo: " + e.getMessage());
            articulo = new Articulo("Articulo1", 2020, 10, autor3, "Revista1", 1, 1, 1);
        }

        publicaciones.add(articulo);

        for (Publicacion pub : publicaciones) {
            System.out.print("\n" + pub);
        }

        RegistroPublicacionesAutor registro = new RegistroPublicacionesAutor(autor1, publicaciones);
        System.out.println("\nÍndice C del autor " + autor1.getNombre() + " " + autor1.getApellidos() + ": " + registro.calcularIndiceC());
    }
}
