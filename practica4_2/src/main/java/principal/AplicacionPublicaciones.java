package principal;

import ejercicio2.*;
import java.util.ArrayList;

public class AplicacionPublicaciones {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(new Libro("El Quijote", 1605, "Anaya", "Madrid"));
        publicaciones.add(new ComunicacionEnCongreso("Titulo", 2010, "CongresoX", "CiudadY", "PaisZ"));
        publicaciones.add(new Articulo("Articulo1", 2020, "Revista1", 1, 1, 1));

        for (Publicacion pub : publicaciones) {
            System.out.print("\n" + pub);
        }
    }
}
