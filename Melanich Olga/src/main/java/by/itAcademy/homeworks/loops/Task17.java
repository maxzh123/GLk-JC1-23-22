package by.itAcademy.homeworks.loops;

import by.itAcademy.homeworks.utils.Printer;

import java.text.NumberFormat;
import java.util.Scanner;

/** Задание 17
 * Задать произвольное целое число и вывести его в бухгалтерском формате.
 */

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Printer.print("Enter the number: ");
        int number = in.nextInt();
        NumberFormat format = NumberFormat.getInstance();
        Printer.print(format.format(number));
    }
}
