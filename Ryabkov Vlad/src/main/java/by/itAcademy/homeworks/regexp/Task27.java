package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что
 * > слова могут разделяться несколькими пробелами, в начале и конце текста также
 * > могут быть пробелы, но могут и отсутствовать.
 */


//[а-яА-яa-zA-z]+
public class Task27 {
    public static void main(String[] args) {
        System.out.println("Input text : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.toString();
        Pattern pattern = Pattern.compile("[а-яА-яa-zA-z]+");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int value = 0;
        while (matcher.find()){
            value++;
        }
        System.out.println(value);
    }
}
