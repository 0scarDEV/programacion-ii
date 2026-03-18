package ejercicio1;

public class Plato {
    // Atributos
    private String nombre;
    private int raciones;
    private double precio;

    // Constructores
    public Plato(String nombre, double precio) {
        this(nombre, 2, precio);
    }

    public Plato(String nombre, int raciones, double precio) {
        this.nombre = nombre;
        this.raciones = raciones;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {return nombre;}
    public int getRaciones() {return raciones;}
    public double getPrecio() {return precio;}
    
    // Métodos
    public double precioConDescuento(double porcentaje) {
        return this.precio - (this.precio * porcentaje/100);
    }
    
    public boolean esCaro() {
        return precio > 25.0;
    }

    @Override
    public String toString() {
        return nombre + " (" + raciones + " raciones) - " + precio + " €";
    }

    // Métodos factoría
    public static Plato tapa(String nombre) {
        return new Plato(nombre, 1, 3.5);
    }

    public static Plato especialidad(String nombre) {
        return new Plato(nombre, 4, 35.0);
    }
}
