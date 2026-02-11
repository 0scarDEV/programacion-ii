package ejercicio5;

public enum Operacion {
    SUMAR,
    RESTAR,
    MULTIPLICAR,
    DIVIDIR;

    public double aplicar(double a, double b) {
        switch (this) {
            case SUMAR:
                return a + b;
            case RESTAR:
                return a - b;
            case MULTIPLICAR:
                return a * b;
            case DIVIDIR:
                return b != 0 ? a / b : Double.NaN;
            default:
                return Double.NaN;
        }
    }
}
