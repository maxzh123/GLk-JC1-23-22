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
        System.out.print("Введите строку: ");
        String str = scan.nextLine();
        System.out.print("Количество знаков препинания в строке: " + punctuationMarkCount(str));
    }
    public static int punctuationMarkCount(String str) {
        int count = 0;
        Pattern p = Pattern.compile("[.]{3}|[.,;:!?\\-\"()]");
        Matcher m = p.matcher(str);
        for (count = 0; m.find() == true; count ++) {
            }
        return count;
    }
}
