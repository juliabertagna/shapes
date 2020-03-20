package br.com.wcc.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CirculoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testaCirculoRaioNull() {
        new Circulo(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaCirculoRaioNegativo() {
        mockCirculo("-100");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaCirculoRaioZero() {
        mockCirculo("0.000");
    }

    @Test
    public void testaPerimetro() {
        Circulo circulo = mockCirculo("100");

        final BigDecimal resultado = circulo.getPerimetro();

        assertNotNull(resultado);
        assertEquals(criarValorEsperado("628.3"), resultado);
    }

    @Test
    public void testaArea() {
        Circulo circulo = mockCirculo("100");

        final BigDecimal resultado = circulo.getArea();

        assertNotNull(resultado);
        assertEquals(criarValorEsperado("31415.92653"), resultado);
    }

    private Circulo mockCirculo(String valor) {
        return new Circulo(new BigDecimal(valor));
    }

    private BigDecimal criarValorEsperado(String valor) {
        return new BigDecimal(valor).round(Shape.MATH_CONTEXT);
    }
}