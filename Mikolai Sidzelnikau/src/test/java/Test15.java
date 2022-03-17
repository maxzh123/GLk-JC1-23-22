import by.itAcademy.homeworks.loops.MathEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Нахождение простых чисел от 50 до 70
 */
public class Test15 {
    @Test
    public void test1(){
        Assertions.assertEquals(70, MathEquation.primeNumber(50,70));
    }
}
