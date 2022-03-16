package arrays;

import by.itAcademy.homeworks.arrays.Task21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test21 {
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
        Assertions.assertEquals(sum, Task21.calcSum(arr));
    }

    @Test
    public void Test(){
        int [] arr = new int [] {1,5,2,3};
        int sum = 0;
        assertEquals(sum,Task21.calcSum(arr));
    }

    @Test
    public void Test1(){
        int [] arr = new int [] {5,5,2,2,3,1,1};
        int sum = 13;
        assertEquals(sum,Task21.calcSum(arr));
    }

    @Test
    public void Test3(){
        int [] arr = new int [] {1,1,2,3,5,5};
        int sum = 11;
        assertEquals(sum,Task21.calcSum(arr));
    }

    @Test
    public void Test4(){
        int [] arr = new int [] {5,1,1,2,1,4,3,5,5};
        int sum = 16;
        assertEquals(sum,Task21.calcSum(arr));
    }
}
