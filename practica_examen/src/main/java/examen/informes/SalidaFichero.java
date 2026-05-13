package examen.informes;

import java.io.File;
import java.io.IOException;

public class SalidaFichero implements Salida {
    private File fichero;

    public SalidaFichero(File fichero) {
        this.fichero = fichero;
    }

    @Override
    public void escribir(String texto) throws IOException {
        // Implementación para escribir en un fichero
    }

}
