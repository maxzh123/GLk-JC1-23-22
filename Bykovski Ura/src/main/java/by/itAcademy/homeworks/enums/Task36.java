package by.itAcademy.homeworks.enums;

//Написать метод, который выводит следующий сезон от заданного во входном параметре. Входной параметр ввести с клавиатуры.

import java.util.Locale;
import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Seasons season=Seasons.valueOf(s.toUpperCase(Locale.ROOT));
        System.out.println("Next season:"+Seasons.getNextSeason(season));
    }
}
