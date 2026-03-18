package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TipoReservaTest {

    @Test
    void testSenalNormal() {
        assertEquals(0.0, TipoReserva.NORMAL.getSenalRequerida(), 0.001);
    }

    @Test
    void testSenalGrupo() {
        assertEquals(10.0, TipoReserva.GRUPO.getSenalRequerida(), 0.001);
    }

    @Test
    void testSenalExclusiva() {
        assertEquals(50.0, TipoReserva.EXCLUSIVA.getSenalRequerida(), 0.001);
    }
}
