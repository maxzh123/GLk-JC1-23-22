package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 21
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.
 */

public class Task21 {
    public static void main(String[] args) {
        // int l = 10;
        // int array[] = new int[l];
        // fillArray(array);
        // для тестирования массив заполняется вручную
        int array[] = {1, 2, 9, 2, 2, 2, 2, 1, 2};
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма = " + calcSum(array));
    }
    //метод заполнения массива случайными числами
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    //метод поиска индекса максимального элемента массива
    public static int maxIndex(int[] array) {
        int maxindex = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
    //метод поиска индекса минимального элемента массива
    public static int minIndex(int[] array) {
        int minindex = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minindex = i;
            }
        }
        return minindex;
    }
    //метод проверки на наличие второго максимального значения
    public static int checkNewMax(int[] array) {
        int secondMax = 0;
        int indexNewMax = maxIndex(array);
        int countmax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[maxIndex(array)] && i != maxIndex(array)) {
                secondMax = i;
                countmax++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(minIndex(array) - maxIndex(array)) < Math.abs(minIndex(array) - secondMax)) && countmax != 0) {
                indexNewMax = secondMax;
            }
        }
        return indexNewMax;
    }
    //метод проверки на наличие второго маинимального значения
    public static int checkNewMin(int[] array) {
        int secondMin = 0;
        int indexNewMin = minIndex(array);
        int countmin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[minIndex(array)] && i != minIndex(array)) {
                secondMin = i;
                countmin++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(maxIndex(array) - minIndex(array)) < Math.abs(maxIndex(array) - secondMin)) && countmin != 0) {
                indexNewMin = secondMin;
            }
        }
        return indexNewMin;
    }
    //вычисление суммы элементов массива между минимальным и максимальным значением New
    public static int calcSum(int[] array) {
        int indexMin = checkNewMin(array);
        int indexMax = checkNewMax(array);
        int sum = 0;
        if (indexMin < indexMax) {
            for (int i = indexMin; i < indexMax + 1; ++i) {
                sum = sum + array[i];
            }
        } else {
            for (int j = indexMin; j > indexMax - 1; j--) {
                sum = sum + array[j];
            }
        }
        return sum;
    }
}