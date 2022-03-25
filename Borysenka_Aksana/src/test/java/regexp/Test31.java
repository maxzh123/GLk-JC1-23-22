package regexp;

import by.itAcademy.homeworks.strings.Task31;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test31 {

    @Test
    public void Test(){
        long rez1 = Task31.getResultConcatMethod("abcabc");
        System.gc();
        long rez2 = Task31.getResultBuilderMethod("abcabc");
        Assertions.assertEquals(true, rez2 < rez1);
    }
}
