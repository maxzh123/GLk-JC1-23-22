import by.itAcademy.homeworks.types.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test4 {
    Task4 task4 = new Task4();
    @Test
    public void test1(){
        Assertions.assertEquals(41,task4.getSumirovanie(5,6));
    }
}
