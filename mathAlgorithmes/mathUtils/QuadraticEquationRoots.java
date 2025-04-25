package org.example.mathAlgorithmes.mathUtils;

public class QuadraticEquationRoots {
    private long x1;
    private long x2;

    public QuadraticEquationRoots(long x1, long x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public long getX1() {
        return x1;
    }

    public void setX1(long x1) {
        this.x1 = x1;
    }

    public long getX2() {
        return x2;
    }

    public void setX2(long x2) {
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "x1=" + x1 + ", x2=" + x2;

    }
}
