package ejercicio2;

import java.util.List;
import java.util.Scanner;

public class ProgramaRefactor {
    private final List<Operacion> operaciones;
    private final Scanner scanner = new Scanner(System.in);

    // Recibe las operaciones por constructor (Inyección de dependencias)
    public ProgramaRefactor(List<Operacion> operaciones) {
        this.operaciones = operaciones;
    }

    public void iniciar() {
        int opcion = 0;
        int salirOpcion = operaciones.size() + 1;

        while (opcion != salirOpcion) {
            mostrarMenu(salirOpcion);
            opcion = leerEntero();

            if (opcion >= 1 && opcion <= operaciones.size()) {
                // Polimorfismo: se ejecuta la operación correspondiente
                operaciones.get(opcion - 1).ejecutar();
            } else if (opcion == salirOpcion) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    private void mostrarMenu(int salirOpcion) {
        System.out.println("\n--- Menú ---");
        for (int i = 0; i < operaciones.size(); i++) {
            System.out.println((i + 1) + ". " + operaciones.get(i).visualizarMenu());
        }
        System.out.println(salirOpcion + ". Salir");
        System.out.print("Elige una opción: ");
    }

    private int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Por favor, introduce un número: ");
            }
        }
    }
}