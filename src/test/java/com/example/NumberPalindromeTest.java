package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {
    @Test void recognizes121AsPalindrome() { assertTrue(NumberPalindrome.isPalindrome(121)); }
    @Test void recognizes123AsNonPalindrome() { assertFalse(NumberPalindrome.isPalindrome(123)); }
    @Test void negativeIsNotPalindrome() { assertFalse(NumberPalindrome.isPalindrome(-121)); }
}
