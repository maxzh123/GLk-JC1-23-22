package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Создайте переменную для массива из 10 элементов (другим способом).
 * Заполните его произвольными значениями целочисленного типа и
 * выведите на экран элементы, стоящие на четных позициях.
 */

public class Task19 {
    public static void main(String[] args) {
        int [] arr = {2, 9, 89, 874, 25, 45, 35, 77, 0};
            for (int i = 2; i <arr.length; i+=2)
            System.out.print(arr[i] + " ");
    }

}
