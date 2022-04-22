package by.itAcademy.homeworks.regexp;

//Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(getcount(s));
    }

    public static int getcount(String s){
        int count=0;
        Pattern p=Pattern.compile("[!?]+|[.]{3}|[,.?!;:\"'-]");
        Matcher m=p.matcher(s);
        while (m.find()){
            count++;
        }
        return count;
    }
}
