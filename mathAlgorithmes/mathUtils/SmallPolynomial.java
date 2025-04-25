package org.example.mathAlgorithmes.mathUtils;


public class SmallPolynomial {
    private long[] terms;
    private int size;

    public SmallPolynomial(long... terms) {
        if (terms.length > 10) {
            throw new IllegalArgumentException("Too many terms - max is 10, use Polynomial instead");
        }
        this.terms = terms.clone();
        this.size = terms.length;
    }

    public long getTerm(char termIndex) {
        return terms[getIndex(termIndex)];
    }

    public void setTerm(char termIndex, long value) {
        short index = getIndex(termIndex);
        terms[index] = value;
    }

    private short getIndex(char termIndex) {
        if (termIndex < 'a' || termIndex >= 'a' + size) {
            throw new IllegalArgumentException("Invalid term index: " + termIndex);
        }
        return (short)(termIndex - 'a');
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            long coeff = terms[i];
            int degree = size - i - 1;

            if (coeff == 0) continue;

            if (!sb.isEmpty() && coeff > 0) sb.append(" + ");
            else if (coeff < 0) sb.append(" - ");

            sb.append(Math.abs(coeff)).append("x^").append(degree);
        }
        return sb.toString();
    }
}