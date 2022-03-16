package by.itAcademy.homeworks.arrays;

import by.itAcademy.homeworks.helper.Array;

import java.util.Arrays;

public class Task22 {

    /**Task22
     * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
     * Выведите на экран, переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).
     */

    public static void main(String[] args){
        int [] array = new int[10];
        Array arr = new Array();
        Array.elementArr(array);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Reverse array: " + Arrays.toString(reverseArray(array)));
    }

    public  static int [] reverseArray (int [] array){
        int sort_buble;
        for(int i = 0; i< array.length/2;i++){
            sort_buble = array[array.length-i-1];
            array[array.length-i-1]=array[i];
            array[i] = sort_buble;
        }
        return array;
    }
}
