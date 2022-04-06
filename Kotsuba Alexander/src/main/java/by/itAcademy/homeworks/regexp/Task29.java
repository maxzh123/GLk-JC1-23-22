/*Введите с клавиатуры строку.
Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
записанных по правилам Java, с помощью регулярных выражений.
Результат работы метода выведите на экран.*/

package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String line = sc.nextLine();
        str(line);
    }



    private static void str(String line) {
        Pattern pattern = Pattern.compile("0x([A-Fa-f0-9]{1,4})");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
