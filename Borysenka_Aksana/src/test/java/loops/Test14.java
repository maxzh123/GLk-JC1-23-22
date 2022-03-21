package loops;
import by.itAcademy.homeworks.loops.Task14;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test14 {

    @Test
    public void Test1(){
        int expectedResult = 53;
        long actualResult = Task14.sumDigit(7893823445L);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test2(){
        int expectedResult = 18;
        long actualResult = Task14.sumDigit(99L);
        assertEquals(expectedResult, actualResult);
    }
}
