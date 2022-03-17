package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 18
 * Создать переменную для массива из 10 элементов.
 * Заполнить его произвольными значениями и вывести последний элемент массива на экран.
 */
public class Task18<lastElement> {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(Arrays.toString(fillArray(array)));
        System.out.println(getLastElementArray(array));
    }

    // заполнить массив случайными числами
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        return array;
    }

    // последний элемент массива
    public static int getLastElementArray(int[] array) {
       return array[array.length - 1];
    }
}

