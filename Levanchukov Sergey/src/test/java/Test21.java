import by.itAcademy.homeworks.arrays.Task21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import utils.IntArrayConverter;

public class Test21 {
    @ParameterizedTest
    @CsvSource(value = {
            "6,1;2;3",
            "6,3;2;1",
            "7,3;2;1;1",
            "7,1;1;2;3",
            "7,3;1;1;2;3",
            "9,3;2;2;1;1;2;3",
            "17,3;2;2;1;1;2;1;1;3;1;3;3"
    })
    public void testArrayLength(int sum,@ConvertWith(IntArrayConverter.class)  Integer[] data ){
        int[] arr=new int[data.length];
        for(int i=0;i<data.length;i++){arr[i]=data[i];};
        Assertions.assertEquals(sum, Task21.minMax(arr));
    }

}
