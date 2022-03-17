package by.itAcademy.homeworks.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {
 Task19 task19 = new Task19();

    public static void main(String[] args) {
        Task19 task19 = new Task19();
        int[] array = new int[10];
        task19.getArray(array);
    }
    @Test
    void test1(){
    int[] array = new int[6];
    task19.setRandom(array);
    task19.setArray(array);
        System.out.println(Arrays.toString(array));

    }
  /*  @Test
    void getArray() {
        int[] array = {1,2,3,4,5,6,7,8};
        task19.setArray(array);
        Assertions.assertArrayEquals(array,task19.getArray());
    }

    @Test
    void setArray() {
        int[] array = new int[8];
        task19.setRandom(array);
        Assertions.assertArrayEquals(array,task19.getArray());
    }*/
}