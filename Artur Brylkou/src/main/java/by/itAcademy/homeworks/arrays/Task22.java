package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        int sort;
        for (int i = 0; i < array.length / 2; i++) {
            sort = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = sort;
        }

            System.out.println(Arrays.toString(array));

    }
}
