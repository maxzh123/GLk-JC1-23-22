import by.itAcademy.homeworks.arrays.Task22;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test22 {
    @Test
    public void test(){
        int[] array={1,2,3,4,5,6,7,8,9};
        int[] expected={9,8,7,6,5,4,3,2,1};
        Assertions.assertArrayEquals(expected, Task22.arrayReverse(array));
    }


}
