package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {
    @Test void reversesPositiveNumber() { assertEquals(4321, ReverseNumber.reverse(1234)); }
    @Test void preservesNegativeSign() { assertEquals(-321, ReverseNumber.reverse(-123)); }
    @Test void handlesTrailingZeros() { assertEquals(21, ReverseNumber.reverse(1200)); }
}
