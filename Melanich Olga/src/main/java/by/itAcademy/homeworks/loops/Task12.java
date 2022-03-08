package by.itAcademy.homeworks.loops;

import by.itAcademy.homeworks.utils.Printer;

/**
 * Задание 12
 * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */

public class Task12 {
    public static void main(String[] args) {
        int number = 10;
        Printer.print(calculateFactorial(number));
    }

    // Вычисляем факториал числа, для number = 0 принимая в качестве соглашения, что 0! = 1.
    public static int calculateFactorial(int num) {
        int i = 1;
        int factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
