package by.itAcademy.homeworks.arrays;
/**
 * ## Задание 20
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа. Найдите максимальный элемент
 * > и выведите его индекс.
 */

import java.util.Arrays;
import java.util.Random;

public class Task20 {
    public static int max = 0;
    public static int indexMax = 0;
    public static void main(String[] args) {
        int[] array = new int[10];
        arrays(array);
    }

    public static int[] arrays(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2000);
            if (arr[i] > max){
                max = arr[i];
            }if (arr[i] == max){
                indexMax = i;
            }
        }
        System.out.println(indexMax);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
