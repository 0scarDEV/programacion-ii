package ejercicio3;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se permiten ingresos negativos");
        }
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad < 0 || cantidad > saldo) {
            throw new IllegalArgumentException("No se permiten retiros negativos o mayores que el saldo");
        }
        saldo -= cantidad;
    }
}