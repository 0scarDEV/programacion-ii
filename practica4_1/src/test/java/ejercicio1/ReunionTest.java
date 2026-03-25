package ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;;

public class ReunionTest {
    @Test
    public void testReunionConstructor() {
        String asunto = "Reunion de trabajo";
        String lugar = "Sala de conferencias";
        Fecha fecha = new Fecha(15, 6, 2024);
        Hora horaCelebracion = new Hora(9, 0);

        Reunion reunion = new Reunion(
            asunto, lugar, 
            fecha.getAnho(), fecha.getMes(), fecha.getDia(), 
            horaCelebracion.getHora(), horaCelebracion.getMinuto()
        );
        
        assertEquals(reunion.getAsunto(), asunto);
        assertEquals(reunion.getLugar(), lugar);
        assertEquals(reunion.getFecha().getDia(), fecha.getDia());
        assertEquals(reunion.getFecha().getMes(), fecha.getMes());
        assertEquals(reunion.getFecha().getAnho(), fecha.getAnho());
        assertEquals(reunion.getHoraCelebracion().getHora(), horaCelebracion.getHora());
        assertEquals(reunion.getHoraCelebracion().getMinuto(), horaCelebracion.getMinuto());
    }
}
