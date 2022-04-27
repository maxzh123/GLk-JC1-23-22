package by.itAcademy.homeworks.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 47
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов. Вывести результат на экран.
 */
public class Task47 {
    public static void main(String[] args) throws IOException {
        String string = "";
        String str;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Gamezo Nikolai\\src\\main\\resources\\ForTask47"));
        str = bufferedReader.readLine();
        while (str != null) {
            str = bufferedReader.readLine();
            if (str != null) {
                string = string + str + " ";
            }
        }
        System.out.println("Текст: " + string);
        System.out.println("Количество слов в тексте: " + wordsCount(string));
        System.out.println("Количество знаков препинания в тексте: " + punctuationMarkCount(string));
    }
    public static int wordsCount(String string) {
        int count = 0;
        Pattern p = Pattern.compile("[а-яА-ЯёЁa-zA-Z]{2,}");
        Matcher m = p.matcher(string);
        for (count = 0; m.find() == true; count++) {
        }
        return count;
    }
    public static int punctuationMarkCount(String string) {
        int count = 0;
        Pattern p = Pattern.compile("[.]{3}|[.,;:!?\\-\"()]");
        Matcher m = p.matcher(string);
        for (count = 0; m.find() == true; count ++) {
        }
        return count;
    }
}
