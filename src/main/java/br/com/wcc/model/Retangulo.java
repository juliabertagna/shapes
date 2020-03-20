package br.com.wcc.model;

import java.math.BigDecimal;

public class Retangulo implements Shape {
    private static final BigDecimal DOIS = new BigDecimal("2");

    private final BigDecimal base;
    private final BigDecimal altura;

    public Retangulo(BigDecimal base, BigDecimal altura) {
        if (base == null || base.compareTo(BigDecimal.ZERO) <= 0 || altura == null || altura.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Raio não pode ser nulo");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public BigDecimal getPerimetro() {
        return DOIS.multiply(base.add(altura)).round(MATH_CONTEXT);
    }

    @Override
    public BigDecimal getArea() {
        return base.multiply(altura).round(MATH_CONTEXT);
    }
}