package by.itAcademy.homeworks.loops;

import by.itAcademy.homeworks.utils.Printer;

/**
 * Задание 15
 * Найти среди чисел от 50 до 70 второе простое число и завершить цикл с использованием break.
 */

public class Task15 {
    public static void main(String[] args) {
        int fistNumber = 50;
        int lastNumber = 70;
        Printer.print(findSecondPrimeNumber(fistNumber, lastNumber));
    }

    // метод вычисляет второе простое число в заданном промежутке
    public static int findSecondPrimeNumber(int num1, int num2) {
        int secondPrimeNumber = 0;
        int counter = 0;
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                counter++;
            }
            if (counter == 2) {
                secondPrimeNumber = i;
                break;
            }
        }
        return secondPrimeNumber;

    }

    // метод определяет является ли число простым
    public static boolean isPrime(int num) {
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



