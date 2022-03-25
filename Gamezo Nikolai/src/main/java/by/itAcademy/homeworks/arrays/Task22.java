package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 22
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 * Выведите на экран, переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).
 */

public class Task22 {
    public static void main(String[] args) {
        int array[] = new int[10];
        fillArray(array);
        System.out.println("Исходный массив:     " + Arrays.toString(array));
        System.out.println("Перевёрнутый массив: " + Arrays.toString(turnOverArray(array)));
    }
    //метод заполнения массива случайными числами
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    //метод для переворачивания массмва
    public  static int [] turnOverArray(int[] array) {
        int buffer;
        for (int i = 0; i < array.length / 2; i++) {
            buffer = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = buffer;
        }
        return array;
    }
}
