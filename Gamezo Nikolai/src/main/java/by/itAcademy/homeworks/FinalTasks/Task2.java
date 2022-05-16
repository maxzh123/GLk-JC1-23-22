package by.itAcademy.homeworks.FinalTasks;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int array [] = new int[10];
        fillArray(array);
        System.out.println("Исходный массив: " + "\n" + Arrays.toString(array));
        System.out.println("Максимальный элемент: " + maxElement(array));
        System.out.println("Минимальный  элемент: " + minElement(array));
        System.out.println("Массив после замены: " + "\n" + Arrays.toString(replaceElement(array)));
    }
    public static int [] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 600 - 300);
        }
        return array;
    }
    public static int  maxElement(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int  minElement(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int maxIndex(int[] array) {
        int maxindex = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
    public static int minIndex(int[] array) {
        int minindex = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minindex = i;
            }
        }
        return minindex;
    }
    public static int[] replaceElement(int[] array) {
        array[maxIndex(array)] = array[minIndex(array)] * array[maxIndex(array)];
        return array;
    }
}
