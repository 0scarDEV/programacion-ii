package ejercicio1;

public class Fecha {
    private int dia;
    private int mes;
    private int anho;

    public Fecha(int dia, int mes, int anho) {
        this.anho = anho;
        setMes(mes);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnho() {
        return anho;
    }

    private void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes inválido: " + mes);
        }
        this.mes = mes;
    }

    private void setDia(int dia) {
        int diasEnMes = diasDelMes(this.mes, this.anho);
        if (dia < 1 || dia > diasEnMes) {
            throw new IllegalArgumentException("Día inválido: " + dia + " para el mes: " + this.mes + " y año: " + this.anho);
        }
        this.dia = dia;
    }

    private int diasDelMes(int mes, int anio) {
        return switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> esBisiesto(anio) ? 29 : 28;
            default -> throw new IllegalArgumentException("Mes inválido: " + mes);
        };
    }

    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
