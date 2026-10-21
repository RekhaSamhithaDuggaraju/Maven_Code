package com.example;

public class StudentGrade {
    public static String grade(double mark) {
        if (mark < 0 || mark > 100) throw new IllegalArgumentException("mark must be 0..100");
        if (mark >= 90) return "A";
        if (mark >= 80) return "B";
        if (mark >= 70) return "C";
        if (mark >= 60) return "D";
        return "F";
    }
}
