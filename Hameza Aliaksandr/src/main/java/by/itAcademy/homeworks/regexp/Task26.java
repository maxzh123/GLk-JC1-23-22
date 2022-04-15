package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 26
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */

public class Task26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        Pattern p = Pattern.compile("\\?[?!.]*|\\![!?.]*|[.,:-]");
        Matcher m = p.matcher(str);
        while (m.find()){
            count++;
        }
    System.out.println(count);
    }
}
