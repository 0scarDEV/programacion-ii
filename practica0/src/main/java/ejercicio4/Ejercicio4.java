package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        char op = sc.next().charAt(0);
        System.out.println("Introduce un número real: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce un número real: ");
        double num2 = sc.nextDouble();
        sc.close();

        double result = switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("La división no puede realizarse porque el divisor es cero");
                    yield Double.NaN;
                } else yield num1 / num2;
            }
            default -> {
                System.out.println("Opción incorrecta.");
                yield Double.NaN;
            }
        };

        System.out.println("El resultado de " + num1 + op + num2 + " es " + result);
    }
}
