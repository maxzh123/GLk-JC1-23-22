package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * ## Задание 18
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа и выведите последний элемент
 * > массива на экран.
 */
public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 200000;
        for (int i = 0; i < array.length; i++) {
            array[i] = random(sum);
            if (i == array.length - 1){
                System.out.println(array[i]);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int random(int ran) {
        Random random = new Random();
        ran = random.ints(1, 200000).findFirst().getAsInt();
        return ran;
    }
}
