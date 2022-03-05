package by.itAcademy.homeworks.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void rubCorrectCaseTest() {
        String expectedStr1 = "рубль";
        String expectedStr2 = "рубля";
        String expectedStr3 = "рублей";

        String actualResult1 = Task8.rubCorrectCase(1);
        String actualResult2 = Task8.rubCorrectCase(2);
        String actualResult3 = Task8.rubCorrectCase(3);
        String actualResult4 = Task8.rubCorrectCase(4);
        String actualResult5 = Task8.rubCorrectCase(11);
        String actualResult6 = Task8.rubCorrectCase(20);

        assertEquals(expectedStr1, actualResult1);
        assertNotEquals(expectedStr2, actualResult1);
        assertEquals(expectedStr2, actualResult2);
        assertEquals(expectedStr2, actualResult3);
        assertEquals(expectedStr2, actualResult4);
        assertEquals(expectedStr3, actualResult5);
        assertEquals(expectedStr3, actualResult6);
    }
}