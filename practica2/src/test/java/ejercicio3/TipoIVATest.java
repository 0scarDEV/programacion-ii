package ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ejercicio3.TipoIVA;

class TipoIVATest {
    @Test
    void generalDebeAplicar21PorCiento() {
        double resultado = TipoIVA.GENERAL.aplicarIVA(100.0);
        Assertions.assertEquals(121.0, resultado, 0.0001);
    }

    @Test
    void exentoNoDebeModificarPrecio() {
        double resultado = TipoIVA.EXENTO.aplicarIVA(100.0);
        Assertions.assertEquals(100.0, resultado, 0.0001);
    }
}
