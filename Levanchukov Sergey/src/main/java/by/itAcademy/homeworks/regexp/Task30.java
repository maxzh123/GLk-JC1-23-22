package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * > Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * > всех тегов абзацев, в том числе тех, у которых есть параметры, например, `<p
 * > id=”p1”>`, и замену их на простые теги абзацев `<p>`. Результат работы метода
 * > выведите на экран.
 **/

public class Task30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        System.out.println(searchForTags(searchForTags(text)));
    }

    public static String searchForTags(String text){
        return text.replaceAll("<p\\s[^>]*>","<p>");
    }
}
