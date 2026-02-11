package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        LibroConTipo[] libros = new LibroConTipo[4];
        libros[0] = new LibroConTipo("El Quijote", "Miguel de Cervantes", "Editorial A", TipoLibro.NOVELA, 1605, "1234567890");
        libros[1] = new LibroConTipo("Cien años de soledad", "Gabriel  García Márquez", "Editorial B", TipoLibro.HISTORIA, 1967, "0987654321");
        libros[2] = new LibroConTipo("La sombra del viento", "Carlos Ruiz Zafón", "Editorial C", TipoLibro.TECNOLOGIA, 2001, "1122334455");

        System.out.println("Mostramos los libros completos: ");
        for (LibroConTipo libro : libros) {
            if (libro != null) {
                System.out.println("-----------------------------");
                System.out.println(libro);
            }
        }

        Scanner sc = new Scanner(System.in);
        libros[3] = crearLibroDesdeConsola(sc);
        sc.close();

        System.out.println("Mostramos los libros por título: ");
        for (LibroConTipo libro : libros) {
            System.out.println("\t" + libro.getTitulo());
        }
    }

    // Estáticos
    static LibroConTipo crearLibroDesdeConsola(Scanner scanner) {
        System.out.print("Introduce el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce los autores: ");
        String autores = scanner.nextLine();

        System.out.print("Introduce la editorial: ");
        String editorial = scanner.nextLine();

        System.out.print("Introduce el tipo de libro: ");
        String tipo = scanner.nextLine();
        TipoLibro tipoLibro = TipoLibro.valueOf(tipo.toUpperCase());

        System.out.print("Introduce el año de edición: ");
        int anho = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduce el ISBN: ");
        String isbn = scanner.nextLine();

        return new LibroConTipo(titulo, autores, editorial, tipoLibro, anho, isbn);
    }
}
