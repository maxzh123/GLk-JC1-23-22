package by.itAcademy.homeworks.enums;

import java.util.Locale;
import java.util.Scanner;

/**
 * > Написать метод, который выводит следующий сезон от заданного во входном
 * > параметре. Входной параметр ввести с клавиатуры.
 **/

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String season=scanner.nextLine();
        Season season1=Season.valueOf(season.toUpperCase(Locale.ROOT));
        System.out.println(Season.getNextSeason(season1));

    }
}
