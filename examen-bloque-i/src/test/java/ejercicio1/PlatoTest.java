package ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlatoTest {
    @Test
    public void PlatoConstructorTest() {
        Plato plato = new Plato("Bocadillo", 1, 2.95);
        assertEquals(plato.getNombre(), "Bocadillo");
        assertEquals(plato.getRaciones(), 1);
        assertEquals(plato.getPrecio(), 2.95);;
    }

    @Test
    public void PlatoTapaTest() {
        Plato tapa = Plato.tapa("Serranito");
        assertEquals(tapa.esCaro(), false);
    }
}
