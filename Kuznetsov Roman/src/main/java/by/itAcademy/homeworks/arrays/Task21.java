package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task21 {
    /**
     * Принимает на вход массив, заполняет его случайными числами и возвращает обратно.
     * @param a
     * @return
     */
    protected static int[] fillingArray(int[] a){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    /**
     * Принимает на вход массив, находит максимальный и минимальный элементы. Возвращает сумму всех
     * элементов между ними
     * @param array
     * @return
     */
    public static int calcSum(int[] array){
        int indexMax = IndexSearcher.getIndexMax(array);
        int indexMin = IndexSearcher.getIndexMin(array);
        return sumElementsOfArray(array, indexMax, indexMin);
    }

    /**
     * Принимает максимальный, минимальный элементы массивов, а так же сам массив. Суммирует элементы
     * между ними и возвращает сумму.
     * @param array
     * @param indexMax
     * @param indexMin
     * @return
     */
    public static int sumElementsOfArray (int[] array, int indexMax, int indexMin) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > indexMax && i < indexMin) {
                sum = sum + array[i];
            } else if (i > indexMin && i < indexMax) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];//инициализация массива
        array = fillingArray(array); //Заполнение массива случайными числами
        System.out.println("Array: "+ Arrays.toString(array));
        System.out.println("Sum: " +calcSum(array)); //Не включая максимальный и минимальный элемент
    }
}
