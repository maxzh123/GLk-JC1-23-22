package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();
        Pattern p = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher m = p.matcher(text);
        StringBuilder rezult = new StringBuilder();
        while (m.find()){
            rezult.append(text.substring(m.end()-1, m.end()));
        }
        System.out.println(rezult);
    }
}
