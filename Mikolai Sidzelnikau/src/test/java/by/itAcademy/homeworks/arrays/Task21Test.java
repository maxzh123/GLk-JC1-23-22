package by.itAcademy.homeworks.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import utils.IntArrayConverter;

class Task21Test {
    @ParameterizedTest
    @CsvSource(value = {
            "2,1;2;3",
            "2,3;2;1",
            "3,3;2;1;1",
            "3,1;1;2;3",
            "3,3;1;1;2;3",
            "5,3;2;2;1;1;2;3",
            "13,3;2;2;1;1;2;1;1;3;1;3;3",
    })
    public void testArrayLength(int sum,@ConvertWith(IntArrayConverter.class)  Integer[] data ){
        int[] array=new int[data.length];
        for(int i=0;i<data.length;i++){array[i]=data[i];}
        Task21 task21 = new Task21(array);
        Assertions.assertEquals(sum,task21.getArray());
    }
    @Test
    public void test1() {
        int[] array = {209, 18, 105, 16,10,10, 33,65,202,209};
        Task21 task21 = new Task21(array);
        System.out.println(task21.getArray());
        System.out.println(task21);
    }
}