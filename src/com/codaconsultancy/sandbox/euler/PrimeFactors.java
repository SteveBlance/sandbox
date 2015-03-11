package com.codaconsultancy.sandbox.euler;

//  The prime factors of 13195 are 5, 7, 13 and 29.
//  What is the largest prime factor of the number 600851475143 ?

public class PrimeFactors {
    public static void main(String[] args) {
        long max = 317584931803L;
        for (int i = 2; i <= max / i; i++) {
            while (max % i == 0) {
                max /= i;
            }
        }
        System.out.println(max);
    }
}