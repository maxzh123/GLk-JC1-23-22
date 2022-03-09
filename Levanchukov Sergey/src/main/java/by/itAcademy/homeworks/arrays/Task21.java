package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа. Определите сумму элементов
 * > массива, расположенных между минимальным и максимальным значениями. Если
 * > значений максимальных и минимальных несколько, то необходимо взять
 * > максимальное значение разницы индексов между максимальным и минимальным
 * > значениями.
 **/

public class Task21 {

       public static void main(String[] args) {

           int [] array=new int[10];
           initArray(array);
           System.out.println(Arrays.toString(array));
           System.out.println(forSumArray(array));

    }
    /**инициализация массива*/
    public static void initArray (int [] arr){
       for (int i=0 ;i< arr.length;i++){
           arr[i]=(int)(Math.random()*100);
       }
    }

    /**метод возвращающий максимально удаленные индексы друг от друга*/
    public static int forSumArray(int arr[]){
        int min=Search.getIndexMin(arr);
        int max=Search.getIndexMax(arr);
        return sumArray(arr, min,max);
    }

    /**сумма между максимальных и минимальным индексом*/
    public static int sumArray(int arr[], int max, int min){
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (i >= max && i <= min) {
                sum = sum + arr[i];
            } else if (i >= min&& i <= max) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
