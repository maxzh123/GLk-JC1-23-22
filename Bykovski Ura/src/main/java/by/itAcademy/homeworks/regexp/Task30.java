package by.itAcademy.homeworks.regexp;

//Введите с клавиатуры строку.
//Напишите метод, выполняющий поиск в строке всех тегов абзацев, в том числе тех,
// у которых есть параметры, например, <p id=”p1”>, и замену их на простые теги абзацев <p>.
// Результат работы метода выведите на экран.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(getstr(s));
    }
    public static String getstr(String s){
           s = s.replaceAll("<p\\s*[^>]*>","<p>");
        return s;
    }
}
