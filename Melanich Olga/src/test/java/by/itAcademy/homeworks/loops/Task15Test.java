package by.itAcademy.homeworks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
    void findSecondPrimeNumberTest1() {
        int expectedResult = 17;
        int actualResult = Task15.findSecondPrimeNumber(12, 20);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void findSecondPrimeNumberTest2() {
        int expectedResult = 103;
        int actualResult = Task15.findSecondPrimeNumber(100, 130);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void isPrimeTest1() {
        int number = 50;
        boolean shouldBeFalse = Task15.isPrime(number);
        assertFalse(shouldBeFalse);
    }

    @Test
    void isPrimeTest2() {
        int number = 53;
        boolean shouldBeTrue = Task15.isPrime(number);
        assertTrue(shouldBeTrue);
    }
}