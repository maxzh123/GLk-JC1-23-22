/*Создайте переменную для массива из 10 элементов (другим способом).
Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на четных позициях.*/

package by.itAcademy.homeworks.arrays;

import java.util.Random;

public class Task19 {
    public static void main(String[] args) {
        int array[];
        array = new int[10];
        Random ran = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = ran.nextInt(100);
        }
        for(int i = 0;i<array.length;i++){
            System.out.print( " "+ array[i] );
        }
        System.out.println(" ");
        even(array);
    }

    public static void even(int arr[]){
        for(int i = 2;i<arr.length;i+=2){
            System.out.print( " "+arr[i] );
        }
    }
}
