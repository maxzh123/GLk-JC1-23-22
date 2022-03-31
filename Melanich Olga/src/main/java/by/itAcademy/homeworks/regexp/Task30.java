package by.itAcademy.homeworks.regexp;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 30
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке всех тегов абзацев,
 * в том числе тех, у которых есть параметры, например, <p id=”p1”>, и замену их на простые теги абзацев <p>.
 * Результат работы метода выведите на экран.
 */

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("<p\\s+[^>]*>");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            text = matcher.replaceAll("<p>");
        }
        Printer.print(text);
    }
}

