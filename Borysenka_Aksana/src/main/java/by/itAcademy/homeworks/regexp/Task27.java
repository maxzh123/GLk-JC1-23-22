package by.itAcademy.homeworks.regexp;

import by.itAcademy.homeworks.helper.strScanner;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {

    /**Task27
     * Введите с клавиатуры текст. Подсчитать количество слов в тексте.
     * Учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
     */

    public static void main(String[] args) {
        strScanner strObject = new strScanner();
        String str = strObject.strEnter();
        System.out.println("Количество слов в тексте - " + getCount(str));
    }

    public static int getCount(String str) {
        Pattern p = Pattern.compile("[А-Яа-яЁёA-Za-z]+(?:[-][А-Яа-яЁёA-Za-z]+)*", Pattern.MULTILINE);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()){
            count++;
        }
        return count;
    }

}
