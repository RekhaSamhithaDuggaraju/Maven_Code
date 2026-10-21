package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleInterestTest {
    @Test void calculatesInterest() { assertEquals(500.0, SimpleInterest.calculate(5000, 5, 2), 0.001); }
    @Test void zeroTimeGivesZero() { assertEquals(0.0, SimpleInterest.calculate(5000, 5, 0), 0.001); }
    @Test void rejectsNegativePrincipal() { assertThrows(IllegalArgumentException.class, () -> SimpleInterest.calculate(-1, 5, 2)); }
}
