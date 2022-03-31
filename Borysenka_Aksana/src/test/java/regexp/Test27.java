package regexp;

import by.itAcademy.homeworks.regexp.Task27;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test27 {

    @Test
    public void Test(){
        int expendedResult = 7;
        int actualResult = Task27.getCount("fghbj fyghbj fghj h hukjhb khygghv kuygb");
        Assertions.assertEquals(expendedResult,actualResult);
    }
}
