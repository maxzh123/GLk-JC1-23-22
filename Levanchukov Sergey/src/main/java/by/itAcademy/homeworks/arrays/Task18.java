package by.itAcademy.homeworks.arrays;

import java.util.Scanner;

/**
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа и выведите последний элемент
 * > массива на экран.
 **/

public class Task18 {
    public static void main(String[] args) {
        int [] array=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i< array.length;i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.println("Последний элемент "+array[array.length-1]);
    }
}
