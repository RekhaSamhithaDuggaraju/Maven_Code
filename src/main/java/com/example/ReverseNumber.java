package com.example;

public class ReverseNumber {
    public static int reverse(int n) {
        long value = Math.abs((long) n), result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        if (n < 0) result = -result;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
            throw new ArithmeticException("reversed number overflows int");
        return (int) result;
    }
}
