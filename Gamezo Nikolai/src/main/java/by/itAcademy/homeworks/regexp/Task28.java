package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 28
 * Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
 */

public class Task28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scan.nextLine();
        System.out.print("Текст, из последних букв всех слов: " + lastLetters(str));
    }
    public static String lastLetters(String str) {
        String str1 = "";
        Pattern p = Pattern.compile("[а-яА-ЯёЁa-zA-Z]\\b");
        Matcher m = p.matcher(str);
        for (int i = 0; m.find() == true; i++) {
            str1 = str1 + m.group();
        }
        return str1;
    }
}
