package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test void firstSixValues() { assertEquals(List.of(0, 1, 1, 2, 3, 5), Fibonacci.sequence(6)); }
    @Test void zeroCountIsEmpty() { assertTrue(Fibonacci.sequence(0).isEmpty()); }
}
