package by.itAcademy.homeworks.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test
    void maxArrayElementTest() {
        int expected = 87;
        int actual = Task20.maxArrayElement(new int[]{1, 8, 3, 60, 87, 5});
        assertEquals(expected, actual);
    }

    @Test
    void maxArrayElementTest1() {
        int expected = 54;
        int actual = Task20.maxArrayElement(new int[]{54, 8, 2, 53});
        assertEquals(expected, actual);
    }

    @Test
    void maxArrayElementTest2() {
        int expected = 9;
        int actual = Task20.maxArrayElement(new int[]{1, 8, 3, 9});
        assertEquals(expected, actual);
    }
}