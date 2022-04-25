package by.itAcademy.homeworks.regexp;

//Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных выражений.
// Результат работы метода выведите на экран.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(get16(s));
    }
    public static String get16(String s){
        String s1="";
        Pattern p=Pattern.compile("0x([0-9A-F]{2})+");
        Matcher m= p.matcher(s);
        while (m.find()){
            s1+=m.group()+" ";
        }
        return s1;
    }
}
