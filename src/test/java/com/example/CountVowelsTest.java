package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountVowelsTest {
    @Test void countsVowelsIgnoringCase() { assertEquals(5, CountVowels.count("AEiou")); }
    @Test void noVowelsGivesZero() { assertEquals(0, CountVowels.count("rhythm")); }
    @Test void countsRepeatedVowels() { assertEquals(5, CountVowels.count("bookkeeper")); }
}
