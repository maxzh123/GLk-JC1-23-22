/*Введите с клавиатуры строку.
Найти в строке не только запятые, но и другие знаки препинания.
Подсчитать общее их количество.*/

package by.itAcademy.homeworks.regexp;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        String st = getLine();
        System.out.println("Число знаков препинания: " + getPunctuationMarks(st));
    }

    public static String getLine(){
        System.out.println("Введите предложение: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        return sentence;
    }

    public static int getPunctuationMarks(String sentence){
        Pattern pattern = Pattern.compile("[.,\\\"\\\\?!:;']");
        Matcher matcher = pattern.matcher(sentence);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        return count;
    }
}
