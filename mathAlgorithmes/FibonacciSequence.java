package org.example.mathAlgorithmes;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("10th element of fibonacci sequence");
        System.out.println(fibonacciSequenceRecursive(10));
        System.out.println(fibonacciSequenceIterative(10));
    }

    public static int fibonacciSequenceRecursive(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacciSequenceRecursive(n - 1) + fibonacciSequenceRecursive(n - 2);
    }

    public static int fibonacciSequenceIterative(int n) {
        int fibonacci = 0;
        int x1 = 1;
        int x2 = 1;
        for (int i = 3; i <= n; i++) {
            fibonacci = x1 + x2;
            x1 = x2;
            x2 = fibonacci;
        }
        return fibonacci;
    }
}
