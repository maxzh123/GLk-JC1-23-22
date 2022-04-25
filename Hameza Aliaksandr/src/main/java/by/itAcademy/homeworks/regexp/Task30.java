package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке всех тегов абзацев,
 в том числе тех, у которых есть параметры, например, <p id=”p1”>, и замену их на простые теги абзацев <p>.
 Результат работы метода выведите на экран.
 */

public class Task30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scan.nextLine();
        System.out.println("Изменённая строка : " + replaceTags(str));
    }

    public static String replaceTags(String str) {
        Pattern p = Pattern.compile("<p\\s[^>]*>");
        Matcher m = p.matcher(str);
        str = m.replaceAll("<p>");
        return str;
    }
}
