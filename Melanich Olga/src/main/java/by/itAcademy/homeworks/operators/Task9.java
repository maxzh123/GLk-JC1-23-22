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
        Printer.print("Input a number: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        printNextDayDate(day, month, year);
    }

    public static void printNextDayDate(int day, int month, int year) {
        if ((day == 28) && (month == 2) && !isLeapYear(year)) {
            day = 1;
            month++;
            Printer.print("дата следующего дня: " + day + "." + month + "." + year);
        } else if ((day == 28) && (month == 2) && isLeapYear(year)) {
            day++;
            Printer.print("дата следующего дня: " + day + "." + month + "." + year);
        } else if (day == 29 && month == 2) {
            day = 1;
            month++;
            Printer.print("дата следующего дня: " + day + "." + month + "." + year);
        } else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;
            System.out.println("дата следующего дня: " + day + "." + month + "." + year);
        } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
            Printer.print("дата следующего дня: " + day + "." + month + "." + year);
        } else if ((day == 31) && month == 12) {
            day = 1;
            month = 1;
            year++;
            Printer.print("дата следующего дня: " + day + "." + month + "." + year);
        } else {
            day++;
            Printer.print("дата следующего дня: " + day + "." + month + "." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}
