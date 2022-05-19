package by.itAcademy.homeworks.FinalTasks;

/**
 * 2.Сгенерировать массив случайных целых чисел, величина которых, по модулю, не превышает 300 (-300 ... 300).
 * Число элементов массива равно 10. Найти максимальное и минимальное числа в массиве и вывести на экран.
 * Заменить максимальный элемент на минимальный, умноженный на максимальный.
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[10];
        fillArray(array);
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Максимальный элемент: " + array[findMaxIndex(array)]);
        System.out.println("Минимальный  элемент: " + array[findMinIndex(array)]);
        System.out.println("Массив после замены: " + Arrays.toString(replaceElement(array)));
    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 601 - 300);
        }
        return array;
    }

    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int[] replaceElement(int[] array) {
        array[findMaxIndex(array)] = array[findMinIndex(array)] * array[findMaxIndex(array)];
        return array;
    }
}
