import by.itAcademy.homeworks.loops.Task12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test12 {
    @Test
    public void test1(){
        Assertions.assertEquals(3628800,Task12.MathEquation.factorial(10));
    }
}
