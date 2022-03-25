package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что
 * > слова могут разделяться несколькими пробелами, в начале и конце текста также
 * > могут быть пробелы, но могут и отсутствовать.
 */


public class Task27 {
    public static void main(String[] args) {
        System.out.println("Input text : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[]strings = string.split("\\s|[!?]+|[,.-;:]|(\\.{3})");
            System.out.println(strings.length);
        }
    }
