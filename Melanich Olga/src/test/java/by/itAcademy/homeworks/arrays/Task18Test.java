package by.itAcademy.homeworks.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @Test
    void getLastElementArrayTest1() {
        int[] array = {1, 8, 98};
        int expectedResult = 98;
        int actualResult = Task18.getLastElementArray(array);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getLastElementArrayTest2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int expectedResult = 11;
        int actualResult = Task18.getLastElementArray(array);
        assertEquals(expectedResult, actualResult);

    }
}