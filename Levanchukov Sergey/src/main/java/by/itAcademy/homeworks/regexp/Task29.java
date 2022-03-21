package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * > Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * > шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных
 * > выражений. Результат работы метода выведите на экран.
 *
 * 0[xX][0-9]+[a-fA-F]*/

public class Task29 {
    public static void main(String[] args) {
        searchEngineForHexadecimalValues();
    }

    public static void searchEngineForHexadecimalValues(){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        Pattern searchHexadecimal= Pattern.compile("(0[xX][0-9]+[a-fA-F])");
        Matcher search=searchHexadecimal.matcher(text);
        while (search.find()){
            System.out.println(search.group(0));
        }
    }
}
