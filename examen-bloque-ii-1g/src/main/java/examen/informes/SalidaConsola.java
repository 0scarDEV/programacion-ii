package examen.informes;

import java.io.IOException;

public class SalidaConsola implements Salida {
    @Override
    public void escribir(String texto) throws IOException {
        System.out.println(texto);
    }
}
