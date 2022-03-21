package by.itAcademy.homeworks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void calculateFactorialTest() {
        int expectedFactorial1 = 1;
        int expectedFactorial0 = 1;
        int expectedFactorial6 = 720;

        int actualFactorial1 = Task12.calculateFactorial(1);
        int actualFactorial0 = Task12.calculateFactorial(0);
        int actualFactorial6 = Task12.calculateFactorial(6);

        assertEquals(expectedFactorial1, actualFactorial1);
        assertEquals(expectedFactorial0, actualFactorial0);
        assertEquals(expectedFactorial6, actualFactorial6);

    }
}