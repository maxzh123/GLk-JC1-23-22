package by.itAcademy.homeworks.regexp;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 26
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */
public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[.]{3}|\\?[?!.]*|![!?.]*|[,.;:-]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        Printer.print(count);
    }
}




