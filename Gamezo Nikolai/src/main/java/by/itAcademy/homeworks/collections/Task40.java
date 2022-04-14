package by.itAcademy.homeworks.collections;

import java.util.ArrayList;

/**
 * Задание 40
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.
 */

public class Task40 {
    public static void main(String[] args) {
        int arrayLength = 25;
        ArrayList<Integer> array = new ArrayList<Integer>();
        fillArray(array, arrayLength);
        System.out.println("Исходный массив: " + array);
        System.out.println("Без повторяющихся чисел: " + deleteRecurring(array));
    }
    //заполнение ArrayList
    public static ArrayList<Integer> fillArray(ArrayList<Integer> array, int arrayLength) {
        for (int i = 0; i <= arrayLength; i++) {
            array.add((int) (Math.random() * 11));
        }
        return array;
    }
    //копирование в новый ArrayList уникальных элементов из исходного
    public static ArrayList<Integer> deleteRecurring(ArrayList<Integer> array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i <= array.size() - 1; i++) {
            if (!newArray.contains(array.get(i))) {
                newArray.add(array.get(i));
            }
        }
        return newArray;
    }
}
