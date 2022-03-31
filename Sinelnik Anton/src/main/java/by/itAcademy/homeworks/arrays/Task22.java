package by.itAcademy.homeworks.arrays;

/**
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 * Выведите на экран, переверните и снова выведите на экран
 * (при переворачивании нежелательно создавать еще один массив).
 */

public class Task22 {
    public static void main(String[] args) {
    int [] array = new int [10];
    random(array);
    printArray(array);
    reversPrintArray(array);

    }

    public static int[] random (int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        return array;
    }

    public static void printArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void reversPrintArray (int [] array) {
        for (int i = array.length-1; i>=0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
