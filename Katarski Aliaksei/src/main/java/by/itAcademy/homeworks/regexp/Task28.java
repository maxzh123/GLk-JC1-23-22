package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ввести с клавиатуры текст.составить новый текст,составленный из последних букс слов исходного текста.
 */

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lastCharFromText = sc.nextLine();
        lastCharText(lastCharFromText);
    }

    public static String lastCharText(String string) {
        String b="";
        Pattern p = Pattern.compile("([а-яА-Яa-zA-ZёЁ](?=\\s|\\.|,|;|:|\\!))");
        Matcher m = p.matcher(string);
        while (m.find()) {
        b+=m.group();
        }
        System.out.println(b);
        return b;
    }
}