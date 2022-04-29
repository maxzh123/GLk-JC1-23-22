package by.itAcademy.homeworks.regexp;

//Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(gettext(s));
    }
    public static String gettext(String s){
        String s1="";
        Pattern p=Pattern.compile("[A-Za-zА-Яа-яЁё]\\b");
        Matcher m= p.matcher(s);
        while (m.find()){
            s1+=m.group();
        }
        return s1;
    }
}
