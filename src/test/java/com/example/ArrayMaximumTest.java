package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaximumTest {
    @Test void findsMaximum() { assertEquals(9, ArrayMaximum.findMax(new int[]{2, 9, 4})); }
    @Test void handlesAllNegativeValues() { assertEquals(-2, ArrayMaximum.findMax(new int[]{-5, -2, -9})); }
    @Test void rejectsEmptyArray() { assertThrows(IllegalArgumentException.class, () -> ArrayMaximum.findMax(new int[]{})); }
}
