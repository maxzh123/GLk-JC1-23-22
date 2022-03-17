package by.itAcademy.homeworks.loops;

import by.itAcademy.homeworks.utils.Printer;

/**
 * Задание 14
 * Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */

public class Task14 {
    public static void main(String[] args) {
        long number = 7893823445L;
       Printer.print(calculateSum(number));
    }
    // метод вычисляет сумму всех цифр числа
    public static int calculateSum(long number) {
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        return sum;
    }
}
