package ejercicio3;

import ejercicio2.TipoReserva;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class MainReservas {

    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = scanner.nextLine();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduzca un número entero.");
            }
        }
    }

    private static TipoReserva leerTipoReserva(Scanner scanner) {
        TipoReserva[] valores = TipoReserva.values();
        System.out.println("Tipos de reserva disponibles:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("  " + i + ". " + valores[i] + " (señal: " + valores[i].getSenalRequerida() + " €)");
        }
        while (true) {
            int opcion = leerEntero(scanner, "Seleccione tipo de reserva (0-" + (valores.length - 1) + "): ");
            if (opcion >= 0 && opcion < valores.length) {
                return valores[opcion];
            }
            System.out.println("Opción no válida. Introduzca un número entre 0 y " + (valores.length - 1) + ".");
        }
    }

    // COMPLETAR: hacer robusto este método: capturar los errores de validación,
    // mostrar su mensaje al usuario y repetir la lectura hasta que los datos sean
    // válidos
    private static Reserva leerReserva(Scanner scanner) {
        boolean flagReservaValida = true;

        do {
            System.out.print("Localizador: ");
            String localizador = scanner.nextLine();

            System.out.print("Nombre del cliente: ");
            String nombreCliente = scanner.nextLine();

            double deposito = 0.0;
            while (true) {
                System.out.print("Depósito: ");
                String lineaDeposito = scanner.nextLine();
                try {
                    deposito = Double.parseDouble(lineaDeposito);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Depósito no válido. Introduzca un número decimal.");
                }
            }

            TipoReserva tipo = leerTipoReserva(scanner);
            try {
                return new Reserva(localizador, nombreCliente, deposito, tipo);
            } catch (IllegalArgumentException e) {
                flagReservaValida = false;
                System.out.println("No se ha podido crear una reserva, error: " + e.getMessage());
            }
        } while (!flagReservaValida);

        return null;
    }

    public static void main(String[] args) {
        OperadorFichero operadorFichero = new OperadorFichero(Path.of("reservas.txt"));

        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            Reserva reserva = leerReserva(scanner);
            // Agregar el toString() de la reserva al fichero mediante operadorFichero.
            try {
                operadorFichero.agregarLinea(reserva.toString());
            } catch (IOException e) { // Si se produce un error de entrada/salida, el error debe interrumpir el programa
                // mostrando al usuario un mensaje amigable (p.ej: "se ha producido un error de entrada/salida: <descripcion>")
                // con la descripción del error contenida en la excepción (sin mostrar la traza).
                System.err.println("Se ha producido un error de entrada/salida: <" + e.getMessage() + ">");
                // Es decir, no se deberán seguir pidiendo más reservas.
                break;
            }
            System.out.println("Reserva creada: " + reserva);
            System.out.print("¿Desea añadir otra reserva? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        scanner.close();
    }
}
