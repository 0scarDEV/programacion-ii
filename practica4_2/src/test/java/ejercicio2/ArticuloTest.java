package ejercicio2;

import org.junit.jupiter.api.Test;

public class ArticuloTest {
    @Test
    void testArticulo() {
        Articulo art = new Articulo("Titulo", 2005, "Mega", 2, 3, 4);
        assert art.getTitulo().equals("Titulo");
        assert art.getAnho() == 2005;
        assert art.getNombreRevista().equals("Mega");
        assert art.getVolumen() == 2;
        assert art.getPaginaInicial() == 3;
        assert art.getPaginaFinal() == 4;
    }
}
