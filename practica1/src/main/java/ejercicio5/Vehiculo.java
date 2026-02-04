package ejercicio5;

public class Vehiculo {
    int numMaxPasajeros;
    double capacidadDeposito;
    double consumoMedio;

    public Vehiculo(int numMaxPasajeros, double capacidadDeposito, double consumoMedio) {
        this.numMaxPasajeros = numMaxPasajeros;
        this.capacidadDeposito = capacidadDeposito;
        this.consumoMedio = consumoMedio;
    }

    public double getKmAutonomia() {
        return (capacidadDeposito / consumoMedio) * 100;
    }

    public double getKmConCombustible(double cantidadCombustible) {
        return (cantidadCombustible / consumoMedio) * 100;
    }
}
