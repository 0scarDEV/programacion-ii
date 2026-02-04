package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero:");
        int numero = sc.nextInt();
        sc.close();
        darCaracteristicas(numero);
    }

    public static void darCaracteristicas(int numero) {
        if (esPar(numero)) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número impar.");
        }

        if (esCero(numero)) {
            System.out.println("Número cero.");
        } else {
            System.out.println("Número distinto de cero.");
        }

        if (esElevado(numero)) {
            System.out.println("Número elevado.");
        } else {
            System.out.println("Número bajo.");
        }
    }

    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    private static boolean esCero(int numero) {
        return numero == 0;
    }

    private static boolean esElevado(int numero) {
        return numero > 100;
    }
}
