package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void hexFromString(String text){
        Pattern pattern = Pattern.compile("0x[0-9,A-F]{1,}"); //Регулярка для 16ричного числа.
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.subSequence(matcher.start(),matcher.end()));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        hexFromString(text);
    }
}
