package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task19 {

    /**
     * Создайте переменную для массива из 10 элементов (другим способом).
     * Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на четных позициях.
     */

    public static void main(String[] args) {
        int[] array = new int[10];
        elementArr(array);
        System.out.println(evenElementArr(array));
    }

    public static void elementArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Еlements standing in even places: " + Arrays.toString(arr));
    }

    public static String evenElementArr(int[] arr) {
        int index=0;
        if (arr.length % 2 == 0) {
             index=arr.length/2;
            } else {
             index = arr.length/2+1;
        }

        int [] newarr = new int [index];
        index=0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                newarr[index++] = arr[i];
            }
        }
        return Arrays.toString(newarr);
    }
}
