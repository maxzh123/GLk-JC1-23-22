package by.itAcademy.homeworks.arrays;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Arrays;

/** Задание 19
 * Создайте переменную для массива из 10 элементов (другим способом).
 * Заполните его произвольными значениями и выведите на экран элементы, стоящие на четных позициях.
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Printer.print(Arrays.toString(Task18.fillArray(array)));
        getEvenPositions(array);
    }
    public static void getEvenPositions(int[] arr) {
              for (int i = 2; i < arr.length; i += 2) {
                  Printer.print(arr[i]);
        }
    }
}
