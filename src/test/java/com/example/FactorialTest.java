package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test void factorialOfFive() { assertEquals(120, Factorial.calculate(5)); }
    @Test void factorialOfZero() { assertEquals(1, Factorial.calculate(0)); }
    @Test void rejectsNegativeInput() { assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-1)); }
}
