package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task20 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int max = Integer.MIN_VALUE; //Надо для алгоритма. А именно для корректного запуска алгоритма.
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
            if(arr[i]>max)                       //было решено написать велосипед.
                max = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.format("Max value: %d",max);
    }
}
