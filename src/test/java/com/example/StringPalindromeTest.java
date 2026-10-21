package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {
    @Test void recognizesPalindrome() { assertTrue(StringPalindrome.isPalindrome("Madam")); }
    @Test void rejectsNonPalindrome() { assertFalse(StringPalindrome.isPalindrome("Hello")); }
    @Test void ignoresSpacesAndPunctuation() { assertTrue(StringPalindrome.isPalindrome("A man, a plan, a canal: Panama")); }
}
