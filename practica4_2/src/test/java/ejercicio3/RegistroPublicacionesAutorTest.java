package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ejercicio1.Autor;
import ejercicio2.Articulo;
import ejercicio2.ComunicacionEnCongreso;
import ejercicio2.Libro;
import ejercicio2.Publicacion;

public class RegistroPublicacionesAutorTest {
    @Test
    void testCalcularIndiceC() {
        int numCitasArticulo = 10;
        int numCitasLibro = 20;
        int numCitasComunicacion = 5;

        Autor autor = new Autor("1", "Doe", "John", "InstitutoX");
        Publicacion articulo = new Articulo("Articulo1", 2020, numCitasArticulo, autor, "Revista1", 1, 1, 1);
        Publicacion libro = new Libro("Libro1", 2018, numCitasLibro, autor, "Editorial1", "Ciudad1");
        Publicacion comunicacion = new ComunicacionEnCongreso("Comunicacion1", 2019, numCitasComunicacion, autor, "Congreso1", "Ciudad2", "Pais1");

        RegistroPublicacionesAutor registro = new RegistroPublicacionesAutor(autor, List.of(articulo, libro, comunicacion));
        double indiceC = registro.calcularIndiceC();

        assertEquals(indiceC, (numCitasArticulo * 1) + (numCitasLibro * 0.8) + (numCitasComunicacion * 0.6));
    }
}
