package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test void reversesWord() { assertEquals("olleh", ReverseString.reverse("hello")); }
    @Test void emptyStringRemainsEmpty() { assertEquals("", ReverseString.reverse("")); }
}
