import by.itAcademy.homeworks.arrays.Task21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import utils.IntArrayConverter;

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

    @ParameterizedTest
    @CsvSource(value = {
            "2,1;2;3",
            "2,3;2;1",
            "3,3;2;1;1",
            "3,1;1;2;3",
            "3,3;1;1;2;3",
            "5,3;2;2;1;1;2;3",
            "13,3;2;2;1;1;2;1;1;3;1;3;3"
    })
    public void testArrayLength(int sum,@ConvertWith(IntArrayConverter.class)  Integer[] data ){
        int[] arr=new int[data.length];
        for(int i=0;i<data.length;i++){arr[i]=data[i];};
        //Assertions.assertEquals(sum, Task21.sumBetweenElements(arr));
    }


}
