package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        long n = sc.nextLong();
        sc.close();

        if (n <= 1) {
            System.out.println(n + " no es primo.");
        } else {
            boolean esPrimo = true;
            for (long i = 2; i <= n / i; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo)
                System.out.println(n + " es primo.");
            else
                System.out.println(n + " no es primo.");
        }
    }
}
