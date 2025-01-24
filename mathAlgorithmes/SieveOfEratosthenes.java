package org.example.mathAlgorithmes;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        eratosthenesSieve(36);
    }

    public static void isPrime(int n){
        if(n <= 1){
            System.out.println(n + " is not prime!");
        }
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0 && i != n){
                System.out.println(n + " is not prime!");
                return;
            }
        }
        System.out.println(n + " is prime!");
    }

    public static void eratosthenesSieve(int n){
        boolean [] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 0; i <= n; i++){
            if(isPrime[i]){
                System.out.println(i + " is prime!");
            }
        }
    }
}
