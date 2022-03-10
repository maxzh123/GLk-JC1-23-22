import by.itAcademy.homeworks.arrays.Task21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test21 {
    @Test
public void test1(){
    int[] array={32,31,24,21,3};
        Assertions.assertEquals(0, Task21.maxIndexOfArray(array));
}
    @Test
public void test2(){
        int[] array={16,23,21,45,1,23};
            Assertions.assertEquals(4,Task21.minIndexOfArray(array));
        }
     @Test
public void test3(){
        int[] array={1,2,3,4,5,6,7,8,9};
        int min=array[0];
        int max=array[8];
        Assertions.assertEquals(0,Task21.sumBetweenElements(array,min,max));
     }
    }
