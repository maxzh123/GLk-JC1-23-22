package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task20 {
    /**
     * Создайте переменную для массива из 10 элементов.
     * Заполните его произвольными значениями целочисленного типа. Найдите максимальный элемент и выведите его индекс.
     */

    public static void main(String[] args) {
        int[] array = new int[10];
        elementArr(array);
        System.out.println("Maximum array element : " + maxElementArr(array));
    }

    public static void elementArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }

    public static int maxElementArr(int[] arr){
        int max = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (arr[i]>=max){
                max = arr[i];
            }
            }
        return max;
    }
}
