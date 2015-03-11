package com.codaconsultancy.sandbox.euler;

// Print all primes under 1000

public class PrimeNumbers {

    public static void main(String[] args) {

        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int number) {
        boolean prime = false;
        for (int i = 2; i < number; i++) {
            if (number % i != 0) {
                prime = true;
            } else {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
