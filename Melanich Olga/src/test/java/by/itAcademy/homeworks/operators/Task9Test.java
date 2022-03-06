package by.itAcademy.homeworks.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void isLeapYearTest() {
        int leapYear = 2000;
        int notLeapYear = 2022;

        boolean shouldBeTrue = Task9.isLeapYear(leapYear);
        boolean shouldBeFalse = Task9.isLeapYear(notLeapYear);

        assertTrue(shouldBeTrue);
        assertFalse(shouldBeFalse);
    }

    @Test
    void getNextDayDateTest() {
        String expectedResult = "1.1.2022";
        String expectedResult1 = "1.3.2022";
        String expectedResult2 = "29.2.2020";
        String expectedResult3 = "1.6.2015";
        String expectedResult4 = "5.11.2017";

        String actualResult = Task9.getNextDayDate(31, 12, 2021);
        String actualResult1 = Task9.getNextDayDate(28, 2, 2022);
        String actualResult2 = Task9.getNextDayDate(28, 2, 2020);
        String actualResult3 = Task9.getNextDayDate(31, 5, 2015);
        String actualResult4 = Task9.getNextDayDate(4, 11, 2017);

        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
        assertEquals(expectedResult3, expectedResult3);
        assertEquals(expectedResult4, actualResult4);
    }
}