package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

import static by.itAcademy.homeworks.Untils.RandomArray.randomarray;

/**
 * Создайте переменную для массива из 10 элементов. Заполните его
 * произвольными значениями целочисленного типа и выведите последний элемент
 * массива на экран.
 */

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(Arrays.toString(randomarray(array)));
        System.out.println(getlast(array));
    }

    public static int getlast (int[] array){
        return array [array.length - 1];

    }
}
