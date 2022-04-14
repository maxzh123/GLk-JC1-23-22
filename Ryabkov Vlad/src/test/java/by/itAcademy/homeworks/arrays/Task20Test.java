package by.itAcademy.homeworks.arrays;

import by.itAcademy.homeworks.basics.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test

    void Test1(){
        int arr[] = {1,2,3,4,5,6,7};
        int result  = 6;
        int actualResult = Task20.maxIndexofArray(arr);
        assertEquals(result,actualResult);
    }

}