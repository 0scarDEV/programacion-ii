package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Tarea 1 */
        Programa programa = new Programa();
        programa.iniciar();

        /* Tarea 2 */
        // Configuramos la lista de operaciones
        List<Operacion> misOperaciones = new ArrayList<>();
        misOperaciones.add(new OperacionSaludar());
        misOperaciones.add(new OperacionFecha());
        misOperaciones.add(new OperacionChiste()); // Añadir una nueva es tan fácil como esto

        // Se las pasamos al programa
        ProgramaRefactor program2 = new ProgramaRefactor(misOperaciones);
        program2.iniciar();
    }
}