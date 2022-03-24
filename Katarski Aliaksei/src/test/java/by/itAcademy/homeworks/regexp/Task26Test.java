package by.itAcademy.homeworks.regexp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task26Test {

    @Test
    void punctMarks() {
        int actualResult=Task26.punctMarks("!!!,..;:?!!...())");
        int expectedResult=11;
        Assertions.assertEquals(expectedResult,actualResult);

    }
}