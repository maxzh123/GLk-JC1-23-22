package regexp;

import by.itAcademy.homeworks.regexp.Task29;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test29 {

    @Test
    public void Test(){
        String expextedResult = "0x9Ef73 0x11 0xAB ";
        String actualResult = Task29.getResult("dfgh 0x9Ef73 0x11 0xAB ftghjk ! gvjhb ");
        Assertions.assertEquals(expextedResult, actualResult);
    }

}
