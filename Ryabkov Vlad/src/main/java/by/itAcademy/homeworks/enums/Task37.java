package by.itAcademy.homeworks.enums;

import java.util.Locale;
import java.util.Scanner;

/**
 * Написать метод, который в зависимости от сезона, выводит на экран сумму
 *  дней в этом сезоне. Входной параметр ввести с клавиатуры.
 */
public class Task37 {
    public static void main(String[] args) {
        System.out.println("Введите сезон года : ");
        Scanner scanner = new Scanner(System.in);
        Seasons seasons = Seasons.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        System.out.println(seasons.getDaysCount());
    }
}
