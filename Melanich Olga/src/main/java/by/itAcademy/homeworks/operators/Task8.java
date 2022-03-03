package by.itAcademy.homeworks.operators;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Scanner;

/**
 * Задание 8
 * Задать целое число в виде переменной, это число – сумма денег в рублях.
 * Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer.print("Input a number: ");
        int sumRub = sc.nextInt();
        Printer.print(rubCorrectCase(sumRub));
    }

    public static String rubCorrectCase(int a) {
        String str1 = "рубль";
        String str2 = "рубля";
        String str3 = "рублей";
        if (a % 10 == 1 && a % 100 != 11) {
            return str1;
        }
        if (a % 10 == 2 || a % 10 == 3 || a % 10 == 4) {
            return str2;
        }
        return str3;
    }
}