package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Scanner;
/**> Создайте переменную для массива из 10 элементов. Заполните его
        > произвольными значениями целочисленного типа. Найдите максимальный элемент
        > и выведите его индекс.*/
public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayWithRandom(array);
        int maxIdx=findIndexOfMax(array);
        printArray(array);
        System.out.println("Максимальный элемент " + array[maxIdx]);
        System.out.println("Индекс " + maxIdx);
    }
    public static  void printArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Элемент " + i +" равен " +array[i]);
//        }
        System.out.println(Arrays.toString(array));
    }

    public static  void fillArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ввод массива: " + (i + 1));
            array[i] = sc.nextInt();
        }
    }
    public static  void fillArrayWithRandom(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
    }
    public  static int findIndexOfMax(int[] array){
        int index=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>array[index]){index=i;}
        }
        return index;
    }

}
