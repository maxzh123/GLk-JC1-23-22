package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task18 {

    /**
     * Создайте переменную для массива из 10 элементов.
     * Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.
     */

    public static void main(String[] args){
        int [] array = new int [11];
        elementArr(array);
        System.out.println("Еhe last element of the array: " + lastElementArr(array));
    }

    public static void elementArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
        arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        }

    public static int lastElementArr(int [] arr){
        return arr[arr.length-1];
    }

}
