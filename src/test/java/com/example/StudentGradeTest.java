package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {
    @Test void givesAForNinety() { assertEquals("A", StudentGrade.grade(90)); }
    @Test void givesBForEightyFive() { assertEquals("B", StudentGrade.grade(85)); }
    @Test void givesFForLowMark() { assertEquals("F", StudentGrade.grade(45)); }
    @Test void rejectsMarkAboveHundred() { assertThrows(IllegalArgumentException.class, () -> StudentGrade.grade(101)); }
}
