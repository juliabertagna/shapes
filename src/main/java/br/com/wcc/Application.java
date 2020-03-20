package br.com.wcc;
import br.com.wcc.model.Circulo;
import br.com.wcc.model.Quadrado;
import br.com.wcc.model.Retangulo;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        System.out.println("Circulo 1");
        Circulo circulo = new Circulo(new BigDecimal("1"));
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Perimetro: " + circulo.getPerimetro());

        System.out.println("-----");

        System.out.println("Circulo 2");
        circulo = new Circulo(new BigDecimal("2"));
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Perimetro: " + circulo.getPerimetro());

        System.out.println("-----");

        System.out.println("Retangulo 1");
        Retangulo retangulo = new Retangulo(new BigDecimal("2"), new BigDecimal("4"));
        System.out.println("Area: " + retangulo.getArea());
        System.out.println("Perimetro: " + retangulo.getPerimetro());

        System.out.println("-----");

        System.out.println("Retangulo 2");
        retangulo = new Retangulo(new BigDecimal("1"), new BigDecimal("3"));
        System.out.println("Area: " + retangulo.getArea());
        System.out.println("Perimetro: " + retangulo.getPerimetro());

        System.out.println("-----");

        System.out.println("Quadrado");
        Quadrado quadrado = new Quadrado(new BigDecimal("4"));
        System.out.println("Area: " + quadrado.getArea());
        System.out.println("Perimetro: " + quadrado.getPerimetro());

        while (true) {
        }
    }
}