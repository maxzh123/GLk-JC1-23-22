package by.itAcademy.homeworks.loops;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Задать произвольное число, вывести его в бухгалтерском формате.
 */

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        DecimalFormat formater = (DecimalFormat) NumberFormat.getInstance();
        DecimalFormatSymbols symbols = formater.getDecimalFormatSymbols();
        symbols.setGroupingSeparator(' ');
        formater.setDecimalFormatSymbols(symbols);
        System.out.println(formater.format(value));
    }
}
