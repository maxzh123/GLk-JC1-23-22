package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.*/

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        Pattern p = Pattern.compile("\\w\\b");
        Matcher m = p.matcher(str);
        while (m.find()){
            str1+= m.group();
        }
        System.out.println(str1);
    }
}
