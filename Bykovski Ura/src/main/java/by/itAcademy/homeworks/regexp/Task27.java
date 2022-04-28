package by.itAcademy.homeworks.regexp;

//Введите с клавиатуры текст. Подсчитать количество слов в тексте.
//Учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s.trim();
        System.out.println(getCount(s1));
    }

    public static int getCount(String s1){
        int count=1;
        Pattern p=Pattern.compile(" +");
        Matcher m= p.matcher(s1);
        while (m.find()){
            count++;
        }
        return count;
    }
}
