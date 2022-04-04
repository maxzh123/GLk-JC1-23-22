package by.itAcademy.homeworks.enums;

import java.util.Locale;
import java.util.Scanner;


/**
 * Написать метод, который выводит следующий сезон от заданного во входном
 * > параметре. Входной параметр ввести с клавиатуры.
 */
public class Task36 {
    public static void main(String[] args) {
        System.out.println("Введите сезон года: ");
        Scanner scanner = new Scanner(System.in);
        Seasons seasons = Seasons.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        seasons.nextMonth(seasons);
    }
}
