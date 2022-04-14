package by.itAcademy.homeworks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {
    @Test
    void Test(){
        int val = 111222;
        int result = 9;
        int actualRes = (int) Task14.calculate(val);
        assertEquals(result, actualRes);
    }

}