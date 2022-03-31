package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных
 * выражений. Результат работы метода выведите на экран.
 */
public class Task29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str16x=sc.nextLine();
        findJava16x(str16x);
    }
    public static void findJava16x(String string){
        Pattern p=Pattern.compile("0x([0-9A-F]{2})+");
        Matcher m=p.matcher(string);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
