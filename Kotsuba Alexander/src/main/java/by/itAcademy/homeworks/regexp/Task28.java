/*Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.*/

package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        String line = getLine();
        System.out.println("Текст: " + getLast(line));
    }

    public static String getLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String line = sc.nextLine();
        return line;
    }

    public static StringBuilder getLast(String line){
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = pattern.matcher(line);
        StringBuilder res = new StringBuilder();
        while(matcher.find()){
            res.append(line.substring(matcher.end() - 1, matcher.end()));
        }
        return res;
    }
}
