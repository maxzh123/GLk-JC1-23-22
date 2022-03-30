package by.itAcademy.homeworks.regexp;

import by.itAcademy.homeworks.utils.Printer;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 27
 * Введите с клавиатуры текст. Подсчитать количество слов в тексте.
 * Слова могут разделяться несколькими пробелами,в начале и конце текста могут быть пробелы,могут и отсутствовать.
 */

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile ("[А-Яа-я-A-Za-zЁё]+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
       Printer.print(count);
    }
}
