package ejercicio3;

import ejercicio2.TipoReserva;

public class Reserva {
    // Atributos estáticos
    private static int totalReservas = 0;
    // Atributos
    private String localizador;
    private String nombreCliente;
    private double deposito;
    private TipoReserva tipo;

    public Reserva(String localizador, String nombreCliente, double deposito, TipoReserva tipo) {
        // localizador y nombreCliente no pueden ser null ni vacíos; lanza IllegalArgumentException si lo son
        if (localizador == null || localizador.equals(""))
            throw new IllegalArgumentException("El localizador no debe ser nulo o vacío");
        // La comprobacion para nombreCliente está en el Setter, evitamos duplicidad código.
        // deposito debe ser >= 0.0; lanza IllegalArgumentException si no lo es
        if (deposito <= 0.0)
            throw new IllegalArgumentException("El deposito debe ser >= 0.0");
        // tipo no puede ser null; lanza IllegalArgumentException si lo es
        if (tipo == null)
            throw new IllegalArgumentException("El tipo de reserva no debe ser nulo.");

        this.localizador = localizador; 
        setNombreCliente(nombreCliente);
        this.deposito = deposito;
        this.tipo = tipo;
        totalReservas++;
    }

    // nombreCliente no puede ser null ni vacío; lanza IllegalArgumentException si lo es
    public void setNombreCliente(String nombreCliente) {
        if (nombreCliente == null || nombreCliente.equals(""))
        {
            throw new IllegalArgumentException("El nombre de cliente no debe ser nulo o vacío");
        }
        this.nombreCliente = nombreCliente;
    }

    public String getLocalizador() {return localizador;}
    public String getNombreCliente() {return nombreCliente;}
    public double getDeposito() {return deposito;}
    public TipoReserva getTipo() {return tipo;}

    public static int getTotalReservas() {return totalReservas;}

    // Calcula el depósito después de descontar la señal requerida del tipo de reserva
    public double depositoNetoFinal() {
        return deposito - tipo.getSenalRequerida();
    }

    // Ejemplo: "Reserva[RES001] María Pérez (GRUPO) - 100.0 €"
    @Override
    public String toString() {
        return "RESERVA[" + localizador + "] " + nombreCliente + " (" + tipo + ") - " + deposito + " €";
    }
}
