package ejercicio1;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double calcularDistanciaAlOrigen() {
        double distancia = Math.sqrt(x * x + y * y);
        return distancia;
    }
}
