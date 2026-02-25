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
}
