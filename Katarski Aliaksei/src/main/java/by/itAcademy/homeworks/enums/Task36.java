package by.itAcademy.homeworks.enums;

import java.util.Locale;
import java.util.Scanner;

/**
 *  Написать метод, который выводит следующий сезон от заданного во входном
 * > параметре. Входной параметр ввести с клавиатуры.
 */
public class Task36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        nextSeason(a);
    }
    public static void nextSeason(String currentSeason){
        Seasons seasons=Seasons.valueOf(currentSeason.toUpperCase(Locale.ROOT));
        System.out.println(Seasons.getNextSeason(seasons));
    }
}
