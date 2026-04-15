package ejercicio2;
import java.util.Scanner;

public class Programa {

    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Saludar");
            System.out.println("2. ¿Qué día es hoy?");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = leerEntero();

            if (opcion == 1) {
                System.out.println("¡Hola! Bienvenido al programa.");
            } else if (opcion == 2) {
                System.out.println("Hoy es: " + java.time.LocalDate.now());
            } else if (opcion == 3) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
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