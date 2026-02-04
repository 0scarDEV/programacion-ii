package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        var num1 = 5;
        var num2 = 2;
        var num0 = 0;

        System.out.println("Suma de " + num1 + " y " + num2 + " es: " + suma(num1, num2));
        System.out.println("Resta de " + num1 + " y " + num2 + " es: " + resta(num1, num2));
        System.out.println("Multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion(num1, num2));
        System.out.println("División de " + num1 + " y " + num2 + " es: " + division(num1, num2));
        System.out.println("División de " + num1 + " y " + num0 + " es: " + division(num1, num0));
    }

    public static int suma(int n1, int n2) {
        return n1 + n2;
    }

    public static int resta(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    public static double division(int n1, int n2) {
        if (n2 == 0) return 0;
        return (double) n1 / n2;
    }
}