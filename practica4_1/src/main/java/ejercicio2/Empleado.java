package ejercicio2;

public class Empleado {
    private String nombre;
    private String email;

    public Empleado(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
