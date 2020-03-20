package br.com.wcc.model;

import java.math.BigDecimal;

public class Circulo implements Shape {
    private static final BigDecimal PI = BigDecimal.valueOf(Math.PI);
    private static final BigDecimal DOIS = new BigDecimal("2");

    private final BigDecimal raio;

    public Circulo(BigDecimal raio) {
        if (raio == null || raio.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Raio não pode ser nulo");
        }

        this.raio = raio;
    }

    @Override
    public BigDecimal getPerimetro() {
        return DOIS
                .multiply(PI)
                .multiply(raio)
                .round(MATH_CONTEXT);
    }

    @Override
    public BigDecimal getArea() {
        return PI.multiply(raio.pow(2)).round(MATH_CONTEXT);
    }
}