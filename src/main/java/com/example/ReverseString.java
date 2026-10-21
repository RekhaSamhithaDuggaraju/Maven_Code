package com.example;

public class ReverseString {
    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
