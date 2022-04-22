package by.itAcademy.homeworks.enums;

import java.util.Scanner;

public class Task37 {

    /**Task37
     * Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
     * Входной параметр ввести с клавиатуры.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи месяц");
        Seasons seasons = Seasons.valueOf(sc.nextLine().toUpperCase());
        System.out.println(seasons.getCountOfDays());
    }
}
