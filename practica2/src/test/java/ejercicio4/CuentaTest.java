package ejercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {
    @Test
    public void testIngresarDinero() {
        Cuenta cuenta = new Cuenta();
        cuenta.ingresar(100);
        Assertions.assertEquals(cuenta.getSaldo(), 100);
    }

    @Test
    public void testRetirarDinero() {
        Cuenta cuenta = new Cuenta(200);
        cuenta.retirar(100);
        Assertions.assertEquals(cuenta.getSaldo(), 100);
    }
}
