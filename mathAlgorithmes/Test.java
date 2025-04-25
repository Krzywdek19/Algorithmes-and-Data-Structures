package org.example.mathAlgorithmes;

import org.example.mathAlgorithmes.mathUtils.Binomial;

public class Test {
    public static void main(String[] args) {
        Binomial binomial = new Binomial(1,-6,8);
        System.out.println(binomial);
        System.out.println(VieteFormulas.vieteQuadraticEquation(binomial));
    }
}
