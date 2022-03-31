package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных
 * выражений. Результат работы метода выведите на экран.
 */

public class Task29 {
    public static void main(String[] args) {
        System.out.println("Input text : ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("0x([0-9A-F]{2})+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        System.out.println(matcher.group());
    }
}
