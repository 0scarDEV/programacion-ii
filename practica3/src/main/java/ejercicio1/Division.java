package ejercicio1;

import java.util.Scanner;

public class Division {
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("\nError: No se puede dividir por cero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String linea;
        boolean flag = false;

        do {
            System.out.print("\nIntroduzca dividendo: ");
            linea = sc.nextLine();
            try {
                num1 = Integer.parseInt(linea);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("\nError: Entrada no válida para el dividendo. Por favor, introduzca un número entero.");
                flag = false;
                continue;
            }

            System.out.print("\nIntroduzca divisor: ");
            linea = sc.nextLine();
            try {
                num2 = Integer.parseInt(linea);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("\nError: Entrada no válida para el divisor. Por favor, introduzca un número entero.");
                flag = false;
            }
        } while (!flag);
        System.out.println("\nEl resultado es: " + divide(num1, num2));

        sc.close();
    }
}