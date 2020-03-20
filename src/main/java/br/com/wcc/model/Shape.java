package br.com.wcc.model;

import java.math.BigDecimal;
import java.math.MathContext;

public interface Shape {
        MathContext MATH_CONTEXT = new MathContext(4);

        BigDecimal getPerimetro();
        BigDecimal getArea();
}