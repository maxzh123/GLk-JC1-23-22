package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

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

    public static int[] randomarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) + 1);
        }
        return array;
    }
    public static int getlast (int[] array){
        return array [array.length - 1];

    }
}
