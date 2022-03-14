package by.itAcademy.homeworks.arrays;


import java.util.Arrays;

import static by.itAcademy.homeworks.Untils.RandomArray.randomarray;

/**
 * Создать массив из 10 элементов, заполнить случайными числами.
 * Определить сумму элементов массива между минимальным и максимальным значением
 */
public class Task21 {
    private static Object RandomArray;

    public static void main(String[] args) {
        int[] values = new int[10];
        int[] values1 = randomarray(values);
        System.out.println(Arrays.toString(values1));
        System.out.println(" Min index is : " + findMinIndex(values1));
        System.out.println(" Max index is : " + findMaxIndex(values1));
        System.out.println(calculateSum(values1));
    }

    public static int calculateSum(int[] values){
        int minIndex = findMaxIndex(values);
        int maxIndex = findMaxIndex(values);
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex - 1; i++) {
            result += values[i];
        }return result;
    }

    public static int findMinIndex(int values[]) {
        int minValue = values[0];
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }

        }return minIndex;
    }
    public static int findMaxIndex(int values[]) {
        int maxValue = values[0];
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }

        }return maxIndex;
    }
}
