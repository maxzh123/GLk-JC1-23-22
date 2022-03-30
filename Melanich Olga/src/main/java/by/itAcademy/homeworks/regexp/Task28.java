package by.itAcademy.homeworks.regexp;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 28
 * Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
 */
public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[А-Яа-я-A-Za-zЁё]\\b");
        Matcher matcher = pattern.matcher(text);
        String string = " ";
        while (matcher.find()) {
            string += matcher.group();
        }
        Printer.print(string);
    }

}

