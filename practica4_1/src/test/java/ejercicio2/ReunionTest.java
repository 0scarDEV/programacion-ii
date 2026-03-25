package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import ejercicio1.Fecha;
import ejercicio1.Hora;

public class ReunionTest {
    @Test
    public void testReunionConstructor() {
        String asunto = "Reunion de trabajo";
        String lugar = "Sala de conferencias";
        Fecha fecha = new Fecha(15, 6, 2024);
        Hora horaCelebracion = new Hora(9, 0);

        Reunion reunion = new Reunion(asunto, lugar, fecha, horaCelebracion);
        
        assertEquals(reunion.getAsunto(), asunto);
        assertEquals(reunion.getLugar(), lugar);
        assertSame(reunion.getFecha(), fecha);
        assertSame(reunion.getHoraCelebracion(), horaCelebracion);
    }
}
