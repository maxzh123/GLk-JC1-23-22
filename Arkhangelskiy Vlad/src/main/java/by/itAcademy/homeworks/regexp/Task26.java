package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 26
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */

public class Task26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = sc.nextLine();

        puncts(str);

        //String str = "sdfsd 123 dsfds, dssd? sdfds !  sdfsd... , , , , . ";
    }
    public static void puncts(String str) {
        Pattern pattern = Pattern.compile("\\.{3}|[\\p{Punct}]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Колличество знаков припинания: " + count);
    }

}




