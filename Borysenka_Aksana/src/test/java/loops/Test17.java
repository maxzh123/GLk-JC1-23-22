package loops;

import by.itAcademy.homeworks.loops.Task17;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test17 {

    @Test
    public void Test(){
        String str_expepded = "10 000";
        String str_actual = Task17.addSpacetoString("10000");
        assertEquals(str_expepded, str_actual);
    }

    @Test
    public void Test1(){
        String str_expepded = "-10 000";
        String str_actual = Task17.addSpacetoString("-10000");
        assertEquals(str_expepded, str_actual);
    }

}
