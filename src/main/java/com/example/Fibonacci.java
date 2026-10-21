package com.example;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> sequence(int count) {
        if (count < 0) throw new IllegalArgumentException("count must be non-negative");
        List<Integer> values = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            values.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return values;
    }
}
