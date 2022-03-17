package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * > Введите с клавиатуры текст. Выведите на экран текст, составленный из
 * > последних букв всех слов из исходного текста.
 * //[A-Za-z]+(?:[-][a-z]+)
 **/

public class Task28 {
    Scanner sc=new Scanner(System.in);
    String text=sc.toString();


    public static void printText(String text){
        Pattern pattern=Pattern.compile("");
        Matcher matcher=pattern.matcher(text);
    }
}
