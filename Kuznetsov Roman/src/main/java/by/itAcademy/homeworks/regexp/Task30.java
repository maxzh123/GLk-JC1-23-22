package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static String htmlEdit(String text){
        return text.replaceAll("<p\\s[^>]*>","<p>");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(htmlEdit(text));
    }
}
