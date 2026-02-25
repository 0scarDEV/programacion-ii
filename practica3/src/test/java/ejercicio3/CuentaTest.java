package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CuentaTest {
    @Test
    public void testCuentaSaldoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Cuenta(-100));
    }
    
    @Test
    public void testIngresarCantidadNegativa() {
        Cuenta cuenta = new Cuenta(100);
        assertThrows(IllegalArgumentException.class, () -> cuenta.ingresar(-50));
    }

    @Test
    public void testRetirarCantidadNegativa() {
        Cuenta cuenta = new Cuenta(100);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(-50));
    }

    @Test
    public void testRetirarCantidadMayorQueSaldo() {
        Cuenta cuenta = new Cuenta(100);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(150));
    }
}
