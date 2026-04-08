package ejercicio2;

import org.junit.jupiter.api.Test;

import ejercicio1.Autor;

public class ComunicacionEnCongresoTest {
    @Test
    void testComunicacionEnCongreso() {
        Autor autor = new Autor("1", "de Cervantes", "Miguel", "InstitutoX");
        ComunicacionEnCongreso com = new ComunicacionEnCongreso("Titulo", 2010, 0, autor, "CongresoX", "CiudadY", "PaisZ");
        assert com.getTitulo().equals("Titulo");
        assert com.getAnho() == 2010;
        assert com.getNombreCongreso().equals("CongresoX");
        assert com.getCiudad().equals("CiudadY");
        assert com.getPais().equals("PaisZ");
    }
}
