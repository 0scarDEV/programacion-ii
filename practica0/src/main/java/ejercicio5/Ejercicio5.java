package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número para calcular los n primeros pares: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i*2;
        }
        System.out.println("La suma de los " + n + " primeros números pares es: " + suma);
    }
}
