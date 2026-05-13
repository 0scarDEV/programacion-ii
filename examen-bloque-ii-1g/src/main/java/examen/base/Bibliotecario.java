package examen.base;

public abstract class Bibliotecario {
    private String nombre;
    private String email;

    public Bibliotecario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public abstract int getHorasMaximas();

    @Override
    public String toString() {
        return "Bibliotecario[" + nombre + ", " + email + "]";
    }
}
