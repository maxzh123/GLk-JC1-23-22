package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task19 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
            if(i%2==0)
            System.out.print("i="+i+"|"+arr[i]+"\n");
        }
        System.out.println(Arrays.toString(arr));

    }
}
