package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 > Создайте переменную для массива из 10 элементов. Заполните его
 > произвольными значениями целочисленного типа и выведите последний элемент
 > массива на экран.
 */
public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10]; //Инициализация массива
        Arrays.fill(array, 1); //С помощью метода класса Arrays заполняем массив единицами.
        System.out.println(array[9]); // Выводим последний элемент массива
    }
}
