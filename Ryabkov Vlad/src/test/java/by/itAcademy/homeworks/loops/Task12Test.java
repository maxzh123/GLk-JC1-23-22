package by.itAcademy.homeworks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {
    @Test
    void Test(){
        int value = 10;
        int result = 3628800;
        int actualRes = Task12.factorial(value);
        assertEquals(result, actualRes);
    }

}