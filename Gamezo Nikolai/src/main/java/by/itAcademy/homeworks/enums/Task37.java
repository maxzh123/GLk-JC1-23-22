package by.itAcademy.homeworks.enums;

import java.util.Scanner;

/**
 * Задание 37
 * Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
 * Входной параметр ввести с клавиатуры.
 */

public class Task37 {
    public static void main(String[] args) {
        System.out.print("Введите сезон: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str = str.toUpperCase();
        Seasons season = Seasons.valueOf(str);
        System.out.println("Дней в этом сезоне: " + season.getCountOfDays());
    }
}
