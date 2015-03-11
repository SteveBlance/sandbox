package com.codaconsultancy.sandbox.euler;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumbersTest {

    @Test
    public void testIsPrime() {

        Assert.assertFalse(PrimeNumbers.isPrime(1));
        Assert.assertFalse(PrimeNumbers.isPrime(2));
        Assert.assertTrue(PrimeNumbers.isPrime(3));
        Assert.assertFalse(PrimeNumbers.isPrime(4));
        Assert.assertTrue(PrimeNumbers.isPrime(5));
        Assert.assertFalse(PrimeNumbers.isPrime(6));
        Assert.assertTrue(PrimeNumbers.isPrime(7));
        Assert.assertFalse(PrimeNumbers.isPrime(10));
        Assert.assertTrue(PrimeNumbers.isPrime(11));

    }
}