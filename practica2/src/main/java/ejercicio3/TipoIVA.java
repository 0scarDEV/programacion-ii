package ejercicio3;

public enum TipoIVA {
    GENERAL(0.21),
    REDUCIDO(0.10),
    SUPERREDUCIDO(0.04),
    EXENTO(0.0);

    private final double porcentaje;

    TipoIVA(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarIVA(double precioBase) {
        return precioBase * (1 + porcentaje);
    }
}
