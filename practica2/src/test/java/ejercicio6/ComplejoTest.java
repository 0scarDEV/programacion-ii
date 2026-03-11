package ejercicio6;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComplejoTest {
    @Test
    public void testSuma() {
        NumeroComplejo a = new NumeroComplejo(1, 2);
        NumeroComplejo b = new NumeroComplejo(3, 4);
        NumeroComplejo resultado = NumeroComplejo.suma(a, b);
        assertEquals(resultado.getpReal(), 4);
        assertEquals(resultado.getpImaginaria(), 6);
    }

    @Test
    public void testMultiplicacion() {
        NumeroComplejo c = new NumeroComplejo(2, 3);
        double d = 4;
        NumeroComplejo resultado = NumeroComplejo.multiplicacion(c, d);
        assertEquals(resultado.getpReal(), 8);
        assertEquals(resultado.getpImaginaria(), 12);
    }

    @Test
    public void testAbsValue() {
        NumeroComplejo e = new NumeroComplejo(-5, -6);
        NumeroComplejo resultado = e.getAbsValue();
        assertEquals(resultado.getpReal(), 5);
        assertEquals(resultado.getpImaginaria(), 6);
    }

    @Test
    public void testCERO() {
        assertEquals(NumeroComplejo.CERO.getpReal(), 0);
        assertEquals(NumeroComplejo.CERO.getpImaginaria(), 0);
    }

    @Test
    public void testUNO() {
        assertEquals(NumeroComplejo.UNO.getpReal(), 1);
        assertEquals(NumeroComplejo.UNO.getpImaginaria(), 0);
    }

    @Test
    public void testI() {
        assertEquals(NumeroComplejo.I.getpReal(), 0);
        assertEquals(NumeroComplejo.I.getpImaginaria(), 1);
    }

    @Test
    public void testReal() {
        NumeroComplejo real = NumeroComplejo.real(5);
        assertEquals(real.getpReal(), 5);
        assertEquals(real.getpImaginaria(), 0);
    }

    @Test
    public void testImaginario() {
        NumeroComplejo imaginario = NumeroComplejo.imaginario(7);
        assertEquals(imaginario.getpReal(), 0);
        assertEquals(imaginario.getpImaginaria(), 7);
    }
}
