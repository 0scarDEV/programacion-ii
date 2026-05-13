package examen.informes;

import examen.base.Biblioteca;

import java.io.IOException;
import java.util.List;

public class InformeBibliotecas {

    private List<Biblioteca> bibliotecas;

    public InformeBibliotecas(List<Biblioteca> bibliotecas) {
        this.bibliotecas = bibliotecas;
    }

    // Ejercicio 3: cambiar la cabecera de este método para que reciba
    // una instancia de Salida en lugar de un File, convirtiéndolo en:
    //     generarInforme(Salida salida) throws IOException
    // Adaptar el interior eliminando el if-else: usa el objeto salida para
    // escribir de forma polimórfica.
    public void generarInforme(Salida salida) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Biblioteca b : bibliotecas) {
            sb.append("Biblioteca: ").append(b.getNombre()).append("\n");
            for (int i = 0; i < b.getNumBibliotecarios(); i++) {
                sb.append("  ").append(b.getBibliotecario(i)).append("\n");
            }
            sb.append("  Total horas: ").append(b.getTotalHoras()).append("\n");
        }

        salida.escribir(sb.toString());
    }
}
