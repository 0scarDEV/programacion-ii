package ejercicio4;

public class Deportista {
    public enum Categoria {
        BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR;

        public static Categoria fromEdad(int edad) {
            if (edad <= 8) {
                return BENJAMIN;
            } else if (edad <= 10) {
                return ALEVIN;
            } else if (edad <= 12) {
                return INFANTIL;
            } else if (edad <= 14) {
                return CADETE;
            } else if (edad <= 18) {
                return JUVENIL;
            }
            return SENIOR;
        }
    }

    private String dni;
    private String nombre;
    private int edad;
    private Categoria categoria;

    public Deportista(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
        this.categoria = Categoria.fromEdad(edad);
    }

    public String getDni() {return dni;}
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public Categoria getCategoria() {
        // Como Deportista es inmutable, la categoría se asigna en el constructor y no cambia
        // categoria = Categoria.fromEdad(edad);
        return categoria;
    }
}
