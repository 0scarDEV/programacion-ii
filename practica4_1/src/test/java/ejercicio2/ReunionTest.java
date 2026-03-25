package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

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
        Empleado secretario = new Empleado("Juan Perez", "juan.perez@empresa.com");
        Empleado asistente = new Empleado("Maria Lopez", "maria.lopez@empresa.com");
        ArrayList<Empleado> asistentes = new ArrayList<>();
        asistentes.add(secretario);
        asistentes.add(asistente);

        Reunion reunion = new Reunion(
            asunto, lugar, fecha, horaCelebracion, 
            asistentes, secretario
        );

        assertEquals(reunion.getAsunto(), asunto);
        assertEquals(reunion.getLugar(), lugar);
        assertSame(reunion.getFecha(), fecha);
        assertSame(reunion.getHoraCelebracion(), horaCelebracion);
        assertSame(reunion.getAsistentes(), asistentes);
        assertSame(reunion.getSecretario(), secretario);
    }

    @Test
    public void testReunionEliminandoSecretario() {
        String asunto = "Reunion de trabajo";
        String lugar = "Sala de conferencias";
        Fecha fecha = new Fecha(15, 6, 2024);
        Hora horaCelebracion = new Hora(9, 0);
        Empleado secretario = new Empleado("Juan Perez", "juan.perez@empresa.com");
        Empleado asistente1 = new Empleado("Maria Lopez", "maria.lopez@empresa.com");
        Empleado asistente2 = new Empleado("Carlos Gomez", "carlos.gomez@empresa.com");
        ArrayList<Empleado> asistentes = new ArrayList<>();
        asistentes.add(secretario);
        asistentes.add(asistente1);
        asistentes.add(asistente2);

        Reunion reunion = new Reunion(
            asunto, lugar, fecha, horaCelebracion,
            asistentes, secretario
        );

        assertThrows(IllegalArgumentException.class, () -> {
            reunion.eliminarAsistente(secretario);
        });
    }

    @Test
    public void testReunionSecretarioUnNoAsistente() {
        String asunto = "Reunion de trabajo";
        String lugar = "Sala de conferencias";
        Fecha fecha = new Fecha(15, 6, 2024);
        Hora horaCelebracion = new Hora(9, 0);
        Empleado noAsistente = new Empleado("Juan Perez", "juan.perez@empresa.com");
        Empleado asistente1 = new Empleado("Maria Lopez", "maria.lopez@empresa.com");
        Empleado asistente2 = new Empleado("Carlos Gomez", "carlos.gomez@empresa.com");
        ArrayList<Empleado> asistentes = new ArrayList<>();
        asistentes.add(asistente1);
        asistentes.add(asistente2);

        Reunion reunion = new Reunion(
            asunto, lugar, fecha, horaCelebracion,
            asistentes, asistente1
        );

        assertThrows(IllegalArgumentException.class, () -> {
            reunion.setSecretario(noAsistente);
        });
    }
}
