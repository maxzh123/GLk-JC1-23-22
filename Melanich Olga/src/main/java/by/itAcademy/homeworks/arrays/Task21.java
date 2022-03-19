package by.itAcademy.homeworks.arrays;

import by.itAcademy.homeworks.utils.ArrayUtil;
import by.itAcademy.homeworks.utils.Printer;

/**
 * Задание 21
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями.
 * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений макс и мин несколько, взять максимальное значение разницы индексов между макс и мин значениями.
 */

public class Task21 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Printer.print(java.util.Arrays.toString(ArrayUtil.fillArray(array)));
        Printer.print("Index of the minimum array element: " + ArrayUtil.indexOfMinArrayElement(array));
        Printer.print("Index of the maximum array element: " + ArrayUtil.indexOfMaxArrayElement(array));
        Printer.print(sumBetweenMinMaxElements(array, ArrayUtil.indexOfMinArrayElement(array), ArrayUtil.indexOfMaxArrayElement(array)));
    }
        // Пока так. Как реализовать последнюю чась задания, думаю.

    public static int sumBetweenMinMaxElements(int[] arr, int minIndex, int maxIndex) {
        int sum = 0;
        if (minIndex < maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += arr[i];
            }
        }
        if (minIndex > maxIndex) {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int countIndexOfMinElement(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[ArrayUtil.indexOfMinArrayElement(arr)]) {
                count++;
            }
        }
        return count;
    }

    public static int countIndexOfMaxElement(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[ArrayUtil.indexOfMaxArrayElement(arr)]) {
                count++;
            }
        }
        return count;
    }
}

