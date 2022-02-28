package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 *> Создайте переменную для массива из 10 элементов. Заполните его
 *> произвольными значениями целочисленного типа. Выведите на экран, переверните
 *> и снова выведите на экран (при переворачивании нежелательно создавать еще один
 *> массив).
 **/
public class Task22 {
    public static void main(String[] args) {
        int [] array=new int[10];

        /**Заполнение массива случайными числами до 9*/
        for (int i=0;i< array.length;i++)
        {
            array[i]= (int) (Math.random()*10);
        }
        System.out.println("Первоначальный массив "+Arrays.toString(array));

        /**Инверсия массива*/
        for(int i=0;i< array.length/2;i++)
        {
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }

        System.out.println("Массив в обратной последовательности "+Arrays.toString(array));

    }
}
