package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 * Найдите максимальный элемент и выведите его индекс.
 */

public class Task20 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        getMax(random(randomArray));
    }

    public static int[] random(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int getMax(int[] array) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("значение " +max + " под индексом " + maxIndex);
        return max;
        }
}