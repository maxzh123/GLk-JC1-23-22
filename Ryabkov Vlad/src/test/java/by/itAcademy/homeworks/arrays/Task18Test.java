package by.itAcademy.homeworks.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {
    @Test
    void Test1(){
        int arr[] = {1,2,3};
        int result = 3;
        int actualResult = Task18.getlast(arr);
        assertEquals(result, actualResult);
    }

}