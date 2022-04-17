package by.itAcademy.homeworks.arrays;

import java.util.Scanner;
/**> Создайте переменную для массива из 10 элементов. Заполните его
        > произвольными значениями целочисленного типа. Найдите максимальный элемент
        > и выведите его индекс.*/
public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ввод массива: " + (i + 1));
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент " + max);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] < array[i]) {
                array[0] = array[i];
                index = i+1;
            }
        }
        System.out.println("Индекс " + index);
    }
}
