package by.itAcademy.homeworks.regexp;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 29
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
 * записанных по правилам Java, с помощью регулярных выражений. Результат на экран.
 */

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("0[xX]([0-9A-Fa-f]{2})+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
           Printer.print(matcher.group());
        }
    }
}

