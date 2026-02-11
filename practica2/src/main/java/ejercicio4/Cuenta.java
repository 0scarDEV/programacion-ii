package ejercicio4;

public class Cuenta {
    private double saldo;
    
    public Cuenta() {
        this(0);
    }

    public Cuenta(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }

    /* Como se debería hacer
    public boolean ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }
        return false;
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    } */

    // La jaimitada del System.exit(1).
    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Error: cantidad no válida.");
            System.exit(1);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Error: cantidad no válida o saldo insuficiente.");
            System.exit(1);
        }
    }
}
