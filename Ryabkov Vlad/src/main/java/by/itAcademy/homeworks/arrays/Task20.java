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
        System.out.println("Max index is :" + maxIndexofArray(array));

    }


    public static int maxIndexofArray(int[] values) {
        int maxValue = values[0];
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }

        }
        return maxIndex;
    }
}
