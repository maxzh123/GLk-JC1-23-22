package regexp;

import by.itAcademy.homeworks.regexp.Task28;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test28 {

    @Test
    public void Test(){
        String expectedResult = "abcde";
        String actualResult = Task28.getText("aaaaa bbbb: cccc. ddddd, eeee!");
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
