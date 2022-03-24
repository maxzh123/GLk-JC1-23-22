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
        int array[] = {1, 2, 2, 2, 2, 2, 2, 2, 9};
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма = " + checkTwo(array));
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
            if (array[i] >= max) {
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
            if (array[i] <= min) {
                min = array[i];
                minindex = i;
            }
        }
        return minindex;
    }
    //метод проверки на наличие двух максимальных или минимальных значений (в процессе создания)
    //добавить проверку на наличие второго максимального или минимального элемента
    public static int checkTwo(int[] array) {
        int sum = 0;
        int l = 0;
        int t = 0;
        int indexNewMin = minIndex(array);
        int indexNewMax = maxIndex(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[maxIndex(array)] && i != maxIndex(array)) {
                l = i; //по сути индекс другово максимального элемента
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[minIndex(array)] && i != minIndex(array)) {
                t = i; //по сути индекс другово минимального элемента
            }
        }
        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(maxIndex(array) - minIndex(array)) < Math.abs(maxIndex(array) - t))) {
                indexNewMin = t;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(minIndex(array) - maxIndex(array)) < Math.abs(minIndex(array) - l))) {
                indexNewMax = l;
            }
        }
        sum = newCalcSum(array, indexNewMin, indexNewMax);

        System.out.println("indexNewMin " + indexNewMin);
        System.out.println("indexNewMax " + indexNewMax);
        System.out.println("minIndex(array) " + minIndex(array));
        System.out.println("maxIndex(array) " + maxIndex(array));
        System.out.println("l " + l);

        return sum;
    }
    //вычисление суммы элементов массива между минимальным и максимальным значением New
    public static int newCalcSum(int[] array, int indexNewMin, int indexNewMax) {
        int sum = 0;
        if (indexNewMin < indexNewMax) {
            for (int i = indexNewMin; i < indexNewMax + 1; ++i) {
                sum = sum + array[i];
            }
        } else {
            for (int j = indexNewMin; j > indexNewMax - 1; j--) {
                sum = sum + array[j];
            }
        }
        return sum;
    }
}