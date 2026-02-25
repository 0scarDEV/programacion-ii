package ejercicio2;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Path;
import java.util.Scanner;

public class AplicacionFichero {
    public static void main(String[] args) {
        System.out.println("Indica la ruta al fichero a operar: ");
        Scanner entrada = new Scanner(System.in);
        String rutaFichero = entrada.nextLine();

        Path fichero = Path.of(rutaFichero);
        OperadorFichero operadorFichero = new OperadorFichero(fichero);

        System.out.println("Contenidos del fichero: " + fichero);

        try {
            System.out.println(operadorFichero.leerFichero());
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }

        String linea = null;
        do {
            System.out.println("Añadamos una línea al fichero (linea vacía si quieres terminar): ");
            linea = entrada.nextLine().trim();
            if (linea.length() > 0) {
                try {
                    operadorFichero.añadirTexto(linea + "\n");
                    System.out.println("Línea añadida");
                } catch (AccessDeniedException e) {
                    System.out.println("No tienes permisos para escribir en el fichero: " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("Error al añadir texto al fichero: " + e.getMessage());
                }
            }

        } while (linea.length() > 0);
        entrada.close();

        System.out.println("Contenidos del fichero: " + fichero);
        try {
            System.out.println(operadorFichero.leerFichero());
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }

        System.out.println("Que tengas un buen día");
    }
}