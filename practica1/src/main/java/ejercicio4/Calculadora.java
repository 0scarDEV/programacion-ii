package ejercicio4;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(int a, double b) {
        return a * b;
    }

    public double getPrecioTrasDescuentoPorcentual(double precio, double porcentajeDescuento) {
        double descuentoAplicado = precio * porcentajeDescuento / 100;
        return precio - descuentoAplicado;
    }

    public double getPrecioTrasDescuentoFijo(double precio, double descuentoFijo) {
        return precio - descuentoFijo;
    }

    public double getPrecioTrasDescuentoFijo(double precio, double porcentajeDescuento, double descuentoMaximo) {
        if (porcentajeDescuento > descuentoMaximo) {
            porcentajeDescuento = descuentoMaximo;
        }
        double descuentoAplicado = precio * porcentajeDescuento / 100;
        return precio - descuentoAplicado;
    }
}
