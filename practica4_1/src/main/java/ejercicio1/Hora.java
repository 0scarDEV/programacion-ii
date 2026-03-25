package ejercicio1;

public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        this.hora = hora;
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }
        this.minuto = minuto;
    }
    
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
}
