package arrays;

import by.itAcademy.homeworks.arrays.Task18;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test18 {

    @Test
    public void Test1(){
    int expectedResult = 7;
    int actualResult = Task18.lastElementArr(new int [] {1,2,1,4,4,2,3,5,7});
    assertEquals(expectedResult, actualResult);
    }
}
