package by.itAcademy.homeworks.arrays;
/**
 * Задание 22
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 * Выведите на экран, переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).
 */
public class Task22 {
    public static void main(String[] args) {
        int array[] = new int[10];
        randomArray(array);
        printArray(array);
        printArrayRevers(array);
    }
    public static int[] randomArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    public static void printArrayRevers(int[] array) {
        for (int  i = array.length - 1; i>=0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(int[] array) {
        for (int i=0;  i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
