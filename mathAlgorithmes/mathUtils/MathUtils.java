package org.example.mathAlgorithmes.mathUtils;

public class MathUtils {
    public static int countDivisors(long number) {
        int count = 0;
        for (long i = 1; i <= Math.sqrt(Math.abs(number)); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void findNumbersWithProduct(long product, int[][] result) {
        int arrayIterator = 0;

        for (long i = 1; i <= Math.sqrt(Math.abs(product)); i++) {
            if (product % i == 0) {
                long x1 = i;
                long x2 = product / i;
                result[arrayIterator++] = new int[]{(int)x1, (int)x2};

                if (x1 != x2) {
                    result[arrayIterator++] = new int[]{(int)(-x1), (int)(-x2)};
                }
            }
        }
    }
}
