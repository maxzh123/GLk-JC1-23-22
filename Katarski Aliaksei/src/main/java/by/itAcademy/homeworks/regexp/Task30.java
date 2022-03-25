package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * > всех тегов абзацев, в том числе тех, у которых есть параметры, например, `<p
 * > id=”p1”>`, и замену их на простые теги абзацев `<p>`. Результат работы метода
 * > выведите на экран.
 */

public class Task30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String parReplace=sc.nextLine();
        paragraphReplace(parReplace);
    }
    public static void paragraphReplace(String string){
        System.out.println(string.replaceAll("<[а-яА-Яa-zA-ZёЁ]\\s?[^>]+>","<p>"));
    }
}
