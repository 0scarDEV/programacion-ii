package ejercicio5;
import org.junit.jupiter.api.Test;

import ejercicio2.OperadorFichero;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class OperadorFicheroTest {

    @Test
    void constructor_conFicheroExistente_noLanzaExcepcion() throws IOException {
        Path tempPath = Files.createTempFile("fichero-", ".txt");

        assertDoesNotThrow(() -> new OperadorFichero(tempPath));

        Files.delete(tempPath);
    }

    @Test
    void constructor_conFicheroInexistente_lanzaIllegalArgumentException() {
        Path pathInexistente = Path.of("fichero-que-no-existe.txt");

        assertThrows(IllegalArgumentException.class,
                () -> new OperadorFichero(pathInexistente));
    }

    @Test
    void añadirTexto_y_leerFichero_funcionaCorrectamente() throws IOException {
        Path tempPath = Files.createTempFile("fichero-", ".txt");

        OperadorFichero operador = new OperadorFichero(tempPath);

        operador.añadirTexto("Hola");
        operador.añadirTexto(" Mundo");

        String contenido = operador.leerFichero();

        assertEquals("Hola Mundo", contenido);

        Files.delete(tempPath);
    }

    @Test
    void leerFicheroVacio_devuelveCadenaVacia() throws IOException {
        Path tempPath = Files.createTempFile("fichero-", ".txt");

        OperadorFichero operador = new OperadorFichero(tempPath);

        String contenido = operador.leerFichero();

        assertEquals("", contenido);

        Files.delete(tempPath);
    }

    @Test
    void leerFicheroEliminado_lanzaIOException() throws IOException {
        Path tempPath = Files.createTempFile("fichero-", ".txt");

        OperadorFichero operador = new OperadorFichero(tempPath);

        Files.delete(tempPath);

        assertThrows(IOException.class, operador::leerFichero);
    }

    @Test
    void añadirTextoAFicheroEliminado_lanzaIOException() throws IOException {
        Path tempPath = Files.createTempFile("fichero-", ".txt");

        OperadorFichero operador = new OperadorFichero(tempPath);

        Files.delete(tempPath);

        assertThrows(IOException.class,
                () -> operador.añadirTexto("Texto"));
    }

    @Test
    void añadirTexto_acumulaContenido() throws IOException {
        Path tempPath = Files.createTempFile("fichero-", ".txt");

        OperadorFichero operador = new OperadorFichero(tempPath);

        operador.añadirTexto("Linea1\n");
        operador.añadirTexto("Linea2\n");

        String contenido = operador.leerFichero();

        assertEquals("Linea1\nLinea2\n", contenido);

        Files.delete(tempPath);
    }
}