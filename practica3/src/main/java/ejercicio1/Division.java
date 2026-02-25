package ejercicio1;

import java.util.Scanner;

public class Division {
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("\nError: No se puede dividir por cero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        String linea;
        Scanner scan = new Scanner(System.in);
        boolean flagDividendo = false;
        boolean flagDivisor = false;

        do {
            System.out.print("\nIntroduzca dividendo: ");
            linea = scan.nextLine();
            try {
                num1 = Integer.parseInt(linea);
                flagDividendo = true;
            } catch (NumberFormatException e) {
                System.out.println("\nError: Entrada no válida. Por favor, introduzca un número entero.");
            }
        } while (!flagDividendo);

        do {
            System.out.print("\nIntroduzca divisor: ");
            linea = scan.nextLine();
            try {
                num2 = Integer.parseInt(linea);
                flagDivisor = true;
            } catch (NumberFormatException e) {
                System.out.println("\nError: Entrada no válida. Por favor, introduzca un número entero.");
            }
        } while (!flagDivisor);

        System.out.println("\nEl resultado es: " + divide(num1, num2));

        scan.close();
    }
}