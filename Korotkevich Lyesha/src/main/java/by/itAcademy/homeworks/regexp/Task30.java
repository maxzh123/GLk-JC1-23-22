package by.itAcademy.homeworks.regexp;

import java.util.Scanner;

/**Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке всех тегов абзацев,
в том числе тех, у которых есть параметры, например, <p id=”p1”>, и замену их на простые теги абзацев <p>.
 Результат работы метода выведите на экран.*/

public class Task30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(replaceTags(str));
    }

    public static String replaceTags(String str){
        return str.replaceAll("<p\\s*?\\S*>", "<p>");
    }
}
