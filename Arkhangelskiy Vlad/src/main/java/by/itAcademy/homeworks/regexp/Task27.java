package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 26
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 *
 * Задание 27 Введите с клавиатуры текст.
 * Подсчитать количество слов в тексте.
 * Учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */

public class Task27 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        String str = reader.readLine();

        searcher(str);

        //String str = "  ТРАТТА,  dsfsdfsfsd sdfsdff авпавпв... sdsdf  1232 ereer  аываппхавпхавпхаепвх " + "em... чТО КУДА !     ";
    }

    public static void searcher (String str) {
        int words = 0;
        int puncts = 0;

        Pattern punct = Pattern.compile("\\.{3}|[\\p{Punct}]");
        String[] arrayText = str.split("\\s");
        for (
                String s : arrayText) {
            int count = 0;
            Matcher m = punct.matcher(s);
            while (m.find()) {
                ++count;
            }
            puncts += count;
            if (count != s.length()) {
                ++words;
            }
        }
        System.out.println("Количество слов: " + words);
        System.out.println("Колличество знаков припинания: " + puncts);
    }
}
/**
 * Можно сломать если между словом и троеточием поставить пробел(посчитает ... и как слово и как знак припинания) ,
 * на другие знаки препинания отрабатывает корректно.
 */
