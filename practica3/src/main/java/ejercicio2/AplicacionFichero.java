package ejercicio2;

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
    
        System.out.println(operadorFichero.leerFichero());
    
        String linea = null;
        do {
            System.out.println("Añadamos una línea al fichero (linea vacía si quieres terminar): ");
            linea = entrada.nextLine().trim();
            if (linea.length() > 0) {
                operadorFichero.añadirTexto(linea + "\n");
                System.out.println("Línea añadida");
            }
    
        } while (linea.length() > 0);
    
        System.out.println("Contenidos del fichero: " + fichero);
        System.out.println(operadorFichero.leerFichero());
    
        System.out.println("Que tengas un buen día");

    }
}