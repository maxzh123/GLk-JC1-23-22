package by.itAcademy.homeworks.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Task18Test {
    Task18 task18 = new Task18();

    public static void main(String[] args) {
        Task18 task18 = new Task18();
        int[] arr = {1,2,3,4,5,6,7,8,4,6};
        task18.setArray(arr);
        System.out.println(task18.numberArray);
    }
    @Test
    void test1() {
        int[] array = {1,2,42};
        task18.setArray(array);
        Assertions.assertEquals(42,task18.numberArray);
    } // тут проверяю последнее число массива

    @Test
    void test2() {
        int[] array = new int[10];
        task18.setArray(array);
        Assertions.assertEquals(9,task18.numberArray);
    } //тут проверяю если массив пустой
}