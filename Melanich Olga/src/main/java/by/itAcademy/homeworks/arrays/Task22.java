package by.itAcademy.homeworks.arrays;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Arrays;

/** Задание 22
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями.
 * Выведите на экран, переверните и снова выведите на экран.
 * (при переворачивании не создавать еще один массив).
 */

public class Task22 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Printer.print(Arrays.toString(Task18.fillArray(array)));
        Printer.print(Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = j;
        }
        return array;
    }
}
