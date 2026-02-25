package ejercicio5;

public enum Operacion {
    SUMAR,
    RESTAR,
    MULTIPLICAR,
    DIVIDIR;

    public double aplicar(double a, double b) {
        return switch (this) {
            case SUMAR -> a + b;
            case RESTAR -> a - b;
            case MULTIPLICAR -> a * b;
            case DIVIDIR -> b != 0 ? a / b : Double.NaN;
        };
    }
}
