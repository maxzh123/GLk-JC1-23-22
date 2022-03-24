package regexp;

import by.itAcademy.homeworks.regexp.Task30;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test30 {

    @Test
    public void Test(){
        String expectedResult = "<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, " +
                "sed diem <p> nonummy nibh euismod tincidunt ut lacreet dolore magna aliguam" +
                " erat volutpat.<p><p>Ut wisis enim ad minim veniam, quis nostrud exerci tution ullamcorper" +
                " suscipit lobortis nisl ut aliquip ex ea commodo consequat.<p>";
        String actualResult = Task30.editedStr("<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, " +
                "sed diem <p asign = \"left\"> nonummy nibh euismod tincidunt ut lacreet dolore magna aliguam " +
                "erat volutpat.</p><p>Ut wisis enim ad minim veniam, quis nostrud exerci tution ullamcorper " +
                "suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>");
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
