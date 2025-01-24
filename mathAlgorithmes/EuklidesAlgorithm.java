package org.example.mathAlgorithmes;

public class EuklidesAlgorithm {
    public static void main(String[] args) {
        /*
        If we want to calculate the greatest common multiply, we have to multiple a * b and then divide it
        by the smallest common divisor
         */
        System.out.println("Euklides Algorithm");
        int a = 48, b = 180;
        System.out.println("a: " + a + "\nb: " + b);
        System.out.println("    Smallest common divisor: " + nwd(a,b));
        System.out.println("    Greatest common multiply: " + a*b / nwd(a,b));
    }

    //recursive implementation
    public static int nwd(int a, int b) {
        int change = a % b;
        if (change != 0){
            a = b;
            b = change;
            return nwd(a, b);
        }
        return b;
    }

    //iteration implementation
    public static int nwdIteration(int a, int b){
        while (b != 0){
            int temp = a % b;
            b = a;
            a = temp;
        }
        return a;
    }
}
