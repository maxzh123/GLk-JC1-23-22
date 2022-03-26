package regexp;

import by.itAcademy.homeworks.regexp.Task26;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test26 {

    @Test
    public void Test(){
        int expectedResult = 5;
        int actualResult = Task26.getPunctCount("ghbj! bhjn... guhbjkjh. jk?! yihkbjn)");
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
