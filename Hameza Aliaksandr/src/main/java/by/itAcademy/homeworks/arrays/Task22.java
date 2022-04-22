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
        randomArray(array);
        System.out.println("Изначальный массив" + Arrays.toString(array));
        System.out.println("Перевернутый массив" + Arrays.toString(printArrayRevers(array)));
    }
    public static int[] randomArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    public static int [] printArrayRevers(int[] array) {
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}
