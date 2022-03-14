package by.itAcademy.homeworks.arrays;
import static by.itAcademy.homeworks.Untils.RandomArray.randomarray;

/**
 * Заполнить массив из 10 элементов и запонить его. вывести на экран в обычном порядкеЮ затем в перевернутом
 */

public class Task22 {
    public static void main(String[] args) {
        int[] value = new int[10];
        int[] value1 = randomarray(value);
        printArray(value1);
        printArrayRevers(value1);
    }

    public static void printArrayRevers(int[] value) {
        for (int  i = value.length - 1; i>=0; i--) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }


    public static void printArray(int[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }
}
