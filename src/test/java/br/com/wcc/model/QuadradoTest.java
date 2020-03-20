package br.com.wcc.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class QuadradoTest {
    @Test(expected = IllegalArgumentException.class)
    public void testaQuadradoLadoNull() {
        new Quadrado(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaQuadradoLadoNegativa() {
        mockQuadrado("-100");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaQuadradoLadoZero() {
        mockQuadrado("0.000");
    }

    @Test
    public void testaPerimetro() {
        Quadrado quadrado = mockQuadrado("100");

        final BigDecimal resultado = quadrado.getPerimetro();

        assertNotNull(resultado);
        assertEquals(criarValorEsperado("400"), resultado);
    }

    @Test
    public void testaArea() {
        Quadrado quadrado = mockQuadrado("100");

        final BigDecimal resultado = quadrado.getArea();

        assertNotNull(resultado);
        assertEquals(criarValorEsperado("10000"), resultado);
    }

    private Quadrado mockQuadrado(String lado) {
        return new Quadrado(new BigDecimal(lado));
    }

    private BigDecimal criarValorEsperado(String valor) {
        return new BigDecimal(valor).round(Shape.MATH_CONTEXT);
    }


}