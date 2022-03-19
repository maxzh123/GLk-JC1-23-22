package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * > Введите с клавиатуры текст. Выведите на экран текст, составленный из
 * > последних букв всех слов из исходного текста.
 **/

public class Task28 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        result(text);
    }

    public static void result (String text){
        System.out.println(text);
        Pattern patternForWords=Pattern.compile("[A-Za-z]+(?:[-][a-z]+)?",Pattern.MULTILINE);
        Pattern patternForLastLetter=Pattern.compile("([a-z])$");
        Matcher matcherForWords=patternForWords.matcher(text);
        while (matcherForWords.find()){
            System.out.println("Найдено "+matcherForWords.group(0));
        }
    }
}
