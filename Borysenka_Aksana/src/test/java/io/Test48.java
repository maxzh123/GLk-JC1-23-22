package io;

import by.itAcademy.homeworks.io.Task48;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test48 {

    @Test
    public void Test(){
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(4);
        lst.add(5);
        lst.add(4);
        lst.add(5);
        lst.add(4);
        int expectedResulr = 27;
        int actualResult = Task48.sumNumbers(lst);
        Assertions.assertEquals(expectedResulr,actualResult);
    }

    @Test
    public void Test1() {
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(4);
        lst.add(5);
        lst.add(4);
        lst.add(5);
        lst.add(4);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(5);
        expectedList.add(4);

        int [] arrExpectedResult = new int [expectedList.size()];
        for (int i = 0; i < expectedList.size(); i++) {
            arrExpectedResult[i] = expectedList.get(i);
        }

        List<Integer> actualList = Task48.getNumbersWithoutDuplicate(lst);
        int [] arrActualResult = new int[actualList.size()];
        for (int i = 0; i < actualList.size(); i++) {
            arrActualResult[i] =actualList.get(i);
        }

        Assertions.assertArrayEquals(arrExpectedResult,arrActualResult);
    }
}
