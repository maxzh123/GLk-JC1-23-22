package by.itAcademy.homeworks.arrays;

/**
 *Задание 18
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.
 */

public class Task18 {
    public static void main(String[] args) {
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        System.out.println("Последний элемент массива " + mass[mass.length - 1]);
    }
}
