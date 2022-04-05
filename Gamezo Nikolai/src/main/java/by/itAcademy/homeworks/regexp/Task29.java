package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 29
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
 * записанных по правилам Java, с помощью регулярных выражений. Результат работы метода выведите на экран.
 */
public class Task29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scan.nextLine();
        System.out.print("Шестнадцатеричные числа: " + isHexadecimal(str));
    }
    public static String isHexadecimal(String str) {
        String str1 = "";
        Pattern p = Pattern.compile("0[xX][0-9A-Fa-f]{2}");
        Matcher m = p.matcher(str);
        for (int i = 0; m.find() == true; i++) {
            str1 = str1 + m.group() + " ";
        }
        return str1;
    }
}
