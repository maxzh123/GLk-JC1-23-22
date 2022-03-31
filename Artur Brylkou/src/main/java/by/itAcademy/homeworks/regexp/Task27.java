package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();
        Pattern p = Pattern.compile("[А-Яа-яЁёA-Za-z]+-?[А-Яа-яЁёA-Za-z]+");
        Matcher m = p.matcher(text);
        int count =0;
        while (m.find()){
            count++;
        }
        System.out.println("Количество слов "+count);
    }
}
