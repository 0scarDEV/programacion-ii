package examen.base;

public class ProfesorTitular extends Profesor {
    private boolean dirigeProyectos;

    @Override
    public int getHorasMaximas() {
        return dirigeProyectos ? 200 : 240;
    }

    @Override
    public String toString() {
        return super.toString() + "[Titular]";
    }
}
