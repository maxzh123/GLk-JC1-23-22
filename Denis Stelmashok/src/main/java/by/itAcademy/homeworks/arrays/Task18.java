package by.itAcademy.homeworks.arrays;

import java.util.Scanner;

/**> Создайте переменную для массива из 10 элементов. Заполните его
        > произвольными значениями целочисленного типа и выведите последний элемент
        > массива на экран.*/
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Ввод массива: " + (i+1));
            array[i]=sc.nextInt();
        }
        System.out.println("Последний элемент массива: " + array[array.length-1]);
    }
}
