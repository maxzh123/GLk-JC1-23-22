package by.itAcademy.homeworks.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task39Test {

    @Test
    void school() {
        ArrayList<Integer> testArrList=new ArrayList<>();
        int expectedSize=10;
        Assertions.assertEquals(expectedSize,Task39.school(testArrList).size());
    }

    @Test
    void badMarksGoOut() {
        ArrayList<Integer> testArrList_1=new ArrayList();
        testArrList_1.add(2);
        testArrList_1.add(6);
        testArrList_1.add(9);
        testArrList_1.add(7);
        testArrList_1.add(3);
        ArrayList<Integer> testArrList_2= (ArrayList<Integer>) Task39.badMarksGoOut(testArrList_1).clone();
        Assertions.assertEquals(testArrList_2,Task39.badMarksGoOut(testArrList_1));
    }
}