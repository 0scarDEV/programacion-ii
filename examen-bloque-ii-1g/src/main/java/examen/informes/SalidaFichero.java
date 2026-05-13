package examen.informes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SalidaFichero implements Salida {
    private File fichero; 

    public SalidaFichero(File fichero) {
        this.fichero = fichero;
    }

    @Override
    public void escribir(String texto) throws IOException {
        PrintWriter pw = new PrintWriter(fichero);
        pw.println(texto);
        pw.close();
    }

}
