package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ListaTest {
    @Test
    void testParaCada() {
        Lista<String> lista = new Lista<>(10);
        lista.añadir("uno");
        lista.añadir("dos");
        lista.añadir("tres");

        StringBuilder resultado = new StringBuilder();
        lista.paraCada(s -> resultado.append(s).append(" "));

        assert resultado.toString().equals("uno dos tres ");
    }

    @Test
    void testExiste() {
        Lista<Integer> lista = new Lista<>(10);
        lista.añadir(1);
        lista.añadir(2);
        lista.añadir(300);
        lista.añadir(9999);

        assertTrue(lista.existe(i -> i > 100));
        assertFalse(lista.existe(i -> i > 10000));
    }

    @Test
    void testTransformar() {
        Lista<String> lista = new Lista<>(10);
        lista.añadir("uno");
        lista.añadir("dos");
        lista.añadir("tres");

        Lista<Integer> longitudes = lista.transformar(s -> s.length());

        assertEquals(3, longitudes.obtener(0));
        assertEquals(3, longitudes.obtener(1));
        assertEquals(4, longitudes.obtener(2));
    }
}
