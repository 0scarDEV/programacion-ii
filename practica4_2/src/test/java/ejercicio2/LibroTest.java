package ejercicio2;

import org.junit.jupiter.api.Test;

import ejercicio1.Autor;

public class LibroTest {
    @Test
    void testLibro() {
        Autor autor = new Autor("1", "de Cervantes", "Miguel", "InstitutoX");
        Libro libro = new Libro("El Quijote", 1605, 0, autor, "Anaya", "Madrid");
        assert libro.getTitulo().equals("El Quijote");
        assert libro.getAnho() == 1605;
        assert libro.getEditorial().equals("Anaya");
        assert libro.getLugar().equals("Madrid");
    }
}
