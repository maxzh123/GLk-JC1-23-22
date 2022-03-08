import by.itAcademy.homeworks.operators.Task9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test9 {

    @Test
    public void Test1() {
        int leapYear = 2016;
        int notLeapYear = 2022;

        boolean leapYearTrue = Task9.isLeapYear(leapYear);
        boolean leapYearFalse = Task9.isLeapYear(notLeapYear);

        assertTrue(leapYearTrue);
        assertFalse(leapYearFalse);
    }

    @Test
    public void Test2() {
        String expectedResult = "1/1/2022";
        String expectedResult1 = "1/3/2020";
        String expectedResult2 = "29/2/2020";
        String expectedResult3 = "1/6/2021";
        String expectedResult4 = "5/10/2021";

        String actualResult = Task9.nextDayData(31, 12, 2021);
        String actualResult1 = Task9.nextDayData(29, 2, 2020);
        String actualResult2 = Task9.nextDayData(28, 2, 2020);
        String actualResult3 = Task9.nextDayData(31, 5, 2021);
        String actualResult4 = Task9.nextDayData(4, 10, 2021);

        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
        assertEquals(expectedResult3, actualResult3);
        assertEquals(expectedResult4, actualResult4);
    }

}
