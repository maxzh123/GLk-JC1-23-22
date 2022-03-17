package arrays;

import by.itAcademy.homeworks.arrays.Task20;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test20 {
    @Test
    public void Test(){
        int expectedResult = 14;
        int actualResult = Task20.maxElementArr(new int [] {1,2,1,14,4,2,3,5,7});
        assertEquals(expectedResult, actualResult);
    }
}
