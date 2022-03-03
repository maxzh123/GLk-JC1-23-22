import by.itAcademy.homeworks.loops.Task14;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test14 {
    @Test
    public void test1() {
        Assertions.assertEquals(45, Task14.digitalsum(192837465L));
    }
    @Test
    public void test2() {
        Assertions.assertEquals(9, Task14.digitalsum(111111111L));
    }
    @Test
    public void test3() {
        Assertions.assertEquals(5, Task14.digitalsum(41));
    }
}
