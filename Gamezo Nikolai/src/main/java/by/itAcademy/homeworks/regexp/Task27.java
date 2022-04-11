package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 27
 * Введите с клавиатуры текст. Подсчитать количество слов в тексте.
 * Учесть, что слова могут разделяться несколькими пробелами,
 * в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */

public class Task27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scan.nextLine();
        System.out.print("Количество слов в тексте : " + wordsCount(str));
    }
    public static int wordsCount(String str) {
        int count = 0;
        Pattern p = Pattern.compile("[а-яА-ЯёЁa-zA-Z]{2,}");
        Matcher m = p.matcher(str);
        for (count = 0; m.find() == true; count ++) {
        }
        return count;
    }
}

