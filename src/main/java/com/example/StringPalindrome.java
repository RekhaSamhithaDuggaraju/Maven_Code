package com.example;

public class StringPalindrome {
    public static boolean isPalindrome(String text) {
        String normalized = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return normalized.equals(new StringBuilder(normalized).reverse().toString());
    }
}
