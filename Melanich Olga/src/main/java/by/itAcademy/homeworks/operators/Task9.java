package by.itAcademy.homeworks.operators;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Scanner;

/**
 * Задание 9
 * Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 */

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer.print("Введите число: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (checkInputDate(day, month, year)) {
            Printer.print("Ошибка ввода данных. Введите другое число.");
        } else {
            Printer.print("Дата следующего дня: ");
            Printer.print(getNextDayDate(day, month, year));
        }
    }

    public static String getNextDayDate(int day, int month, int year) {
        if ((day == 28) && (month == 2) && !isLeapYear(year)) {
            day = 1;
            month++;
        } else if ((day == 28) && (month == 2) && isLeapYear(year)) {
            day++;
        } else if (day == 29 && month == 2) {
            day = 1;
            month++;
        } else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;
        } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
        } else if ((day == 31) && month == 12) {
            day = 1;
            month = 1;
            year++;
        } else {
            day++;
        }
        return day + "." + month + "." + year;
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public static boolean checkInputDate(int day, int month, int year) {
        return ((month > 12) || (day > 31) || ((day > 29) && (month == 2)) || ((day == 29) && !isLeapYear(year)));
    }
}
