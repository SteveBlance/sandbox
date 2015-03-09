package com.codaconsultancy.sandbox.euler;

public class ThreeAndFive {

    //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //Find the sum of all the multiples of 3 or 5 below 1000.

    public static void main(String[] args) {
        long sumOfMultiples = 0;
        for (int i = 0; i < 1000; i++) {
            if (isMultipleOfThreeOrFive(i)) {
                sumOfMultiples += i;
            }
        }
        System.out.println("Sum of multiples is: " + sumOfMultiples);
    }

    private static boolean isMultipleOfThreeOrFive(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }
}
