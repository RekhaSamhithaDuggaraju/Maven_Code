package com.example;

public class CountVowels {
    public static int count(String text) {
        int total = 0;
        for (char ch : text.toLowerCase().toCharArray())
            if ("aeiou".indexOf(ch) >= 0) total++;
        return total;
    }
}
