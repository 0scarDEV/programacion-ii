package ejercicio1;

import org.junit.jupiter.api.Test;

public class ReunionTest {
    @Test 
    public void testReunionConstructor() {
        String asunto = "Reunion de trabajo";
        String lugar = "Sala de conferencias";
        Fecha fecha = new Fecha(15, 6, 2024);
        Hora horaCelebracion = new Hora(9, 0);

        Reunion reunion = new Reunion(asunto, lugar, fecha, horaCelebracion);
        assert reunion.getAsunto().equals(asunto);
        assert reunion.getLugar().equals(lugar);
        assert reunion.getFecha().equals(fecha);
        assert reunion.getHoraCelebracion().equals(horaCelebracion);
    }
}
