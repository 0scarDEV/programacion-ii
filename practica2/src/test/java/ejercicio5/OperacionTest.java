package ejercicio5;

import org.junit.jupiter.api.Test;

public class OperacionTest {
    @Test
    public void testSuma() {
        assert Operacion.SUMAR.aplicar(2, 3) == 5;
    }

    @Test
    public void testResta() {
        assert Operacion.RESTAR.aplicar(5, 2) == 3;
    }

    @Test
    public void testMultiplicacion() {
        assert Operacion.MULTIPLICAR.aplicar(4, 3) == 12;
    }

    @Test
    public void testDivision() {
        assert Operacion.DIVIDIR.aplicar(10, 2) == 5;
        assert Double.isNaN(Operacion.DIVIDIR.aplicar(10, 0));
    }  
}