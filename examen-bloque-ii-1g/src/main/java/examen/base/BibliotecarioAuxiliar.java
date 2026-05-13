package examen.base;

// Ejercicio 2: hacer que esta clase sea un subtipo de Bibliotecario.
// Un BibliotecarioAuxiliar tiene un máximo de 1700 horas si trabaja en turno
// de tarde, o 1500 horas en caso contrario.
// Ejercicio 2: sobreescribir toString() para añadir el sufijo "[Auxiliar]".
public class BibliotecarioAuxiliar extends Bibliotecario {
    private boolean turnoDeTarde;

    public BibliotecarioAuxiliar(String nombre, String email, boolean turnoDeTarde) {
        super(nombre, email);
        this.turnoDeTarde = turnoDeTarde;
    }

    @Override
    public int getHorasMaximas() {
        return turnoDeTarde ? 1700 : 1500;
    }

    @Override
    public String toString() {
        return super.toString() + "[Auxiliar]";
    }
}
