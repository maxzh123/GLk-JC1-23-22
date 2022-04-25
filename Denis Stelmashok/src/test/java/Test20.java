import by.itAcademy.homeworks.arrays.Task20;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test20 {


    @Test
    public void check1(){
        int max=Task20.findIndexOfMax(new int[]{1,2,3,4,5});
        Assertions.assertEquals(4,max);
    }

}
