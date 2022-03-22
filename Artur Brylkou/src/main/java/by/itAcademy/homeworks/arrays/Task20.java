package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        elemntArr(array);
        maxIndex(array);
    }

    public static void elemntArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void maxIndex(int[] arr) {
        int maxEl = arr[0];
        int maxInd = 0;
        for (int i =0; i<arr.length; i++){
            if (maxEl<arr[i]){
                maxEl = arr[i];
                maxInd = i;
            }
        }System.out.println(maxInd);
    }
}
