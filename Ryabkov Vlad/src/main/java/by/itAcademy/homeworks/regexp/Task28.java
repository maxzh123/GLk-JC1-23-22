package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры текст. Выведите на экран текст, составленный из
 * > последних букв всех слов из исходного текста
 */

public class Task28 {
    public static void main(String[] args) {
        System.out.println("Input text : ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String str = "";
        Pattern pattern = Pattern.compile("[а-яА-яa-zA-z]\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {

            str+=matcher.group();
        }
        System.out.println(str);
    }
}

