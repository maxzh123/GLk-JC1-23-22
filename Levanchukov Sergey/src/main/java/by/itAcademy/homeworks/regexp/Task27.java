package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * > Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что
 * > слова могут разделяться несколькими пробелами, в начале и конце текста также
 * > могут быть пробелы, но могут и отсутствовать.
 * */

public class Task27 {
    public static void main(String[] args) {
        countForWords();
    }

    public static void countForWords() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("\\w+"); //пытался добавить киррилицу, но не получилось
        Matcher m = p.matcher(sc.nextLine());
        while (m.find()) {
            count++;
        }
        System.out.println(count);
    }
}
