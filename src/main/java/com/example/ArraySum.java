package com.example;

public class ArraySum {
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
