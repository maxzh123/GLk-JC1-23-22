package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие
 * > знаки препинания. Подсчитать общее их количество.
 */

//\?[?!.]*|\![!?.]*|[.,:-]
public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.toString();
        Pattern pattern = Pattern.compile("\\?[?!.]*|\\![!?.]*|[.,:-]");
        Matcher matcher = pattern.matcher(string);
        int value = 0;
        while (matcher.find()){
            value++;
        }
        System.out.println(value);
    }
}
