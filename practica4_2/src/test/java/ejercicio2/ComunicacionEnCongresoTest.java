package ejercicio2;

import org.junit.jupiter.api.Test;

public class ComunicacionEnCongresoTest {
    @Test
    void testComunicacionEnCongreso() {
        ComunicacionEnCongreso com = new ComunicacionEnCongreso("Titulo", 2010, "CongresoX", "CiudadY", "PaisZ");
        assert com.getTitulo().equals("Titulo");
        assert com.getAnho() == 2010;
        assert com.getNombreCongreso().equals("CongresoX");
        assert com.getCiudad().equals("CiudadY");
        assert com.getPais().equals("PaisZ");
    }
}
