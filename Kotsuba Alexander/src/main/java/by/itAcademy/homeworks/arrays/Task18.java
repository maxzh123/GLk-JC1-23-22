/*Создайте переменную для массива из 10 элементов.
 Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран. */

package by.itAcademy.homeworks.arrays;

import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        int array[] = new int[10];
        Random ran = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = ran.nextInt(100);
        }
        for(int i = 0;i<array.length;i++){
            System.out.print( " "+ array[i]);
        }
        System.out.println("\n Last element:  "+ lastElement(array));
    }

    public static int lastElement(int arr[]){
        return arr[arr.length -1];
    }
}
