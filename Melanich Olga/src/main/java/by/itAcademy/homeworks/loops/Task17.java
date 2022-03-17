package by.itAcademy.homeworks.loops;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Arrays;

/**
 * Задание 17
 * Задать произвольное целое число и вывести его в бухгалтерском формате.
 */

public class Task17 {
    public static void main(String[] args) {
        long number = -9876543;
        if (number > 0) {
            Printer.print(accountingNumberFormatPlus(number));
        }
        if (number < 0) {
            Printer.print(accountingNumberFormatMinus(number));
        }
        if (number == 0) {
            Printer.print("0");
        }
    }

    public static String accountingNumberFormatPlus(long number) {
        String result = "";
        do {
            result = number % 1000 + " " + result;
            number = number / 1000;
        } while (number > 0);
        return result;
    }

    public static String accountingNumberFormatMinus(long number) {
        String result = "";
        do {
            result = (number % 1000 * (-1)) + " " + result;
            number = number / 1000;
        } while (number < 0);
        return "-" + result;
    }
}





