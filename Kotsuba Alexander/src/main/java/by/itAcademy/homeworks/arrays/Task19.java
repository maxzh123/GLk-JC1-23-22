/*Создайте переменную для массива из 10 элементов (другим способом).
Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на четных позициях.*/

package by.itAcademy.homeworks.arrays;

import java.util.Random;

public class Task19 {
    public static void main(String[] args) {
        int arr[];
        arr = new int[10];
        Random ran = new Random();
        for(int i = 0;i<arr.length;i++){
            arr[i] = ran.nextInt(100);
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print( " "+ arr[i] );
        }
        System.out.println(" ");
        even(arr);
    }

    public static void even(int array[]){
        for(int i = 2;i<array.length;i+=2){
            System.out.print( " "+array[i] );
        }
    }
}
