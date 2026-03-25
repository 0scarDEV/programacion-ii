package ejercicio1;

public class Reunion {
    private String asunto;
    private String lugar;
    private Fecha fecha;
    private Hora horaCelebracion;

    public Reunion(String asunto, String lugar, int anho, int mes, int dia, int hora, int minuto) {
        setAsunto(asunto);
        setLugar(lugar);
        
        // Composición fuerte
        setFecha(new Fecha(dia, mes, anho));
        setHoraCelebracion(new Hora(hora, minuto));
    }

    // Getters
    public String getAsunto() { return asunto; }
    public String getLugar() { return lugar; }
    public Fecha getFecha() {  // Composición fuerte
        return new Fecha(fecha.getDia(), fecha.getMes(), fecha.getAnho()); 
    }
    public Hora getHoraCelebracion() {  // Composición fuerte
        return new Hora(horaCelebracion.getHora(), horaCelebracion.getMinuto()); 
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
