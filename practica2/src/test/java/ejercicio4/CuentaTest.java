package ejercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {
    @Test
    public void testIngresarDinero() {
        Cuenta cuenta = new Cuenta();
        boolean resultado = cuenta.ingresar(100);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void testRetirarDinero() {
        Cuenta cuenta = new Cuenta(200);
        boolean resultado = cuenta.retirar(100);
        Assertions.assertTrue(resultado);
    }
}
