package ejercicio2;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Path;
import java.util.Scanner;

public class AplicacionFichero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String rutaFichero;
        Path fichero;
        OperadorFichero operadorFichero = null;

        System.out.println("Indica la ruta al fichero a operar: ");
        // Crear
        do {
            rutaFichero = entrada.nextLine().trim();
            fichero = Path.of(rutaFichero);
            try {
                operadorFichero = new OperadorFichero(fichero);
            } catch (IllegalArgumentException e) {
                System.out.print("El fichero no existe, inténtalo de nuevo o introduce otra ruta: ");
            }
        } while (operadorFichero == null);

        try {
            // Leer
            System.out.println("Contenidos del fichero: " + fichero);
            System.out.println(operadorFichero.leerFichero());

            // Escribir
            String linea = null;
            do {
                System.out.println("Añadamos una línea al fichero (linea vacía si quieres terminar): ");
                linea = entrada.nextLine().trim();
                if (linea.length() > 0) {

                    operadorFichero.añadirTexto(linea + "\n");
                    System.out.println("Línea añadida");

                }

            } while (linea.length() > 0);

            // Leer de nuevo
            System.out.println("Contenidos del fichero: " + fichero);
            System.out.println(operadorFichero.leerFichero());

        } catch (AccessDeniedException e) {
            System.out.println("No tienes permisos para escribir en el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al escribir o leer en el fichero: " + e.getMessage());
        } finally {
            entrada.close();
            System.out.println("Que tengas un buen día");
        }

    }
}