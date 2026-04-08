package ejercicio2;

import org.junit.jupiter.api.Test;

public class LibroTest {
    @Test
    void testLibro() {
        Libro libro = new Libro("El Quijote", 1605, "Anaya", "Madrid");
        assert libro.getTitulo().equals("El Quijote");
        assert libro.getAnho() == 1605;
        assert libro.getEditorial().equals("Anaya");
        assert libro.getLugar().equals("Madrid");
    }
}
