package ejercicio6;
import org.junit.jupiter.api.Test;

public class ComplejoTest {
    @Test
    public void testSuma() {
        NumeroComplejo a = new NumeroComplejo(1, 2);
        NumeroComplejo b = new NumeroComplejo(3, 4);
        NumeroComplejo resultado = NumeroComplejo.suma(a, b);
        assert resultado.getpReal() == 4;
        assert resultado.getpImaginaria() == 6;
    }

    @Test
    public void testMultiplicacion() {
        NumeroComplejo c = new NumeroComplejo(2, 3);
        double d = 4;
        NumeroComplejo resultado = NumeroComplejo.multiplicacion(c, d);
        assert resultado.getpReal() == 8;
        assert resultado.getpImaginaria() == 12;
    }

    @Test
    public void testAbsValue() {
        NumeroComplejo e = new NumeroComplejo(-5, -6);
        NumeroComplejo resultado = e.getAbsValue();
        assert resultado.getpReal() == 5;
        assert resultado.getpImaginaria() == 6;
    }

    @Test
    public void testCERO() {
        assert NumeroComplejo.CERO.getpReal() == 0;
        assert NumeroComplejo.CERO.getpImaginaria() == 0;
    }

    @Test
    public void testUNO() {
        assert NumeroComplejo.UNO.getpReal() == 1;
        assert NumeroComplejo.UNO.getpImaginaria() == 0;
    }

    @Test
    public void testI() {
        assert NumeroComplejo.I.getpReal() == 0;
        assert NumeroComplejo.I.getpImaginaria() == 1;
    }

    @Test
    public void testReal() {
        NumeroComplejo real = NumeroComplejo.real(5);
        assert real.getpReal() == 5;
        assert real.getpImaginaria() == 0;
    }

    @Test
    public void testImaginario() {
        NumeroComplejo imaginario = NumeroComplejo.imaginario(7);
        assert imaginario.getpReal() == 0;
        assert imaginario.getpImaginaria() == 7;
    }
}
