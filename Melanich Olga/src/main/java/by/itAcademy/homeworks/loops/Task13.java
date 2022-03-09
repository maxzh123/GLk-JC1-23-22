package by.itAcademy.homeworks.loops;

import by.itAcademy.homeworks.utils.Printer;

import java.math.BigInteger;

/**
 * Задание 13
 * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */

public class Task13 {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 25;
        Printer.print(calculateProductOfNumbers(firstNumber, lastNumber));
    }
    // Вычисляет призведение чисел в заданном промежутке, включая начальное и конечное значение.
    public static BigInteger calculateProductOfNumbers(int number1, int number2) {
        BigInteger result = new BigInteger("1");
        int i = number1;
        do {
            result = result.multiply(BigInteger.valueOf(i));
            i++;
        } while (i <= number2);
        return result;
    }
}
