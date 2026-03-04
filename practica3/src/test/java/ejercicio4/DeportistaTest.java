package ejercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeportistaTest {
    @Test
    public void testDeportistaEdadNegativa() {
        try {
            new Deportista("12345678A", "Juan", -5);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("La edad no puede ser negativa", e.getMessage());
        }
    }

    @Test
    public void testDeportistaBenjamin() {
        Deportista deportista = new Deportista("12345678A", "Juan", 8);
        Assertions.assertEquals(Deportista.Categoria.BENJAMIN, deportista.getCategoria());
    }

    @Test
    public void testDeportistaAlevin() {
        Deportista deportista = new Deportista("12345678A", "Juan", 10);
        Assertions.assertEquals(Deportista.Categoria.ALEVIN, deportista.getCategoria());
    }

    @Test
    public void testDeportistaInfantil() {
        Deportista deportista = new Deportista("12345678A", "Juan", 12);
        Assertions.assertEquals(Deportista.Categoria.INFANTIL, deportista.getCategoria());
    }

    @Test
    public void testDeportistaCadete() {
        Deportista deportista = new Deportista("12345678A", "Juan", 14);
        Assertions.assertEquals(Deportista.Categoria.CADETE, deportista.getCategoria());
    }

    @Test
    public void testDeportistaJuvenil() {
        Deportista deportista = new Deportista("12345678A", "Juan", 18);
        Assertions.assertEquals(Deportista.Categoria.JUVENIL, deportista.getCategoria());
    }

    @Test
    public void testDeportistaSenior() {
        Deportista deportista = new Deportista("12345678A", "Juan", 19);
        Assertions.assertEquals(Deportista.Categoria.SENIOR, deportista.getCategoria());
    }
}
