package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Deportista[] deportistas = new Deportista[5];
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 1 -> {
                    System.out.println("Añadir un nuevo deportista:");
                    addDeportista(deportistas, leerDeportista(sc));
                }
                case 2 -> {
                    System.out.println("Mostrar todos los deportistas:");
                    mostrarDeportistas(deportistas);
                }
                case 3 -> {
                    System.out.println("Introduce la posición del deportista: ");
                    int posicion = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    mostrarDeportista(deportistas, posicion);
                }
                case 4 -> {
                    System.out.println("Estadísticas:");
                    mostrarEstadisticas(deportistas);
                }
                case 5 -> {
                    System.out.println("Saliendo del programa...");
                    salir = true;
                }
                default -> {
                    System.out.println("Opción no válida, por favor elige una opción del 1 al 5.");
                }
            }
        }

        addDeportista(deportistas, leerDeportista(sc));
    }

    private static void mostrarEstadisticas(Deportista[] array) {
        int numDeportistas = 0;
        for (Deportista d : array) {
            if (d != null) {
                numDeportistas++;
            }
        }

        System.out.println("Hay " + numDeportistas + " deportistas registrados.");
        System.out.println("Quedan " + (array.length - numDeportistas) + " posiciones disponibles.");
    }

    private static void mostrarDeportista(Deportista[] array, int posicion) {
        if (posicion >= 0 && posicion < array.length) {
            if (array[posicion] != null) {
                System.out.println(array[posicion]);
            } else {
                System.out.println("No hay un deportista en esa posición.");
            }
        } else {
            System.out.println("Posición fuera de rango.");
        }
    }

    private static void mostrarDeportistas(Deportista[] array) {
        for (Deportista deportista : array) {
            if (deportista != null) {
                System.out.println(deportista);
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Añadir un nuevo deportista");
        System.out.println("2. Mostrar todos los deportistas");
        System.out.println("3. Buscar un deportista por posición en el array");
        System.out.println("4. Estadísticas");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    private static Deportista leerDeportista(Scanner sc) {
        System.out.println("Introduce el DNI del deportista:");
        String dni = sc.nextLine();
        System.out.println("Introduce el nombre del deportista:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la categoria del deportista (BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR):");
        String categoriaStr = sc.nextLine();
        Deportista.Categoria categoria = Deportista.Categoria.valueOf(categoriaStr.toUpperCase());
        return new Deportista(dni, nombre, categoria);
    }

    private static void addDeportista(Deportista[] array, Deportista deportista) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = deportista;
                return;
            }
        }
        System.out.println("No se ha podido añadir el deportista, el array está lleno.");
    }
}
