/*Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 Выведите на экран, переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).*/

package by.itAcademy.homeworks.arrays;

import java.util.Random;

public class Task22 {
    public static void main(String[] args) {
        Random ran = new Random();
        int array[] = new int[10];
        for(int i = 0;i<array.length;i++){
            array[i] = ran.nextInt(100);
            System.out.print(" "+array[i]);
        }

        for(int i = 0 ; i<array.length/2;i++){
            int j = array[i];
            array[i] = array[10 - 1 - i];
            array[10 -1 - i] = j;
        }
        System.out.println("\n");
        System.out.println("Перевернутый массив: ");
        for(int i = 0;i<array.length;i++){
            System.out.print(" " + array[i]);
        }
    }
}
