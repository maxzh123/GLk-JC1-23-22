package by.itAcademy.homeworks.enums;

import java.util.Scanner;

/**
 * Задание 36
 * Написать метод, который выводит следующий сезон от заданного во входном параметре. Входной параметр ввести с клавиатуры.
 */
public class Task36 {
    public static void main(String[] args) {
        System.out.print("Введите сезон: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str = str.toUpperCase();
        Seasons season = Seasons.valueOf(str);
        System.out.println("Следующий сезон: " + Seasons.nextSeason(season));
    }
}
