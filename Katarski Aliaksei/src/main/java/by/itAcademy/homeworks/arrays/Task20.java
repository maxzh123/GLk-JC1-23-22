package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Создать массив ,найти максимальное значение и вывести индекс этого элемента.
 */
public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        maxEl(array);
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*10);
        }System.out.println(Arrays.toString(arr));

    }
    public static void maxEl(int[] arr){
        int max=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
           if(max<arr[i]){
               max=arr[i];
               index=i;
           }
        }System.out.println(max+"  "+index);
    }
}