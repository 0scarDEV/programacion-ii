package examen.base;

public class ProfesorAyudante extends Profesor {
    private boolean tieneTesis;

    @Override
    public int getHorasMaximas() {
        return tieneTesis ? 120 : 80;
    }

    @Override
    public String toString() {
        return super.toString() + "[Ayudante]";
    }

    

}
