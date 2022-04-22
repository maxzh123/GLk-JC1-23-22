package by.itAcademy.homeworks.regexp;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();
        Pattern p = Pattern.compile("0x([0-9A-F]{2})");
        Matcher m = p.matcher(text);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
