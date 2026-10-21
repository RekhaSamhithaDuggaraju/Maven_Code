package com.example;

public class ArrayMaximum {
    public static int findMax(int[] values) {
        if (values == null || values.length == 0)
            throw new IllegalArgumentException("array must not be empty");
        int max = values[0];
        for (int value : values) if (value > max) max = value;
        return max;
    }
}
