package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

import static by.itAcademy.homeworks.Untils.RandomArray.randomarray;


/**
 * Создать переменную для массива из 10 элементов (другим способом).
 * Заполнить его произвольными значениями целочисленного типа и вывести на
 * экран элементы, стоящие на четных позициях.
 */

public class Task19 {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] array1 = randomarray(array);
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                System.out.println("Делится на 2 : " + array1[i]);
            }
        }
    }



}
