package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 19
 * Создайте переменную для массива из 10 элементов (другим способом).
 * Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на четных позициях.
 */

public class Task19 {
    public static void main(String[] args) {
        int l = 10;
        int mass [] = new int[l];
        fillMass(mass);
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(select(mass)));
    }
    //метод заполнения массива случайными числами
    public static int [] fillMass(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    //нужно разобраться с цифрой 5
    //метод выбора элементов стоящих на четных позициях
    public static int [] select(int[] array) {
        int n = 0;
        int [] newarray = new int[5];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                newarray[n] = array[i];
                n++;
            }
        }
        return newarray;
    }
}


