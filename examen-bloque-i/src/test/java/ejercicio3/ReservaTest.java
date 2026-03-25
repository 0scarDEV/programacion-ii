package ejercicio3;

import ejercicio2.TipoReserva;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests para la clase Reserva.
//
// Se deben escribir tests que comprueben:
class ReservaTest {

    // 1. Que el constructor crea la reserva correctamente y los getters devuelven los valores esperados.
    @Test
    public void ReservaConstructorTest() {
        String localizador = "RES001";
        String nomCliente = "María Pérez";
        double deposito = 100;
        TipoReserva tipoReserva = TipoReserva.GRUPO;
        Reserva r = new Reserva(localizador, nomCliente, deposito, tipoReserva);
        assertEquals(r.getLocalizador(), localizador);
        assertEquals(r.getNombreCliente(), nomCliente);
        assertEquals(r.getDeposito(), deposito);
        assertEquals(r.getTipo(), tipoReserva);
    }

    // 2. Que el constructor lanza IllegalArgumentException con un localizador inválido (null o vacío).
    @Test
    public void ReservaLocalizadorInvalidoTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Reserva("", "María Pérez", 100, TipoReserva.NORMAL);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Reserva(null, "María Pérez", 100, TipoReserva.NORMAL);
        });
    }

    // 3. Que depositoNetoFinal() devuelve el depósito menos la señal requerida del tipo de reserva.
    @Test
    public void ReservaDepositoNetoTest() {
        double deposito = 100;
        TipoReserva tipoReserva = TipoReserva.GRUPO;
        Reserva r = new Reserva("RES001", "María Pérez", deposito, tipoReserva);

        assertEquals(r.depositoNetoFinal(), deposito - tipoReserva.getSenalRequerida());
    }
}
