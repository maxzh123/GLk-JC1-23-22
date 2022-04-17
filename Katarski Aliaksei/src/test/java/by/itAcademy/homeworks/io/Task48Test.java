package by.itAcademy.homeworks.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task48Test {
    String testString="я 1 фцв 4 фцв 4 фцв 5 фцв 55 фцв ф 5 фцв 1 фцв цф7 фц 9";
    List<Integer> testList=Task48.getNumbersFromFile(testString);
    @Test
    void getNumbersFromFile() {
        List<Integer>expectedList=new ArrayList(Arrays.asList(1,4,4,5,55,5,1,7,9));
        Assertions.assertEquals(expectedList,Task48.getNumbersFromFile(testString));
    }

    @Test
    void getSumOfElements() {
        int sum=91;
        Assertions.assertEquals(sum,Task48.getSumOfElements(testList));
    }

    @Test
    void getNonRepeatableElements() {
        List<Integer> test_1=new ArrayList(Arrays.asList(1,4,5,55,7,9));
        Assertions.assertEquals(test_1,Task48.getNonRepeatableElements(testList));
    }
}