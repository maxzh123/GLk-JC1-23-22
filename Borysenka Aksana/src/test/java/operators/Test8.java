package operators;

import by.itAcademy.homeworks.operators.Task8;
//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test8 {

    @Test
    public void test1() {
        Assertions.assertEquals("рублей", Task8.checkrubNumber(5));
    }

    @Test
    public void test() {
        Assertions.assertEquals("рублей", Task8.checkrubNumber(5));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("рубль", Task8.checkrubNumber(1));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("рубля", Task8.checkrubNumber(3));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("Error: enter correct number", Task8.checkrubNumber(5));
    }

}
