package br.com.wcc.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class RetanguloTest {
    @Test(expected = IllegalArgumentException.class)
    public void testaRetanguloBaseNull() {
        new Retangulo(null, new BigDecimal("2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaRetanguloAlturaNull() {
        new Retangulo(new BigDecimal("2"), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaRetanguloBaseNegativa() {
        mockRetangulo("-100", "100");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaRetanguloAlturaNegativa() {
        mockRetangulo("100", "-100");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaCRetanguloBaseZero() {
        mockRetangulo("0.000", "10");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaCRetanguloAlturaZero() {
        mockRetangulo("10", "0.000");
    }

    @Test
    public void testaPerimetro() {
        Retangulo retangulo = mockRetangulo("100", "10");

        final BigDecimal resultado = retangulo.getPerimetro();

        assertNotNull(resultado);
        assertEquals(criarValorEsperado("220"), resultado);
    }

    @Test
    public void testaArea() {
        Retangulo retangulo = mockRetangulo("100", "10");

        final BigDecimal resultado = retangulo.getArea();

        assertNotNull(resultado);
        assertEquals(criarValorEsperado("1000"), resultado);
    }

    private Retangulo mockRetangulo(String base, String altura) {
        return new Retangulo(new BigDecimal(base), new BigDecimal(altura));
    }

    private BigDecimal criarValorEsperado(String valor) {
        return new BigDecimal(valor).round(Shape.MATH_CONTEXT);
    }

}