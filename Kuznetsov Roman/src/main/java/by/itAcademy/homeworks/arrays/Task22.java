package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task22 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH=10;
        int[] array = new int[ARRAY_LENGTH];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println("Массив до:"+Arrays.toString(array));
        //что подобное на сортировку пузырком, но без 2го for и условния. Да и вообще на пузырек не похоже
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        System.out.println("Массив после:"+Arrays.toString(array));
    }
}
