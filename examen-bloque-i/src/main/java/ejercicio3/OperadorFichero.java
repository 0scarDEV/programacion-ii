package ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class OperadorFichero {
    private Path fichero;

    public OperadorFichero(Path fichero) {
        if (!Files.exists(fichero)) {
            throw new IllegalArgumentException("El fichero no existe: " + fichero);
        }
        this.fichero = fichero;
    }

    public void agregarLinea(String linea) throws IOException {
        Files.write(this.fichero, (linea + "\n").getBytes(), StandardOpenOption.APPEND);
    }
}
