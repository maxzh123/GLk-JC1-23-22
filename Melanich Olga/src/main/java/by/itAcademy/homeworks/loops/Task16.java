package by.itAcademy.homeworks.loops;

import by.itAcademy.homeworks.utils.Printer;

/**
 * Задание 16
 * Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
 */

public class Task16 {
    public static void main(String[] args) {
        int initialValue = 1;
        int finalValue = 100;
        int number = 7;
        String str = "Hope!";
        getString(initialValue, finalValue, number, str);
    }

    // метод выводит строку для всех целых чисел, которые делятся на заданное число в диапазоне
    // можно и короче все сделать, без декомпозиции, но решила оставить так, метод универсален
    public static void getString(int initialValue, int finalValue, int number, String str) {
        for (int i = initialValue; i <= finalValue; i++) {
            if (i % number == 0) {
                Printer.print(i + " " + str);
            }
        }
    }
}
