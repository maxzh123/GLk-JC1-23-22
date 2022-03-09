package operators;

import by.itAcademy.homeworks.operators.Task10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test10 {
    @Test
    public void Test1(){
        String expectedResult = "Both houses will fit on the plot";
        String expectedResult1 = "Both houses will not fit on the plot";
        String expectedResult2 = "Erorr: enter correct Number";

        String actualResult = Task10.checkFitIn(5, 7, 6, 8, 20, 25);
        String actualResult1 = Task10.checkFitIn(20, 25, 30, 35, 10, 8);
        String actualResult2 = Task10.checkFitIn(5, 7, 0, 8, 20, 25);

        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void Test2() {
        String expectedResult = "Both houses will fit on the plot";
        String expectedResult1 = "Both houses will not fit on the plot";

        String actualResult = Task10.aLessThanb(5, 7, 6, 8, 20, 25);
        String actualResult1 = Task10.aLessThanb(20, 25, 30, 35, 10, 8);

        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
    }

    @Test
    public void Test3() {
        String expectedResult = "Both houses will fit on the plot";
        String expectedResult1 = "Both houses will not fit on the plot";

        String actualResult = Task10.aMoreb(5, 7, 6, 8, 20, 25);
        String actualResult1 = Task10.aMoreb(20, 25, 30, 35, 10, 8);

        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
    }
}
