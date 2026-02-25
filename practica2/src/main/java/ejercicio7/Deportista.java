package ejercicio7;

public class Deportista {
    public enum Categoria {BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR}

    private String dni;
    private String nombre;
    private Categoria categoria;

    public Deportista(String dni, String nombre, Categoria categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Categoria: " + categoria;
    }
}
