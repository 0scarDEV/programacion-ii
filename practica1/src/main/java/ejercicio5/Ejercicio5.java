package ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo(5, 50.0, 5.0);
        System.out.println("Autonomía del coche: " + coche.getKmAutonomia() + " km");

        double combustibleDisponible = 20.0; // litros
        System.out.println("Kilómetros con " + combustibleDisponible + " litros de combustible: " +
                coche.getKmConCombustible(combustibleDisponible) + " km");
    }
}
