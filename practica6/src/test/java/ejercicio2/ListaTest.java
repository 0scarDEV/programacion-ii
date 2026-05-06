package ejercicio2;

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
}
