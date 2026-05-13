package examen.base;

public abstract class Profesor {
    private String nombre;
    private String email;
    private int horasMaximas;

    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public int getHorasMaximas() {
        return horasMaximas;
    }

    @Override
    public String toString() {
        return "Profesor [" + nombre + ", " + email + "]";
    }
}
