package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        int[] array = {13,67,234,98,60,85,26,456,37,79};
        System.out.println(Arrays.toString(array));
        evenNumbers(array);
    }

    public static void evenNumbers(int[] arr) {
        for (int i=0;i<arr.length; i++){
            if (i%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }

    }

}
