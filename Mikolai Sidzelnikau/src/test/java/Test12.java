import by.itAcademy.homeworks.loops.MathEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test12 {
    @Test
    public void test1(){
        Assertions.assertEquals(3628800, MathEquation.factorial(10));
    }
}
