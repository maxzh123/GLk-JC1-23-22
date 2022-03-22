package objects;

import by.itAcademy.homeworks.objects.Bankomat;
import by.itAcademy.homeworks.objects.Task25;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test25 {

    @Test
    public void Test25(){

        int expectedSum = 1700;
        Bankomat putSum = new Bankomat(0,0,0);
        int actualSum = putSum.putCash(10,10,10);
        Assertions.assertEquals(expectedSum, actualSum);

    }
}
