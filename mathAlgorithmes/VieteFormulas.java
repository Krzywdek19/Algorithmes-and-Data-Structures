package org.example.mathAlgorithmes;

import org.example.mathAlgorithmes.mathUtils.Binomial;
import org.example.mathAlgorithmes.mathUtils.MathUtils;
import org.example.mathAlgorithmes.mathUtils.QuadraticEquationRoots;

public class VieteFormulas {
    public static QuadraticEquationRoots vieteQuadraticEquation(Binomial binomial){
        long a,b,c;
        long x1,x2;
        int[][] divisors;
        a = binomial.getTerm('a');
        b = binomial.getTerm('b');
        c = binomial.getTerm('c');

        if((c/a)%2!=0 ||  b/a%2!=0){
            throw new ArithmeticException();
        }
        long firstVieteFormulaResult = c/a;
        long secondVieteFormulaResult = -(b /a);

        divisors = new int[MathUtils.countDivisors(firstVieteFormulaResult)][2];
        MathUtils.findNumbersWithProduct(firstVieteFormulaResult,divisors);

        for (int[] divisor : divisors) {
            x1 = divisor[0];
            x2 = divisor[1];
            if (x1 + x2 == secondVieteFormulaResult) {
                return new QuadraticEquationRoots(x1, x2);
            }
        }
        throw new ArithmeticException();
    }
}
