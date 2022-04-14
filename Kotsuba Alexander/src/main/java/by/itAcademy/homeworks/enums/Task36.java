/*Написать метод, который выводит следующий сезон от заданного во входном параметре.
Входной параметр ввести с клавиатуры.*/
package by.itAcademy.homeworks.enums;

import java.util.Locale;
import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        System.out.println("Enter the name of the season: ");
        Scanner sc = new Scanner(System.in);
        nextM(sc.nextLine());
       // SeasonsNumberTwo.getNextSeason(season);
    }

    public static void nextM(String m){
        SeasonsNumberTwo seasons = SeasonsNumberTwo.valueOf(m.toUpperCase(Locale.ROOT));
        seasons.getNextSeason(seasons);
    }
}
