package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestOfThreeTest {
    @Test void largestIsFound() { assertEquals(9, LargestOfThree.findLargest(4, 9, 2)); }
    @Test void handlesNegativeNumbers() { assertEquals(-1, LargestOfThree.findLargest(-5, -1, -3)); }
}
