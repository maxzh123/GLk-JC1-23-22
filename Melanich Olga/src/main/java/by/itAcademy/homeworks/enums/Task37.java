package by.itAcademy.homeworks.enums;

import java.util.Scanner;

/** Задание 37
 * Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
 * Входной параметр ввести с клавиатуры.
 */

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a season: ");
        String season = scanner.next();
        Seasons season1 = Seasons.valueOf(season.toUpperCase());
        System.out.println(season1.getCountOfDays());
    }
}
