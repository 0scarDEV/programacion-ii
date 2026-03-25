package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class TrenTest {
    @Test
    public void testTren() {
        Vagon vCoru = new Vagon(null, null);
        Vagon vLugo = new Vagon(vCoru, null);
        vCoru.setVagonSiguiente(vLugo);
        Vagon vOurense = new Vagon(vLugo, null);
        vLugo.setVagonSiguiente(vOurense);
        Vagon vPonte = new Vagon(vOurense, null);
        vOurense.setVagonSiguiente(vPonte);
        Tren tren = new Tren(100, vCoru);

        Vagon v1 = tren.getPrimerVagon();
        assertSame(v1, vCoru);
        Vagon v2 = v1.getVagonSiguiente();
        assertSame(v2, vLugo);
        Vagon v3 = v2.getVagonSiguiente();
        assertSame(v3, vOurense);
        Vagon v4 = v3.getVagonSiguiente();
        assertSame(v4, vPonte);
    }

    @Test
    public void testNumVagones() {
        Vagon vCoru = new Vagon(null, null);
        Vagon vLugo = new Vagon(vCoru, null);
        vCoru.setVagonSiguiente(vLugo);
        Vagon vOurense = new Vagon(vLugo, null);
        vLugo.setVagonSiguiente(vOurense);
        Vagon vPonte = new Vagon(vOurense, null);
        vOurense.setVagonSiguiente(vPonte);
        Tren tren = new Tren(100, vCoru);

        assertEquals(tren.getNumVagones(), 4);
    }
}
