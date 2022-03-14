package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

import static by.itAcademy.homeworks.Untils.RandomArray.randomarray;

/**
 * Создать переменную для массива из 10 элементов. Заполнить его
 * произвольными значениями целочисленного типа. Найти максимальный элемент
 * и вывести его индекс.
 */

public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(Arrays.toString(randomarray(array)));
        System.out.println("Max Array is :" + maxArray(array));

    }


    public static int maxArray(int[] array) {
        int maxArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        return maxArray;
    }
}
