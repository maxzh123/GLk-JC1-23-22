package objects;

import by.itAcademy.homeworks.objects.TimeInterval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test24 {

    @Test
    public void Test(){
        int expectedResult = 360;
        TimeInterval time = new TimeInterval(expectedResult);
        int actualResult = time.getTotalSeconds();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test1(){
        int seconds = 360;
        int minutes = 20;
        int hours = 2;
        int expected_result_Total_seconds = seconds + minutes*60 + hours*3600;
        TimeInterval time = new TimeInterval(seconds,minutes,hours);
        int actualResult = time.getTotalSeconds();
        assertEquals(expected_result_Total_seconds, actualResult);
    }

    @Test
    public void Test2(){
        TimeInterval object_1 = new TimeInterval(100);
        TimeInterval object_2 = new TimeInterval(10, 15, 2 );

        int result = object_1.compareTo(object_2);

        assertEquals(-1, result);
    }

}
