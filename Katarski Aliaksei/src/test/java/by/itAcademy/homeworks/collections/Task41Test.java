package by.itAcademy.homeworks.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task41Test {

    @Test
    void maxMark() {
        ArrayList<Integer> testList=new ArrayList(Arrays.asList(12,32,512,321,312,4));
        Assertions.assertEquals(512,Task41.maxMark(testList));
    }
}