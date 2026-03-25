package ejercicio2;
import java.util.ArrayList;

import ejercicio1.Fecha;
import ejercicio1.Hora;

public class Reunion {
    private String asunto;
    private String lugar;
    private Fecha fecha;
    private Hora horaCelebracion;
    private ArrayList<Empleado> asistentes;

    public Reunion(String asunto, String lugar, Fecha fecha, Hora horaCelebracion, ArrayList<Empleado> asistentes) {
        setAsunto(asunto);
        setLugar(lugar);
        
        // Composición débil
        setFecha(fecha);
        setHoraCelebracion(horaCelebracion);
        setAsistentes(asistentes);
    }

    // Getters
    public String getAsunto() { return asunto; }
    public String getLugar() { return lugar; }
    public Fecha getFecha() { return fecha; }       // Composición débil
    public Hora getHoraCelebracion() { return horaCelebracion; }    // Composición débil
    public ArrayList<Empleado> getAsistentes() { return asistentes; }   // Composición débil

    // Setters
    public void setAsunto(String asunto) { this.asunto = asunto; }
    public void setLugar(String lugar) { this.lugar = lugar; }
    public void setFecha(Fecha fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        this.fecha = fecha;
    }
    public void setHoraCelebracion(Hora horaCelebracion) {
        if (horaCelebracion == null) {
            throw new IllegalArgumentException("La hora de celebración no puede ser nula");
        }
        this.horaCelebracion = horaCelebracion;
    }
    public void setAsistentes(ArrayList<Empleado> asistentes) {
        if (asistentes == null) {
            throw new IllegalArgumentException("La lista de asistentes no puede ser nula");
        }
        if (asistentes.size() < 2) {
            throw new IllegalArgumentException("Debe haber al menos dos asistentes");
        }
        this.asistentes = asistentes;  // Composición débil
    }

    // Asistentes
    public void agregarAsistente(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        asistentes.add(empleado);
    }
    public void eliminarAsistente(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        if (!asistentes.contains(empleado)) {
            throw new IllegalArgumentException("El empleado no es un asistente");
        }
        asistentes.remove(empleado);
    }
    public int getNumAsistentes() {
        return asistentes.size();
    } 
    public Empleado getAsistentePorPosicion(int index) {
        if (index < 0 || index >= asistentes.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return asistentes.get(index);
    }
}
