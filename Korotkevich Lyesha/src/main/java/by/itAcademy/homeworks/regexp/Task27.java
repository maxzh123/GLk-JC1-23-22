package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Введите с клавиатуры текст. Подсчитать количество слов в тексте.
Учесть, что слова могут разделяться несколькими пробелами,
в начале и конце текста также могут быть пробелы, но могут и отсутствовать.*/
public class Task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split("(\\s+|[!?]+|\\.{3}|[,;:\"'()\\.-]\\s?)");
        System.out.println(str1.length);
    }
}
