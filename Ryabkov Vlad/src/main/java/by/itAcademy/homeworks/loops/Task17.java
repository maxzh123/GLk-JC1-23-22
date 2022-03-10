package by.itAcademy.homeworks.loops;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Задать произвольное число, вывести его в бухгалтерском формате.
 */

public class Task17 {
    public static void main(String[] args) {
//        DecimalFormat formater = (DecimalFormat) NumberFormat.getInstance();
//        DecimalFormatSymbols symbols = formater.getDecimalFormatSymbols();
//        symbols.setGroupingSeparator(' ');
//        formater.setDecimalFormatSymbols(symbols);
//        System.out.println(formater.format(value));
        long l = 589798749;
        String result = "";
        do {
            result = l % 1000 + " " + result;
            l = l / 1000;

        } while (l > 0);
    }
}
