package arrays;


import by.itAcademy.homeworks.arrays.Task22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test22 {


    @Test
    public void Test(){
        int [] arr = new int[] {1,2,3,4,5};
        int [] newArray  = Task22.mirrorArray(arr);
        Assertions.assertEquals(arr, newArray);
    }
}

