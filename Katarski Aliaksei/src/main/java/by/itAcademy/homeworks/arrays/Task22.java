package by.itAcademy.homeworks.arrays;
/**
 * Создать массив,вывести,развернуть и снова вывести.
 */

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args){
    int[] array={12,32,1,54,21,3};
        System.out.println(Arrays.toString(array)+" -изначальный массив");
        arrayReverse(array);
    }
    public static int[] arrayReverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr)+" -перевернутый массив");
        return arr;
    }
}



