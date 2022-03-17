package by.itAcademy.homeworks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void calculateSumTest() {
        int expectedNumber1 = 1;
        int expectedNumber2 = 17;

        int actualNumber1 = Task14.calculateSum(1000);
        int actualNumber2 = Task14.calculateSum(476);

        assertEquals(expectedNumber1, actualNumber1);
        assertEquals(expectedNumber2, actualNumber2);
    }
}