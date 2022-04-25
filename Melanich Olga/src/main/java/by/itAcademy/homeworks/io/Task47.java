package by.itAcademy.homeworks.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 47
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 * Вывести результат на экран.
 */

public class Task47 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Melanich Olga\\src\\main\\resources\\Task47"));
        String str;
        String string = "";
        int counter = 0;
        while ((str = reader.readLine()) != null) {
            counter += findPunctuationInFile(str);
            string += str;
        }
        System.out.println(counter);
        System.out.println(findWordsInFile(string));
    }

    public static int findPunctuationInFile(String string) {
        Pattern pattern = Pattern.compile("[.]{3}|\\?[?!.]*|![!?.]*|[,.;:-]");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int findWordsInFile(String string) {
        Pattern pattern = Pattern.compile ("[А-Яа-яA-Za-zЁё]+");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}

