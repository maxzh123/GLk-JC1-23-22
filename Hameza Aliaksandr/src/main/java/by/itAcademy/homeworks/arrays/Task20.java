package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 20
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа. Найдите максимальный элемент и выведите его индекс.
 */
public class Task20 {
    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println(max(randomArray(array)));
        ;
    }

    public static int[] randomArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        return array;
    }

    public static int max(int array[]) {
        int max_el = array[0];
        int max_in = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max_el) {
                max_el = array[i];
                max_in = i + 1;
            }
        }
        return max_in;
    }
}
