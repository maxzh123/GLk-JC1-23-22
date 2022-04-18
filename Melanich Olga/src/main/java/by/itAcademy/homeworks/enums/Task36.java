package by.itAcademy.homeworks.enums;

import java.util.Locale;
import java.util.Scanner;

/** Задание 36
 * Написать метод, который выводит следующий сезон от заданного во входном параметре. Входной параметр ввести с клавиатуры.
 */
public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a season: ");
        String season = scanner.next();
        Seasons season1 = Seasons.valueOf(season.toUpperCase());
        System.out.println(Seasons.getNextSeason(season1));
    }
}
