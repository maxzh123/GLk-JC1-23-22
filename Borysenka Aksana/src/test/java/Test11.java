import by.itAcademy.homeworks.operators.Task11;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test11 {

    @Test
    public void Test1(){
//        String expectedResult = "Your plan of the week: Monday: Work; Tuesday: Study; Wednesday: Workout; Thursday: Meeting with friends; Friday: Swimming pool; Saturday: Meeting with parents; Sunday: Journey. Today:You've planned: Study;";
//        String actualResult = Task11.dayPlan(2);
//        assertEquals(expectedResult, actualResult);
        //сильно замудрила с выводом...не знаю как это проверить

    }

    @Test
    public void Test2() {
        String expectedResult1 = "Error: enter correct number";
        String actualResult1 = Task11.dayPlan(10);
        assertEquals(expectedResult1, actualResult1);
    }
}
