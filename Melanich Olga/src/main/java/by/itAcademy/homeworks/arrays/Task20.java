package by.itAcademy.homeworks.arrays;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Arrays;

/**
 * Задание 20
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями.
 * Найдите максимальный элемент и выведите его индекс.
 */

public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Printer.print(Arrays.toString(Task18.fillArray(array)));
        Printer.print("Максимальный элемнт массива: " + getMaxArrayElement(array));
        Printer.print("Индекс максимального элемента массива: " + maxIndex(array));
    }
    // находим макс элемент массива
    public static int getMaxArrayElement(int[] arr) {
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    //находим индекс макс элемента массива
    public static int maxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] < arr[i]) {
                arr[0] = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
