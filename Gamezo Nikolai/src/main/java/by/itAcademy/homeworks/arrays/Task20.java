package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 20
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа. Найдите максимальный элемент и выведите его индекс.
 */

public class Task20 {
    public static void main(String[] args) {
        int l = 10;
        int array [] = new int[l];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальный элемент " + maxElement(array));
        System.out.println("Индекс максимального элемента " + maxIndex(array));
    }
    //метод заполнения массива случайными числами
    public static int [] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    //метод поиска максимального элемента массива
    public static int  maxElement(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }
    //метод поиска индекса максимального элеиента массива
    public static int  maxIndex(int[] array) {
        int max = 0;
        int maxindex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
}
