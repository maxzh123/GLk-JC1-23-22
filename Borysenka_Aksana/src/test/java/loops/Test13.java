package loops;
import by.itAcademy.homeworks.loops.Task13;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test13 {

    @Test
    public void Test1(){
        BigInteger expectedResult = new BigInteger("15511210043330985984000000");
        BigInteger actualResult = Task13.calcNuber(1,25);
        assertEquals(expectedResult, actualResult);
    }
}
