package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы
 * индексов между максимальным и минимальным значениями.
 */

// не работает последнее условие

public class Task21 {
    public static void main(String[] args) {
        //               0  1  2  3   4  5  6  7  8  9
        int massiv[] = {3, 13, 5, 3,  5, 2, 1, 8, 4, 10};
        System.out.println("max element has index " + getMaxIndex(massiv));
        System.out.println("min element has index " + getMinIndex(massiv));
        System.out.println("sum between min and max elements is " + sumMinMaxIndex(massiv));
    }

    public static int getMaxIndex(int[] array) {
        int maxIndex = 0;
        int max = array[maxIndex];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int getMinIndex(int[] array) {
        int minIndex = 0;
        int min = array[minIndex];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;

    }

    public static int sumMinMaxIndex(int[] massiv) {
        int max = getMaxIndex(massiv);
        int min = getMinIndex(massiv);
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        int result = 0;
        for (int i = min + 1; i < max ; i++) {
            result += massiv[i];
        }
        return result;

    }
}