package ejercicio2;
import ejercicio1.Fecha;
import ejercicio1.Hora;

public class Reunion {
    private String asunto;
    private String lugar;
    private Fecha fecha;
    private Hora horaCelebracion;

    public Reunion(String asunto, String lugar, Fecha fecha, Hora horaCelebracion) {
        setAsunto(asunto);
        setLugar(lugar);
        
        // Composición débil
        setFecha(fecha);
        setHoraCelebracion(horaCelebracion);
    }

    // Getters
    public String getAsunto() { return asunto; }
    public String getLugar() { return lugar; }
    public Fecha getFecha() {  // Composición débil
        return fecha;
    }
    public Hora getHoraCelebracion() {  // Composición débil
        return horaCelebracion;
    }

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
}
