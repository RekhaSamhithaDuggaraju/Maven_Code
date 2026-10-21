package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {
    @Test void sumsValues() { assertEquals(10, ArraySum.sum(new int[]{1, 2, 3, 4})); }
    @Test void emptyArraySumsToZero() { assertEquals(0, ArraySum.sum(new int[]{})); }
    @Test void handlesNegativeValues() { assertEquals(0, ArraySum.sum(new int[]{-2, 2})); }
}
