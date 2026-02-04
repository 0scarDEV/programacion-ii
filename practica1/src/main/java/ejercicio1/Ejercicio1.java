package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Punto punto = new Punto(5, 10);
        System.out.println("La distancia al origen desde el punto " + punto + " es: " + punto.calcularDistanciaAlOrigen());
    }
}