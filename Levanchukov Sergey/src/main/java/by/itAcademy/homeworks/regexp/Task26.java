package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * > Введите с клавиатуры строку. Найти в строке не только запятые, но и другие
 * > знаки препинания. Подсчитать общее их количество.
 **/

public class Task26 {
    public static void main(String[] args) {
        count();
    }

    public static void count() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("\\.{3}?|\\p{Punct}");
        Matcher m = p.matcher(sc.nextLine());
        while (m.find()) {
            count++;
        }
        System.out.println(count);
    }
}

