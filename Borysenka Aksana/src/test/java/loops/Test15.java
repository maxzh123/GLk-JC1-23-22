package loops;
import by.itAcademy.homeworks.loops.Task15;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test15 {

    @Test
    public void Test1(){
        boolean expectedResult = true;
        boolean actualResult = Task15.isPrime(59);
        assertEquals(expectedResult, actualResult);
    }
}
