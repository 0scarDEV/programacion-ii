package ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void testSumarDos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void testSumarTres() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3, 4);
        assertEquals(9, resultado);
    }

    @Test
    void testSumarDecimales() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(2.5, 3.5);
        assertEquals(6.0, resultado);
    }

    @Test
    void multiplicarEnteros() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    void multiplicarEnteroDecimal() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(2, 2.5);
        assertEquals(5.0, resultado);
    }

    @Test
    void descuentoPorcentual() {
        Calculadora calc = new Calculadora();
        double resultado = calc.getPrecioTrasDescuentoPorcentual(200.0, 10.0);
        assertEquals(180.0, resultado);
    }

    @Test
    void descuentoFijo() {
        Calculadora calc = new Calculadora();
        double resultado = calc.getPrecioTrasDescuentoFijo(200.0, 30);
        assertEquals(170.0, resultado);
    }
    
    @Test
    void descuentoFijoConTope() {
        Calculadora calc = new Calculadora();
        double resultado = calc.getPrecioTrasDescuentoFijo(200.0, 25.0, 20.0);
        assertEquals(160.0, resultado);
    }
}