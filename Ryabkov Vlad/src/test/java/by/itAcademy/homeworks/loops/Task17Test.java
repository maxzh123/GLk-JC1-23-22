package by.itAcademy.homeworks.loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task17Test {
    @Test
    void Test() {
        int val = 10789;
        String result = "10 789 ";
        String actRes = Task17.addSpace(val);
        assertEquals(result,actRes);

    }
}