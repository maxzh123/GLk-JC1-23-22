package arrays;


import by.itAcademy.homeworks.arrays.Task19;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test19 {

    @Test
    public void Test(){
        String expectedResult = "[1, 1, 4, 3, 7]";
        String actualResult = Task19.evenElementArr(new int [] {1,2,1,4,4,2,3,5,7});
        assertEquals(expectedResult, actualResult);
    }
}
