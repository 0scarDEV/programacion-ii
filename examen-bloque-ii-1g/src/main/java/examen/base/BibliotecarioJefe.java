package examen.base;

// Ejercicio 2: hacer que esta clase sea un subtipo de Bibliotecario.
// Un BibliotecarioJefe tiene un máximo de 1400 horas si gestiona el fondo digital,
// o 1600 horas en caso contrario.
// Ejercicio 2: sobreescribir toString() para añadir el sufijo "[Jefe]".
public class BibliotecarioJefe extends Bibliotecario {
    private boolean gestionaFondoDigital;

    public BibliotecarioJefe(String nombre, String email, boolean gestionaFondoDigital) {
        super(nombre, email);
        this.gestionaFondoDigital = gestionaFondoDigital;
    }

    @Override
    public String toString() {
        return super.toString() + "[Jefe]";
    }

    @Override
    public int getHorasMaximas() {
        return gestionaFondoDigital ? 1400 : 1600;
    }
}
