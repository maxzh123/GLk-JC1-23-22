package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/** Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.
 */
public class Task18 {
    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println("Последний элемент массива " + array[(randomArray(array).length - 1)]);
    }
    public static int[] randomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
    return array;
    }
}
