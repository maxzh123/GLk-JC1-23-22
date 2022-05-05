package by.itAcademy.homeworks.enums;

//Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
//Входной параметр ввести с клавиатуры.

import java.util.Locale;
import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Seasons season=Seasons.valueOf(s.toUpperCase(Locale.ROOT));
        System.out.println(season.countOfDays);
    }
}
