package ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
    
public class OperadorFichero {
    private Path fichero;
    
    public OperadorFichero(Path fichero) {
        // TODO: Controlemos aqui si el fichero no existe
        this.fichero = fichero;
    }
    
    public String leerFichero() throws IOException {
        return new String(Files.readAllBytes(this.fichero));
    }
    
    public void añadirTexto(String texto) throws IOException {
        Files.write(this.fichero, texto.getBytes(), StandardOpenOption.APPEND);
    }
}