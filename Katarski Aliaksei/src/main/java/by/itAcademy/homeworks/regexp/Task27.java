package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 Ввести текст посчитать количество слов в тексте.Учитывать что между словами могуть быть пробелы.
 */

public class Task27 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String string=sc.nextLine();
    numOfWords(string);
    }

    public static int numOfWords(String string){
        int count=0;
        Pattern p=Pattern.compile("([a-zA-Zа-яА-ЯЁё]+[-]?[ ]{2,}[a-zA-Zа-яА-ЯЁё]+)|([a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]+)");
        Matcher m=p.matcher(string);
        while(m.find()){
            count++;
        }
        System.out.println(count);
        return count;
    }
}
