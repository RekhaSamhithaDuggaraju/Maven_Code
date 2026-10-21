package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test void sevenIsPrime() { assertTrue(PrimeNumber.isPrime(7)); }
    @Test void nineIsNotPrime() { assertFalse(PrimeNumber.isPrime(9)); }
    @Test void oneIsNotPrime() { assertFalse(PrimeNumber.isPrime(1)); }
}
