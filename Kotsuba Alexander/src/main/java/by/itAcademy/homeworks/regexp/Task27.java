/*Введите с клавиатуры текст. Подсчитать количество слов в тексте.
 Учесть, что слова могут разделяться несколькими пробелами,
 в начале и конце текста также могут быть пробелы, но могут и отсутствовать.*/

package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        String st = getLine();
        System.out.println("Кол-во слов: " + getWords(st));
    }

    public static String getLine(){
        System.out.println("Введите предложение: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        return sentence;
    }

    public static int getWords(String sentence){
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = pattern.matcher(sentence);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        return count;
    }
}
