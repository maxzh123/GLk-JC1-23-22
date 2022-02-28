package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\w\\s"); // \\w - буквенно-цифровой символ или знак подчёркивания
                                                     // \\s - пробельный символ
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(text.charAt(matcher.end()-2));
        }
    }
}
